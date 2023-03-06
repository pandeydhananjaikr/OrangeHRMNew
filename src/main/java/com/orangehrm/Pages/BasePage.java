package com.orangehrm.Pages;

import com.orangehrm.constants.FrameworkConstants;
import com.orangehrm.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected void click(By by, String waitstrategy) {
        if (waitstrategy.equalsIgnoreCase("clickable")) {
            explicitlyWaitForElementTobeClickable(by);
        }

        else if (waitstrategy.equalsIgnoreCase("present")){
            explicitlyWaitForElementTobePresent(by);
        }
        DriverManager.getDriver().findElement(by).click();
    }

    protected void sendKeys(By by, String value, String waitstrategy){
        if (waitstrategy.equalsIgnoreCase("clickable")) {
            explicitlyWaitForElementTobeClickable(by);
        }

        else if (waitstrategy.equalsIgnoreCase("present")) {
            explicitlyWaitForElementTobePresent(by);
        }
        DriverManager.getDriver().findElement(by).sendKeys(value);
    }

    protected String getPageTitle(){

        return DriverManager.getDriver().getTitle();
    }

    private void explicitlyWaitForElementTobeClickable(By by){
        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
                .until(ExpectedConditions.elementToBeClickable(by));

    }

    private void explicitlyWaitForElementTobePresent(By by){
        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
                .until(ExpectedConditions.presenceOfElementLocated(by));

    }



}


