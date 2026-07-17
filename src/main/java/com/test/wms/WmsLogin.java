package com.test.wms;

import com.jayway.jsonpath.JsonPath;
import com.utils.EncryptUtils;
import org.junit.Test;

import java.security.MessageDigest;

import static io.restassured.RestAssured.given;

public class WmsLogin {

    public String getCache(){
        return given().log().all()
                .when().get("http://60.204.225.104:9632/captchaImage")
                .then().log().all()
                .statusCode(200)
                .extract().path("uuid");
    }

    public String getLoginToken(String username,String password){
        String body = JsonPath.parse(this.getClass().getResourceAsStream("/data/login.json"))
                .set("username",username)
                .set("password", EncryptUtils.encryptToMD5(password))
                .set("uuid",getCache())
                .jsonString();

        return given().log().all()
                .body(body)
                .contentType("application/json;charset=UTF-8")
                .when().post("http://60.204.225.104:9632/login")
                .then().log().all()
                .extract().path("token");
    }
}
