package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.driver.Driver;
import org.example.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public final class LoginTestPage extends BaseTest {

    private LoginTestPage(){}
    @Test
    public void test1()  {

//        DriverManager.getDriver().initDriver();
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);

    }

//    @Test
//    public void test2() throws InterruptedException {
//        Driver.getDriver().findElement(By.name("q")).sendKeys("Testing", Keys.ENTER);
//    }





}