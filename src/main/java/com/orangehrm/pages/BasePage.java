package com.orangehrm.pages;
import com.orangehrm.driver.DriverManager;
import com.orangehrm.enums.WaitStrategy;
import com.orangehrm.factories.ExplicitWaitfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected void click(By by, WaitStrategy waitstrategy) {
        WebElement element = ExplicitWaitfactory.performExplicitWait(waitstrategy, by);
            element.click();
    }

    protected void sendKeys(By by, String value, WaitStrategy waitstrategy){
        WebElement element = ExplicitWaitfactory.performExplicitWait(waitstrategy, by);
        element.sendKeys(value);
    }

    protected String getPageTitle(){

        return DriverManager.getDriver().getTitle();
    }

//    private void explicitlyWaitForElementTobeClickable(By by){
//        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
//                .until(ExpectedConditions.elementToBeClickable(by));
//
//    }
//
//    private void explicitlyWaitForElementTobePresent(By by){
//        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
//                .until(ExpectedConditions.presenceOfElementLocated(by));
//    }
}


