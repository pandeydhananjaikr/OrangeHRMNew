package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected BaseTest(){}

    @BeforeMethod
    public void setUp(){
        Driver.initDriver();
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Driver.quit();
    }


}