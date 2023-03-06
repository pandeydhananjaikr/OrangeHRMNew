package Tests;
import com.orangehrm.pages.OrangeHRMLoginPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
public class OrangeHRMTests extends BaseTest {
    private OrangeHRMTests(){}
        @Test
        public void loginLogoutTest()  {
//        OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
//        OrangeHRMHomePage ohhp = ohlp.enterUserName("Admin").enterPassWord("admin123").clickLogin();
//        ohhp.clickWelcome().clickLogout();

            String title  = new OrangeHRMLoginPage()
                .enterUserName("Admin").enterPassWord("admin123").clickLogin()
                    .clickWelcome().clickLogout()
                    .getTitle();

            Assertions.assertThat(title)
                    .isEqualTo("OrangeHRM");





    }

}
