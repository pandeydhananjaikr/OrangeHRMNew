package Tests;

import com.orangehrm.Pages.OrangeHRMLoginPage;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {
    private OrangeHRMTest(){}
        @Test
        public void loginLogoutTest() throws InterruptedException {
        OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
        ohlp.enterUserName("Admin").enterPassWord("admin123").clickLogin();

    }



}
