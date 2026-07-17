package com.test.wms;

public class WmsLoginConfig {
    public String username = "admin";
    public String password = "123456";
    public String uuid = "";
    public String code = "2";

    public WmsLoginConfig wmsLoginConfig;
    public WmsLoginConfig getInstance(){
        if (wmsLoginConfig == null){
            wmsLoginConfig = new WmsLoginConfig();
        }
        return wmsLoginConfig;
    }
}
