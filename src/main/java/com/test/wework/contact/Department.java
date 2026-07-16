package com.test.wework.contact;

import com.test.wework.Wework;
import com.test.wework.WeworkConfig;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Department {
    @Test
    public Response getList(String id){
        return given().relaxedHTTPSValidation().log().all()
                .queryParam("access_token", Wework.getToken())
                .queryParam("id", id)
                .when()
                .get("https://qyapi.weixin.qq.com/cgi-bin/department/list");
    }
}
