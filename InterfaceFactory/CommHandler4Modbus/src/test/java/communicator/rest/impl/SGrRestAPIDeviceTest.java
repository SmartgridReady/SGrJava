package communicator.rest.impl;

import com.smartgridready.ns.v0.DeviceFrame;
import com.smartgridready.ns.v0.ResponseQuery;
import com.smartgridready.ns.v0.RestApiServiceCall;
import com.smartgridready.ns.v0.V0Factory;
import communicator.common.api.values.Float32Value;
import communicator.common.api.values.Float64Value;
import communicator.common.api.values.Int32UValue;
import communicator.common.api.values.StringValue;
import communicator.common.api.values.Value;
import communicator.common.helper.DeviceDescriptionLoader;
import communicator.common.runtime.GenDriverException;
import communicator.rest.api.GenDeviceApi4Rest;
import communicator.rest.http.client.ApacheRestServiceClientFactory;
import communicator.rest.http.client.RestServiceClient;
import communicator.rest.http.client.RestServiceClientFactory;
import io.vavr.control.Either;
import org.apache.hc.client5.http.fluent.Content;
import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.fluent.Response;
import org.apache.hc.core5.http.*;
import org.apache.hc.core5.http.message.BasicClassicHttpResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.Properties;
import java.util.stream.Stream;

import static org.apache.hc.core5.http.HttpStatus.SC_OK;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(value = MockitoExtension.class)
class SGrRestAPIDeviceTest {

	private static final Logger LOG = LoggerFactory.getLogger(SGrRestAPIDeviceTest.class);

	@Mock
	RestServiceClientFactory restServiceClientFactory;

	@Mock
	RestServiceClient restServiceClient;
	
	@Mock
	RestServiceClient restServiceClientAuth;
	
	@Mock
	RestServiceClient restServiceClientReq;

	@Mock
	RestApiServiceCall restServiceCall;

	@Mock
 	Request httpClientRequest;

	@Mock
	Response response;

	@Mock
 	ClassicHttpResponse httpResponse;

	@Mock
	HttpEntity httpEntity;

	ArgumentCaptor<String> stringCaptor1 = ArgumentCaptor.forClass(String.class);
	ArgumentCaptor<String> stringCaptor2 = ArgumentCaptor.forClass(String.class);

	ArgumentCaptor<Properties> propertiesCaptor = ArgumentCaptor.forClass(Properties.class);
	
	static DeviceFrame deviceFrame;
			
	private static final String CLEMAP_AUTH_RESP = "{\r\n"
			+ "    \"accessToken\": \"eyJhbGciOiJIUzI1NiIsInR5cCI6ImFjY2VzcyJ9.eyJ1c2VySWQiOiI2MzM0MzI5MWVjZjJjZjAxM2ExZTVhOWQiLCJpYXQiOjE2NjgwOTI1NzMsImV4cCI6MTY2ODE3ODk3MywiYXVkIjoiaHR0cHM6Ly95b3VyZG9tYWluLmNvbSIsImlzcyI6ImZlYXRoZXJzIiwic3ViIjoiNjMzNDMyOTFlY2YyY2YwMTNhMWU1YTlkIiwianRpIjoiNTU2NmU2M2QtNTVmOC00MDEyLWJlYTUtOTJjYWE0NDIwYzQ3In0.xVOrspfi1E61Jb0BXBt37wgqGcnkPueMcHh1_zI-xXM\",\r\n"
			+ "    \"user\": {\r\n"
			+ "        \"_id\": \"63343291ecf2cf013a1e5a9d\",\r\n"
			+ "        \"email\": \"hfurrer@ergonomics.ch\",\r\n"
			+ "        \"groups\": [\r\n"
			+ "            \"owner_smartgrid\",\r\n"
			+ "            \"owner_smartfactory\"\r\n"
			+ "        ],\r\n"
			+ "        \"roles\": [\r\n"
			+ "            \"default\"\r\n"
			+ "        ]\r\n"
			+ "    }\r\n"
			+ "}";
	
