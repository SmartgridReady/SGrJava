package com.smartgridready.driver.api.http;

public class GenHttpResponse {

    final private String response;
    final private int responseCode;
    final private String reason;

    private GenHttpResponse(String response, int responseCode, String reason) {
        this.response = response;
        this.responseCode = responseCode;
        this.reason = reason;
    }

    public String getResponse() {
        return response;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public String getReason() {
        return reason;
    }

    public boolean isOk() {
        return (responseCode >= HttpStatus.OK) && (responseCode < HttpStatus.BAD_REQUEST);
    }

    public static GenHttpResponse of(String response) {
        return new GenHttpResponse(response, HttpStatus.OK, "");
    }

    public static GenHttpResponse of(String response, int responseCode, String reason) {
        return new GenHttpResponse(response, responseCode, reason);
    }
}
