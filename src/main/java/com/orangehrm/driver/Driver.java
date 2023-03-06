package com.orangehrm.driver;

import com.orangehrm.enums.ConfigProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.orangehrm.utils.PropertyUtils;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Driver extends DriverManager{

    public static void initDriver() throws Exception {
        if (Objects.isNull(DriverManager.getDriver())) {
            WebDriverManager.chromedriver().setup();
            DriverManager.setDriver(new ChromeDriver());
            DriverManager.getDriver().get(PropertyUtils.get(ConfigProperties.URL));
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
