package com.ontotext.trree.plugin.externalsync.auth.impl;

import com.ontotext.trree.plugin.externalsync.auth.HttpClientConfigurator;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;

public class CustomCredentialsProvider implements HttpClientConfigurator {

    @Override
    public CredentialsProvider getCredentialsProvider(String url, String instanceId) {

        CredentialsProvider provider = new CredentialsProvider() {
            @Override
            public void setCredentials(AuthScope authScope, Credentials credentials) {

                //todo implement if necessary

            }

            @Override
            public Credentials getCredentials(AuthScope authScope) {

                //todo implement custom logic for credentials acquisition

                return null;
            }

            @Override
            public void clear() {

                //todo implement if necessary

            }
        };

        return provider;
    }

    /**
     * Whether to disable the authentication cache in the HTTP client. The default implementation does not disable it.
     *
     * @param url        the URL of the remote server as provided in the connector definition
     * @param instanceId the ID of the connector instance
     * @return true (disable the authentication cache) or false (do not disable it)
     */
    @Override
    public boolean shouldDisableAuthCaching(String url, String instanceId) {
        return false;
    }

    @Override
    public HttpRequestInterceptor getHttpRequestInterceptor(String url, String instanceId) {
        return null;
    }
}
