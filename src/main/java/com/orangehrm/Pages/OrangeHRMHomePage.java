package com.orangehrm.Pages;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.orangehrm.driver.Driver;
import com.orangehrm.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrangeHRMHomePage extends BasePage {
    private final By linkWelcome = By.className("oxd-userdropdown-img");
    private final By linkLogOut = By.xpath("//a[text()=\"Logout\"]");

    public OrangeHRMHomePage clickWelcome() throws InterruptedException {
        Thread.sleep(3000);
//        DriverManager.getDriver().findElement(linkWelcome).click();
        click(linkWelcome, "present");
        return this;
    }

    public OrangeHRMLoginPage clickLogout()  {
        click(linkLogOut, "clickable");
        return new OrangeHRMLoginPage();
    }

}
