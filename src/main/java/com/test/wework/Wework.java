package com.test.wework;

import static io.restassured.RestAssured.given;

public class Wework {

    public static String token;

    public static String getAccessToken(){
        return given().relaxedHTTPSValidation().log().all()
                .queryParam("corpid", WeworkConfig.getInstance().corpid)
                .queryParam("corpsecret", WeworkConfig.getInstance().corpSecret)
                .when()
                .get("https://qyapi.weixin.qq.com/cgi-bin/gettoken")
                .then().log().all()
                .statusCode(200)
                .extract().path("access_token");
    }

    public static String getToken(){
        if (token==null){
            token = getAccessToken();
        }
        return token;
    }
}
