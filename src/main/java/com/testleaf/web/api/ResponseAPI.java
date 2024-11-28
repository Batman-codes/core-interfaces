package com.testleaf.web.api;

import java.util.Map;

public interface ResponseAPI {

    int getStatusCode();
    String getStatusMessage();
    Object getResponseBody();
    Map<String, String> getResponseHeader();
}
