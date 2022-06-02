/**
 */
package ch.smartgridready.sgr.ns.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SGr Rest API Authentication Enum Method Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.smartgridready.sgr.ns.v0.V0Package#getSGrRestAPIAuthenticationEnumMethodType()
 * @model extendedMetaData="name='SGrRestAPIAuthenticationEnumMethodType'"
 * @generated
 */
public enum SGrRestAPIAuthenticationEnumMethodType implements Enumerator {
	/**
	 * The '<em><b>No Security Scheme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SECURITY_SCHEME_VALUE
	 * @generated
	 * @ordered
	 */
	NO_SECURITY_SCHEME(0, "NoSecurityScheme", "NoSecurityScheme"),

	/**
	 * The '<em><b>Bearer Security Scheme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEARER_SECURITY_SCHEME_VALUE
	 * @generated
	 * @ordered
	 */
	BEARER_SECURITY_SCHEME(1, "BearerSecurityScheme", "BearerSecurityScheme"),

	/**
	 * The '<em><b>API Key Security Scheme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #API_KEY_SECURITY_SCHEME_VALUE
	 * @generated
	 * @ordered
	 */
	API_KEY_SECURITY_SCHEME(2, "APIKeySecurityScheme", "APIKeySecurityScheme"),

	/**
	 * The '<em><b>Basic Security Scheme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_SECURITY_SCHEME_VALUE
	 * @generated
	 * @ordered
	 */
	BASIC_SECURITY_SCHEME(3, "BasicSecurityScheme", "BasicSecurityScheme"),

	/**
	 * The '<em><b>Digest Security Scheme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGEST_SECURITY_SCHEME_VALUE
	 * @generated
	 * @ordered
	 */
	DIGEST_SECURITY_SCHEME(4, "DigestSecurityScheme", "DigestSecurityScheme"),

	/**
	 * The '<em><b>PSK Security Scheme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PSK_SECURITY_SCHEME_VALUE
	 * @generated
	 * @ordered
	 */
	PSK_SECURITY_SCHEME(5, "PSKSecurityScheme", "PSKSecurityScheme"),

	/**
	 * The '<em><b>OAuth1 Security Scheme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OAUTH1_SECURITY_SCHEME_VALUE
	 * @generated
	 * @ordered
	 */
	OAUTH1_SECURITY_SCHEME(6, "OAuth1SecurityScheme", "OAuth1SecurityScheme"),

	/**
	 * The '<em><b>OAuth2 Security Scheme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OAUTH2_SECURITY_SCHEME_VALUE
	 * @generated
	 * @ordered
	 */
	OAUTH2_SECURITY_SCHEME(7, "OAuth2SecurityScheme", "OAuth2SecurityScheme"),

	/**
	 * The '<em><b>Hawk Security Scheme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAWK_SECURITY_SCHEME_VALUE
	 * @generated
	 * @ordered
	 */
	HAWK_SECURITY_SCHEME(8, "HawkSecurityScheme", "HawkSecurityScheme"),

	/**
	 * The '<em><b>AWS Signature Security Scheme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AWS_SIGNATURE_SECURITY_SCHEME_VALUE
	 * @generated
	 * @ordered
	 */
	AWS_SIGNATURE_SECURITY_SCHEME(9, "AWSSignatureSecurityScheme", "AWS_SignatureSecurityScheme"),

	/**
	 * The '<em><b>NTLM Security Scheme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NTLM_SECURITY_SCHEME_VALUE
	 * @generated
	 * @ordered
	 */
	NTLM_SECURITY_SCHEME(10, "NTLMSecurityScheme", "NTLMSecurityScheme"),

	/**
	 * The '<em><b>Akamai Edge Grid Security Scheme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AKAMAI_EDGE_GRID_SECURITY_SCHEME_VALUE
	 * @generated
	 * @ordered
	 */
	AKAMAI_EDGE_GRID_SECURITY_SCHEME(11, "AkamaiEdgeGridSecurityScheme", "AkamaiEdgeGridSecurityScheme");

	/**
	 * The '<em><b>No Security Scheme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SECURITY_SCHEME
	 * @model name="NoSecurityScheme"
	 * @generated
	 * @ordered
	 */
	public static final int NO_SECURITY_SCHEME_VALUE = 0;

	/**
	 * The '<em><b>Bearer Security Scheme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEARER_SECURITY_SCHEME
	 * @model name="BearerSecurityScheme"
	 * @generated
	 * @ordered
	 */
	public static final int BEARER_SECURITY_SCHEME_VALUE = 1;

	/**
	 * The '<em><b>API Key Security Scheme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #API_KEY_SECURITY_SCHEME
	 * @model name="APIKeySecurityScheme"
	 * @generated
	 * @ordered
	 */
	public static final int API_KEY_SECURITY_SCHEME_VALUE = 2;

	/**
	 * The '<em><b>Basic Security Scheme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_SECURITY_SCHEME
	 * @model name="BasicSecurityScheme"
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_SECURITY_SCHEME_VALUE = 3;

	/**
	 * The '<em><b>Digest Security Scheme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGEST_SECURITY_SCHEME
	 * @model name="DigestSecurityScheme"
	 * @generated
	 * @ordered
	 */
	public static final int DIGEST_SECURITY_SCHEME_VALUE = 4;

