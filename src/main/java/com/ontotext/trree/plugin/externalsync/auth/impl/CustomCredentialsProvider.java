package com.ontotext.trree.plugin.externalsync.auth.impl;

import com.ontotext.trree.plugin.externalsync.auth.HttpClientConfigurator;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;

public class CustomCredentialsProvider implements HttpClientConfigurator {

    @Override
    public CredentialsProvider getCredentialsProvider(String url, String instanceId) {

        String username = getUsername(url, instanceId);
        String password = getPassword(url, instanceId);

        // You can create custom class implementing org.apache.http.client.CredentialsProvider
        CredentialsProvider provider = new BasicCredentialsProvider();
        provider.setCredentials(AuthScope.ANY,
                new UsernamePasswordCredentials(username, password));

        return provider;
    }

    private String getUsername(String url, String instanceId) {

        //todo implement
        throw new RuntimeException("not implemented");

    }

    private String getPassword(String url, String instanceId) {

        //todo implement
        throw new RuntimeException("not implemented");

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
