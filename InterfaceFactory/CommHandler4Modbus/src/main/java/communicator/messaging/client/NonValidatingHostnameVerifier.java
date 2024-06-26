package communicator.messaging.client;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/**
 * A dummy implementation of a host name verifier.
 */
class NonValidatingHostnameVerifier implements HostnameVerifier {

    private static final HostnameVerifier instance = new NonValidatingHostnameVerifier();

    public static HostnameVerifier getInstance() {
        return instance;
    }

    private NonValidatingHostnameVerifier() {}

    @Override
    public boolean verify(String hostname, SSLSession session) {
        return true;
    }
}