	/**
	 * The '<em><b>PSK Security Scheme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PSK_SECURITY_SCHEME
	 * @model name="PSKSecurityScheme"
	 * @generated
	 * @ordered
	 */
	public static final int PSK_SECURITY_SCHEME_VALUE = 5;

	/**
	 * The '<em><b>OAuth1 Security Scheme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OAUTH1_SECURITY_SCHEME
	 * @model name="OAuth1SecurityScheme"
	 * @generated
	 * @ordered
	 */
	public static final int OAUTH1_SECURITY_SCHEME_VALUE = 6;

	/**
	 * The '<em><b>OAuth2 Security Scheme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OAUTH2_SECURITY_SCHEME
	 * @model name="OAuth2SecurityScheme"
	 * @generated
	 * @ordered
	 */
	public static final int OAUTH2_SECURITY_SCHEME_VALUE = 7;

	/**
	 * The '<em><b>Hawk Security Scheme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAWK_SECURITY_SCHEME
	 * @model name="HawkSecurityScheme"
	 * @generated
	 * @ordered
	 */
	public static final int HAWK_SECURITY_SCHEME_VALUE = 8;

	/**
	 * The '<em><b>AWS Signature Security Scheme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AWS_SIGNATURE_SECURITY_SCHEME
	 * @model name="AWSSignatureSecurityScheme" literal="AWS_SignatureSecurityScheme"
	 * @generated
	 * @ordered
	 */
	public static final int AWS_SIGNATURE_SECURITY_SCHEME_VALUE = 9;

	/**
	 * The '<em><b>NTLM Security Scheme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NTLM_SECURITY_SCHEME
	 * @model name="NTLMSecurityScheme"
	 * @generated
	 * @ordered
	 */
	public static final int NTLM_SECURITY_SCHEME_VALUE = 10;

	/**
	 * The '<em><b>Akamai Edge Grid Security Scheme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AKAMAI_EDGE_GRID_SECURITY_SCHEME
	 * @model name="AkamaiEdgeGridSecurityScheme"
	 * @generated
	 * @ordered
	 */
	public static final int AKAMAI_EDGE_GRID_SECURITY_SCHEME_VALUE = 11;

	/**
	 * An array of all the '<em><b>SGr Rest API Authentication Enum Method Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SGrRestAPIAuthenticationEnumMethodType[] VALUES_ARRAY =
		new SGrRestAPIAuthenticationEnumMethodType[] {
			NO_SECURITY_SCHEME,
			BEARER_SECURITY_SCHEME,
			API_KEY_SECURITY_SCHEME,
			BASIC_SECURITY_SCHEME,
			DIGEST_SECURITY_SCHEME,
			PSK_SECURITY_SCHEME,
			OAUTH1_SECURITY_SCHEME,
			OAUTH2_SECURITY_SCHEME,
			HAWK_SECURITY_SCHEME,
			AWS_SIGNATURE_SECURITY_SCHEME,
			NTLM_SECURITY_SCHEME,
			AKAMAI_EDGE_GRID_SECURITY_SCHEME,
		};

	/**
	 * A public read-only list of all the '<em><b>SGr Rest API Authentication Enum Method Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SGrRestAPIAuthenticationEnumMethodType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SGr Rest API Authentication Enum Method Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrRestAPIAuthenticationEnumMethodType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrRestAPIAuthenticationEnumMethodType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Rest API Authentication Enum Method Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrRestAPIAuthenticationEnumMethodType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SGrRestAPIAuthenticationEnumMethodType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SGr Rest API Authentication Enum Method Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SGrRestAPIAuthenticationEnumMethodType get(int value) {
		switch (value) {
			case NO_SECURITY_SCHEME_VALUE: return NO_SECURITY_SCHEME;
			case BEARER_SECURITY_SCHEME_VALUE: return BEARER_SECURITY_SCHEME;
			case API_KEY_SECURITY_SCHEME_VALUE: return API_KEY_SECURITY_SCHEME;
			case BASIC_SECURITY_SCHEME_VALUE: return BASIC_SECURITY_SCHEME;
			case DIGEST_SECURITY_SCHEME_VALUE: return DIGEST_SECURITY_SCHEME;
			case PSK_SECURITY_SCHEME_VALUE: return PSK_SECURITY_SCHEME;
			case OAUTH1_SECURITY_SCHEME_VALUE: return OAUTH1_SECURITY_SCHEME;
			case OAUTH2_SECURITY_SCHEME_VALUE: return OAUTH2_SECURITY_SCHEME;
			case HAWK_SECURITY_SCHEME_VALUE: return HAWK_SECURITY_SCHEME;
			case AWS_SIGNATURE_SECURITY_SCHEME_VALUE: return AWS_SIGNATURE_SECURITY_SCHEME;
			case NTLM_SECURITY_SCHEME_VALUE: return NTLM_SECURITY_SCHEME;
			case AKAMAI_EDGE_GRID_SECURITY_SCHEME_VALUE: return AKAMAI_EDGE_GRID_SECURITY_SCHEME;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SGrRestAPIAuthenticationEnumMethodType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SGrRestAPIAuthenticationEnumMethodType
