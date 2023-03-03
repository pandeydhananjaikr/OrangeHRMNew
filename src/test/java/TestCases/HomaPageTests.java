package TestCases;

import com.orangehrm.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Locale;
import java.util.Objects;


public final class HomaPageTests extends BaseTest {

    private HomaPageTests(){}
    @Test
    public void test1()  {

//        DriverManager.getDriver().initDriver();
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Testing mini bytes - Youtube", Keys.ENTER);
        String title = DriverManager.getDriver().getTitle();
        Assert.assertTrue(Objects.nonNull(title), "Title is null");
        Assert.assertTrue(title.toLowerCase().contains("google search"));
        Assert.assertTrue(title.toLowerCase().matches("\\w.*"+"google search"));
        Assert.assertTrue(title.length()>15);
        Assert.assertTrue(title.length()<100);
        List<WebElement> elements =  DriverManager.getDriver().findElements(By.xpath("//h3"));
        Assert.assertEquals(elements.size(), 8);
        boolean isElementPresent = false;
        for (WebElement element : elements){
            if (element.getText().equalsIgnoreCase("Testing mini bytes - Youtube")){
                isElementPresent = true;
                break;
            }
        }

        Assert.assertTrue(isElementPresent, "testing mini bytes not found");

    }


}