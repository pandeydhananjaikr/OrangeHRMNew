package com.orangehrm.pages;

import com.orangehrm.enums.WaitStrategy;
import org.openqa.selenium.By;

public final class OrangeHRMLoginPage extends BasePage {
    private final By textboxUsername = By.name("username");
    private final By textboxPassword = By.name("password");
    private final By buttonLogin = By.xpath("//button[@type = \"submit\"]");

    public OrangeHRMLoginPage enterUserName (String username)  {
        sendKeys(textboxUsername, username, WaitStrategy.PRESENCE);
        return this;
    }

    public OrangeHRMLoginPage enterPassWord (String password) {
        sendKeys(textboxPassword, password, WaitStrategy.PRESENCE);
        return this;
    }

    public OrangeHRMHomePage clickLogin(){
        click(buttonLogin, WaitStrategy.CLICKABLE);
        return new OrangeHRMHomePage();
    }

    public String getTitle(){
      return getPageTitle();
    }

}
