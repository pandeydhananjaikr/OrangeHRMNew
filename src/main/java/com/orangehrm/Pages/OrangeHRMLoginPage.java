package com.orangehrm.Pages;

import com.orangehrm.driver.DriverManager;
import org.openqa.selenium.By;

public final class OrangeHRMLoginPage extends BasePage {
    private final By textboxUsername = By.name("username");
    private final By textboxPassword = By.name("password");
    private final By buttonLogin = By.xpath("//button[@type = \"submit\"]");

    public OrangeHRMLoginPage enterUserName (String username)  {
        sendKeys(textboxUsername, username, "present");
        return this;
    }

    public OrangeHRMLoginPage enterPassWord (String password) {
        sendKeys(textboxPassword, password, "present");
        return this;
    }

    public OrangeHRMHomePage clickLogin(){
        click(buttonLogin, "clickable");
        return new OrangeHRMHomePage();
    }

    public String getTitle(){
      return getPageTitle();
    }

}
