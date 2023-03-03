package com.orangehrm.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.orangehrm.utils.ReadPropertyFile;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Driver extends DriverManager{

    public static void initDriver() throws Exception {
        if (Objects.isNull(DriverManager.getDriver())) {
            WebDriverManager.chromedriver().setup();
            DriverManager.setDriver(new ChromeDriver());
            DriverManager.getDriver().get(ReadPropertyFile.get("url"));
        }
    }

    public static void quit() throws InterruptedException {
        if (Objects.nonNull(getDriver())) {
            Thread.sleep(3000);
            DriverManager.getDriver().quit();
//            setDriver(null);
             DriverManager.unload();


        }
    }


}
