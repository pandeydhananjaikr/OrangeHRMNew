package com.orangehrm.pages;
import com.orangehrm.driver.DriverManager;
import com.orangehrm.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMHomePage extends BasePage {
    private final By linkWelcome = By.className("oxd-userdropdown-img");
    private final By linkLogOut = By.xpath("//a[text()=\"Logout\"]");

    public OrangeHRMHomePage clickWelcome()  {

        //findElement(linkWelcome, WaitStrategy.PRESENCE);
        click(linkWelcome, WaitStrategy.CLICKABLE);
        return this;
    }

    public OrangeHRMLoginPage clickLogout()  {
        click(linkLogOut, WaitStrategy.CLICKABLE);
        return new OrangeHRMLoginPage();
    }

}
