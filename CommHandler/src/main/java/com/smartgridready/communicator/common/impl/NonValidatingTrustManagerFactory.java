package com.smartgridready.communicator.common.impl;

import java.security.KeyStore;

import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.TrustManagerFactorySpi;

/**
 * A trust manager factory which provides a trust manager that ignores certificate validity.
 */
public class NonValidatingTrustManagerFactory extends TrustManagerFactory {

    private static final TrustManager[] trustManagers = new TrustManager[] { new NonValidatingTrustManager() };
    private static final TrustManagerFactory instance = new NonValidatingTrustManagerFactory();

    public static TrustManagerFactory getInstance() {
        return instance;
    }

    private NonValidatingTrustManagerFactory() {
        super(new NonValidatingTrustManagerFactorySpi(), null, TrustManagerFactory.getDefaultAlgorithm());
    }

    private static class NonValidatingTrustManagerFactorySpi extends TrustManagerFactorySpi {

        @Override
        protected void engineInit(KeyStore ks)  {
            // nothing
        }

        @Override
        protected void engineInit(ManagerFactoryParameters spec) {
            // nothing
        }

        @Override
        protected TrustManager[] engineGetTrustManagers() {
            return trustManagers;
        }
    }
}