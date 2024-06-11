package communicator.rest.http.client;

import java.util.Map;
import java.util.HashMap;

import org.apache.hc.core5.http.NameValuePair;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class ApacheRestServiceClientTest {

    @Test
	void testFormDataFromBodySuccessNoParams() {

        final String body = "";
        final Iterable<NameValuePair> params = ApacheRestServiceClient.getFormParameters(body);
        final Map<String, String> paramMap = toMap(params);

        assertEquals(0, paramMap.size());
    }

    @Test
	void testFormDataFromBodySuccessOneParam() {

        final String body = "number=123";
        final Iterable<NameValuePair> params = ApacheRestServiceClient.getFormParameters(body);
        final Map<String, String> paramMap = toMap(params);

        assertEquals(1, paramMap.size());
        assertNotNull(paramMap.get("number"));
        assertEquals("123", paramMap.get("number"));
    }

    @Test
	void testFormDataFromBodySuccessOneParamMultipleAssignmentOperators() {

        final String body = "value=123=3=4";
        final Iterable<NameValuePair> params = ApacheRestServiceClient.getFormParameters(body);
        final Map<String, String> paramMap = toMap(params);

        assertEquals(1, paramMap.size());
        assertNotNull(paramMap.get("value"));
        assertEquals("123=3=4", paramMap.get("value"));
    }

    @Test
	void testFormDataFromBodySuccessMultipleParams() {

        final String body = "number=123&text=hello";
        final Iterable<NameValuePair> params = ApacheRestServiceClient.getFormParameters(body);
        final Map<String, String> paramMap = toMap(params);

        assertEquals(2, paramMap.size());
        assertNotNull(paramMap.get("number"));
        assertEquals("123", paramMap.get("number"));
        assertNotNull(paramMap.get("text"));
        assertEquals("hello", paramMap.get("text"));
    }

    @Test
	void testFormDataFromBodySuccessEmptyValue() {

        final String body = "value=123&novalue=";
        final Iterable<NameValuePair> params = ApacheRestServiceClient.getFormParameters(body);
        final Map<String, String> paramMap = toMap(params);

        assertEquals(2, paramMap.size());
        assertNotNull(paramMap.get("value"));
        assertEquals("123", paramMap.get("value"));
        assertNotNull(paramMap.get("novalue"));
        assertEquals("", paramMap.get("novalue"));
    }

    @Test
	void testFormDataFromBodyFailNoValue() {

        final String body = "novalue&novalue2";
        final Iterable<NameValuePair> params = ApacheRestServiceClient.getFormParameters(body);
        final Map<String, String> paramMap = toMap(params);

        assertEquals(0, paramMap.size());
    }

    // TODO not sure if this case must be supported
    @Test
	void testFormDataFromBodyFailExtraAnd() {

        final String body = "value=abcd&ef&value2=abcd";
        final Iterable<NameValuePair> params = ApacheRestServiceClient.getFormParameters(body);
        final Map<String, String> paramMap = toMap(params);

        assertEquals(2, paramMap.size());
        assertNotNull(paramMap.get("value"));
        assertNotEquals("abcd&ef", paramMap.get("value"));
        assertNotNull(paramMap.get("value2"));
        assertEquals("abcd", paramMap.get("value2"));
    }

    private static Map<String, String> toMap(Iterable<NameValuePair> params) {
        Map<String, String> map = new HashMap<>();
        for (NameValuePair kv: params) {
            map.put(kv.getName(), kv.getValue());
        }
        return map;
    }
}