	private static final String CLEMAP_METER_RESP = "[{\"sensor_id\":\"63343431ecf2cf013a1e5a9f\",\"opm\":{\"value\":1,\"last_updt\":\"2022-11-07T15:19:54.560Z\"},\"ten_sec\":{\"p_l1\":1.5,\"p_l2\":2,\"p_l3\":4.0,\"q_l1\":2.3,\"q_l2\":0,\"q_l3\":4,\"last_upd\":\"2022-11-07T15:21:50.000Z\"},\"one_min\":{\"p_l1\":0.003,\"p_l2\":0,\"p_l3\":0,\"q_l1\":-0.002,\"q_l2\":0,\"q_l3\":0,\"avg_energy_l1\":0,\"avg_energy_l2\":0,\"avg_energy_l3\":0,\"v_l1\":227.869,\"v_l2\":0,\"v_l3\":0,\"i_l1\":0.001,\"i_l2\":0,\"i_l3\":0,\"s_l1\":0.173,\"s_l2\":0,\"s_l3\":0,\"pf_l1\":0.085,\"pf_l2\":1,\"pf_l3\":1,\"last_update\":\"2022-11-07T15:19:47.579Z\"}}]";

	
	@BeforeAll
	static void initDeviceFrame() {
		deviceFrame = createSGrRestAPIDeviceFrame();
	}
	
	
	@Test
	void testGetValSuccessWithBearerAuthentication() throws Exception {

		// given
		when(restServiceClientFactory.create( any(String.class), any(RestApiServiceCall.class))).thenReturn(restServiceClientAuth);
		when(restServiceClientFactory.create( any(String.class), any(RestApiServiceCall.class), any(Properties.class))).thenReturn(restServiceClientReq);

		when(restServiceClientAuth.getRestServiceCall()).thenReturn(deviceFrame.getInterfaceList().getRestApiInterface().getRestApiInterfaceDescription().getRestApiBearer().getRestApiServiceCall());
		when(restServiceClientAuth.callService()).thenReturn(Either.right(CLEMAP_AUTH_RESP));

		when(restServiceClientReq.callService()).thenReturn(Either.right(CLEMAP_METER_RESP));
		
		// when
		GenDeviceApi4Rest device = new SGrRestApiDevice(deviceFrame, restServiceClientFactory);
		device.connect();
		Value res = device.getVal("ActivePowerAC", "ActivePowerACtot");
		
		// then		
		assertEquals("0.0075", String.format("%.4f",res.getFloat32()));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	void testGetValSuccessWithTokenRenewal() throws Exception {
		
		// given					
		when(restServiceClientFactory.create( any(String.class), any(RestApiServiceCall.class))).thenReturn(restServiceClientAuth);
		when(restServiceClientFactory.create( any(String.class), any(RestApiServiceCall.class), any(Properties.class))).thenReturn(restServiceClientReq);

		when(restServiceClientAuth.getRestServiceCall()).thenReturn(
				deviceFrame.getInterfaceList().getRestApiInterface().getRestApiInterfaceDescription().getRestApiBearer().getRestApiServiceCall());
		when(restServiceClientAuth.callService()).thenReturn(Either.right(CLEMAP_AUTH_RESP));

		when(restServiceClientReq.callService()).thenReturn(Either.left( 
				new BasicClassicHttpResponse(401, "Needs token renewal.")),
				Either.right(CLEMAP_METER_RESP));
		
		// when
		SGrRestApiDevice device = new SGrRestApiDevice(deviceFrame, restServiceClientFactory);
		device.connect();
		Value res = device.getVal("ActivePowerAC", "ActivePowerACtot");
		
		// then		
		assertEquals("0.0075", String.format("%.4f", res.getFloat32()));
		
	}

	@ParameterizedTest
	@ValueSource(strings = {"ContactR","ContactRW"})
	void testGetValSuccessWithReadServiceCallV2(String dataPointName) throws Exception {

		// given
		when(restServiceClientFactory.create( any(String.class), any(RestApiServiceCall.class))).thenReturn(restServiceClientAuth);
		when(restServiceClientFactory.create( any(String.class), any(RestApiServiceCall.class), any(Properties.class))).thenReturn(restServiceClientReq);

		when(restServiceClientAuth.getRestServiceCall()).thenReturn(deviceFrame.getInterfaceList().getRestApiInterface().getRestApiInterfaceDescription().getRestApiBearer().getRestApiServiceCall());
		when(restServiceClientAuth.callService()).thenReturn(Either.right(CLEMAP_AUTH_RESP));

		when(restServiceClientReq.callService()).thenReturn(Either.right("{ \"value\" : \"on\" }"));

		// when
		GenDeviceApi4Rest device = new SGrRestApiDevice(deviceFrame, restServiceClientFactory);
		device.authenticate();
		Value res = device.getVal("GPIO", dataPointName);

		// then
		assertEquals("on", res.getString());
	}

	@Test
	void testSetVal() throws Exception {
		
		// given					
		when(restServiceClientFactory.create( any(String.class), any(RestApiServiceCall.class))).thenReturn(restServiceClientAuth);
		when(restServiceClientFactory.create( any(String.class), any(RestApiServiceCall.class), any(Properties.class))).thenReturn(restServiceClientReq);

		when(restServiceClientAuth.getRestServiceCall()).thenReturn(
				deviceFrame.getInterfaceList().getRestApiInterface().getRestApiInterfaceDescription().getRestApiBearer().getRestApiServiceCall());
		when(restServiceClientAuth.callService()).thenReturn(Either.right(CLEMAP_AUTH_RESP));		
		when(restServiceClientReq.callService()).thenReturn(Either.right("OK"));
		
		// when
		SGrRestApiDevice device = new SGrRestApiDevice(deviceFrame, restServiceClientFactory);
		device.connect();

		assertDoesNotThrow(() -> device.setVal("ActivePowerAC", "ActivePowerACtot", Int32UValue.of(100)));
	}

	@ParameterizedTest
	@ValueSource(strings = {"ContactW", "ContactRW"})
	void testSetValWithWriteServiceCallV2(String dataPointName) throws Exception {

		try (MockedStatic<Request> httpClient =  Mockito.mockStatic(Request.class)) {
			httpClient.when(() -> Request.post(anyString())).thenReturn(httpClientRequest);
			when(httpClientRequest.execute()).thenReturn(response);
			when(response.returnResponse()).thenReturn(httpResponse);
			when(httpResponse.getCode()).thenReturn(SC_OK);
			when((httpResponse).getEntity()).thenReturn(httpEntity);
			when(httpEntity.getContent())
					.thenReturn(new Content("".getBytes(StandardCharsets.UTF_8), ContentType.TEXT_PLAIN).asStream());

			// when
			SGrRestApiDevice device = new SGrRestApiDevice(deviceFrame, new ApacheRestServiceClientFactory());
			device.authenticate();

			assertDoesNotThrow(() -> device.setVal("GPIO", dataPointName, StringValue.of("on")));

			verify(httpClientRequest, times(3)).addHeader(stringCaptor1.capture(), stringCaptor2.capture());
			var headerKeys = stringCaptor1.getAllValues();
			assertEquals("Accept", headerKeys.get(0));
			assertEquals("Accept", headerKeys.get(1));
			assertEquals("Authorization", headerKeys.get(2));

			var headerValues = stringCaptor2.getAllValues();
			assertEquals("application/json", headerValues.get(0));
			assertEquals("application/json", headerValues.get(1));
			assertEquals("Bearer null", headerValues.get(2));

			verify(httpClientRequest, times(3)).bodyString(stringCaptor1.capture(), any());
			assertEquals(
					String.format("{ \"pin\" : %d, \"value\" : \"on\" }", "ContactW".equals(dataPointName) ? 1 : 2),
					stringCaptor1.getValue()
			);
		}
	}

	@ParameterizedTest
	@CsvSource({
			"0.004, Values [0.004] out of range. MIN value=0.005",
			"101, Values [101] out of range. MAX value=100.0"})
	void testSetValOutOfRange(String value, String expectedResponse) throws Exception {

		// given
		when(restServiceClientFactory.create( any(String.class), any(RestApiServiceCall.class))).thenReturn(restServiceClientAuth);

		when(restServiceClientAuth.getRestServiceCall()).thenReturn(
				deviceFrame.getInterfaceList().getRestApiInterface().getRestApiInterfaceDescription().getRestApiBearer().getRestApiServiceCall());
		when(restServiceClientAuth.callService()).thenReturn(Either.right(CLEMAP_AUTH_RESP));

		SGrRestApiDevice device = new SGrRestApiDevice(deviceFrame, restServiceClientFactory);
		device.connect();

		Exception exception = assertThrows(GenDriverException.class, () -> device.setVal("ActivePowerAC", "ActivePowerACtot", StringValue.of(value)));
		assertEquals(expectedResponse, exception.getMessage());
	}


	private static Stream<Arguments> rwPermissionChecks() {

		// VoltageL1 = R, VoltageL2 = W, VoltageL3 = RW
		return Stream.of(
				Arguments.of("write on RW DP", "ActivePowerACL1", true,  null),
				Arguments.of("write on R  DP", "ActivePowerACL2", true,  "Operation WRITE not allowed on datapoint ActivePowerACL2"),
				Arguments.of("write on W  DP", "ActivePowerACL3", true,  null),
				Arguments.of("read  on RW DP", "ActivePowerACL1", false, null),
				Arguments.of("read  on R  DP", "ActivePowerACL2", false, null),
				Arguments.of("read  on W  DP", "ActivePowerACL3", false, "Operation READ not allowed on datapoint ActivePowerACL3")
		);
	}

	@ParameterizedTest
	@MethodSource("rwPermissionChecks")
	void writePermissionCheckRest(String testName, String dataPointName, boolean isWrite, String expectedErrorMsg) throws Exception {

		LOG.info("Testing writePermissionCheckRest: {}", testName);

		SGrRestApiDevice restApiDevice = new SGrRestApiDevice(deviceFrame, restServiceClientFactory);

		Mockito.lenient().when(restServiceClientFactory.create(any(), any())).thenReturn(restServiceClient);
		Mockito.lenient().when(restServiceClientFactory.create(any(), any(), any())).thenReturn(restServiceClient);
		Mockito.lenient().when(restServiceClient.callService()).thenReturn(Either.right("{}"));
		Mockito.lenient().when(restServiceClient.getRestServiceCall()).thenReturn(restServiceCall);

		ResponseQuery query = V0Factory.eINSTANCE.createResponseQuery();
		query.setQuery("token");
		Mockito.lenient().when(restServiceCall.getResponseQuery()).thenReturn(query);

		if (expectedErrorMsg == null) {
			if(isWrite) {
				assertDoesNotThrow(() -> restApiDevice.setVal("ActivePowerAC", dataPointName, Float32Value.of(380)));
			} else {
				assertDoesNotThrow(() -> restApiDevice.getVal("ActivePowerAC", dataPointName));
			}
		} else {
			GenDriverException e = isWrite ?
					assertThrows(GenDriverException.class, () -> restApiDevice.setVal("ActivePowerAC", dataPointName, Float64Value.of(380)))
					: assertThrows(GenDriverException.class, () -> restApiDevice.getVal("ActivePowerAC", dataPointName));
			assertEquals(expectedErrorMsg, e.getMessage());
		}
	}

	@Test
	void unitConversion() throws Exception {

		SGrRestApiDevice restApiDevice = new SGrRestApiDevice(deviceFrame, restServiceClientFactory);

		Mockito.lenient().when(restServiceClientFactory.create(any(), any())).thenReturn(restServiceClient);
		Mockito.lenient().when(restServiceClientFactory.create(any(), any(), any())).thenReturn(restServiceClient);
		Mockito.lenient().when(restServiceClient.callService()).thenReturn(Either.right("{}"));
		Mockito.lenient().when(restServiceClient.getRestServiceCall()).thenReturn(restServiceCall);

		ResponseQuery query = V0Factory.eINSTANCE.createResponseQuery();
		query.setQuery("token");
		Mockito.lenient().when(restServiceCall.getResponseQuery()).thenReturn(query);

		restApiDevice.setVal("ActivePowerAC", "ActivePowerACtot", Float32Value.of(0.099f));

		verify(restServiceClientFactory).create(any(), any(), propertiesCaptor.capture());
		assertEquals(99,
				Math.round(
						Float.parseFloat(String.valueOf(propertiesCaptor.getValue().get("value")))));
	}


	private static DeviceFrame createSGrRestAPIDeviceFrame() {
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		URL devDescUrl = classloader.getResource("SGr_04_0018_CLEMAP_EIcloudEnergyMonitorV0.2.1.xml");

		var properties = new Properties();
		properties.put("baseUri", "https://clemap.io");

		DeviceDescriptionLoader loader = new DeviceDescriptionLoader();
		return loader.load("", Optional.ofNullable(devDescUrl).map(URL::getPath).orElse(""), properties);
	}
}
