package TestCases;

import org.example.driver.Driver;
import org.example.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public final class LoginTestPage1 extends BaseTest {

    private LoginTestPage1(){}
    @Test
    public void test1()  {

//        DriverManager.getDriver().initDriver();
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Second Automation", Keys.ENTER);

    }

//    @Test
//    public void test2() throws InterruptedException {
//        Driver.getDriver().findElement(By.name("q")).sendKeys("Second Testing", Keys.ENTER);
//    }





}