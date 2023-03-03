package com.orangehrm.constants;

public class FrameworkConstants {

    private static final String RESOURCESPATH = System.getProperty("user.dir")+"src/test/resources";
    private static final String CONFIGFILEPATH = RESOURCESPATH + "/Config/config.properties";

    public static String getConfigFIlepath(){
        return CONFIGFILEPATH;
    }

}
