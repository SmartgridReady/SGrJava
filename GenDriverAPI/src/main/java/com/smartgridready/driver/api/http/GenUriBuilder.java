package com.smartgridready.driver.api.http;

import java.net.URI;
import java.net.URISyntaxException;

public interface GenUriBuilder {

    public GenUriBuilder setQueryString(String queryString);

    public GenUriBuilder addPath(String path);

    public GenUriBuilder addQueryParameter(String name, String value);

    public URI build() throws URISyntaxException;
}
