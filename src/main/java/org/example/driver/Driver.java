package org.example.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

import static org.example.driver.DriverManager.unload;

public class Driver extends DriverManager{

    public static WebDriver driver;

    public static void initDriver() {
        if (Objects.isNull(driver)) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            DriverManager.setDriver(driver);
            DriverManager.getDriver().get("https://www.google.com");
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
