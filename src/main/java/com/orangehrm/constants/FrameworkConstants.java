package com.orangehrm.constants;

public class FrameworkConstants {

    private static final String RESOURCESPATH = System.getProperty("user.dir")+"src/test/resources";
    private static final String CONFIGFILEPATH = RESOURCESPATH + "/Config/config.properties";

    private static final int EXPLICITWAIT = 10;
    public static String getConfigFIlepath(){

        return CONFIGFILEPATH;
    }

    public static int getExplicitWait(){
        return EXPLICITWAIT;
    }




}
