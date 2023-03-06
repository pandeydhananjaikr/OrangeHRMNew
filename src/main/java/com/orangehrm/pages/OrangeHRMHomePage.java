package com.orangehrm.pages;
import com.orangehrm.enums.WaitStrategy;
import org.openqa.selenium.By;

public class OrangeHRMHomePage extends BasePage {
    private final By linkWelcome = By.className("oxd-userdropdown-img");
    private final By linkLogOut = By.xpath("//a[text()=\"Logout\"]");

    public OrangeHRMHomePage clickWelcome()  {

//        DriverManager.getDriver().findElement(linkWelcome).click();
        click(linkWelcome, WaitStrategy.CLICKABLE);
        return this;
    }

    public OrangeHRMLoginPage clickLogout()  {
        click(linkLogOut, WaitStrategy.CLICKABLE);
        return new OrangeHRMLoginPage();
    }

}
