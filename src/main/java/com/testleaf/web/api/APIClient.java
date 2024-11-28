package com.testleaf.web.api;

public interface APIClient {

    ResponseAPI get(String endPoint);
    ResponseAPI post(String endPoint, Object body);
    ResponseAPI put(String endPoint, Object body);
    ResponseAPI delete(String enPoint);
}
