package com.orangehrm.factories;

import com.orangehrm.constants.FrameworkConstants;
import com.orangehrm.driver.DriverManager;
import com.orangehrm.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitfactory {

    public static WebElement performExplicitWait(WaitStrategy waitstrategy, By by){
        WebElement element = null;
        if (waitstrategy== WaitStrategy.CLICKABLE ) {
            element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
                    .until(ExpectedConditions.elementToBeClickable(by));
        }

        else if (waitstrategy== WaitStrategy.PRESENCE ) {
            element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
                    .until(ExpectedConditions.elementToBeClickable(by));
        }

        else if (waitstrategy== WaitStrategy.VISIBLE ) {
            element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
        }

        else if (waitstrategy== WaitStrategy.NONE ) {
            element = DriverManager.getDriver().findElement(by);
        }
        return element;

    }

}
