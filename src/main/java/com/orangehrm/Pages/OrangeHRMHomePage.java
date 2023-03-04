package com.orangehrm.Pages;
import com.orangehrm.driver.DriverManager;
import org.openqa.selenium.By;
public class OrangeHRMHomePage {
    private final By link_welcome = By.className("oxd-userdropdown-img");
    private final By link_logOut = By.xpath("//a[text()=\"Logout\"]");

    public OrangeHRMHomePage clickWelcome() throws InterruptedException {
        Thread.sleep(3000);
        DriverManager.getDriver().findElement(link_welcome).click();
        return this;
    }

    public OrangeHRMHomePage clickLogout() throws InterruptedException {
        Thread.sleep(3000);
        DriverManager.getDriver().findElement(link_logOut).click();
        return this;
    }

}
