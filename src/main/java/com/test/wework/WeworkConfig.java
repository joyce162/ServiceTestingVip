package com.test.wework;

public class WeworkConfig {
    public String corpid = "ww66f2f56e5368b29f";
    public String corpSecret = "4yRZJp6gQLZhqW3-FqAdQukMGHbqHavaLh13WUdEcgw";

    public static WeworkConfig weworkConfig;

    public static WeworkConfig getInstance(){
        if (weworkConfig == null){
            weworkConfig = new WeworkConfig();
        }
        return weworkConfig;
    }
}
