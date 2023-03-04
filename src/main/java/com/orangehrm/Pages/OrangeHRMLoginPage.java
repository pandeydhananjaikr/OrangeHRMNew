package com.orangehrm.Pages;

import com.orangehrm.driver.DriverManager;
import org.openqa.selenium.By;

public final class OrangeHRMLoginPage {
    private final By textbox_username = By.name("username");
    private final By textbox_password = By.name("password");
    private final By button_login = By.xpath("//button[@type = \"submit\"]");

    public OrangeHRMLoginPage enterUserName (String username) throws InterruptedException {
        Thread.sleep(3000);
        DriverManager.getDriver().findElement(textbox_username).sendKeys(username);
        return this;
    }

    public OrangeHRMLoginPage enterPassWord (String password)throws InterruptedException{
        Thread.sleep(3000);
        DriverManager.getDriver().findElement(textbox_password).sendKeys(password);
        return this;
    }

    public OrangeHRMHomePage clickLogin()throws InterruptedException{
        Thread.sleep(3000);
        DriverManager.getDriver().findElement(button_login).click();
        return new OrangeHRMHomePage();
    }

}
