package Tests;

import com.orangehrm.driver.Driver;
import com.orangehrm.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public final class LoginTestPage extends BaseTest {

    private LoginTestPage(){}
    @Test
    public void test1()  {
     //   DriverManager.getDriver().initDriver();
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);

    }

    @Test
    public void test2()   {
        Driver.getDriver().findElement(By.name("q")).sendKeys("Testing", Keys.ENTER);
    }





}