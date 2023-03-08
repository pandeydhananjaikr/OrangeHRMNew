package Learning;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidertest {

    @Test(dataProvider = "getdata1")
    public void test1(String username){
            System.out.println("entering username");
            System.out.println("entering password");
            System.out.println("click login");
//            Assert.assertTrue(false);
//            SoftAssert assert1 = new SoftAssert();
//            assert1.assertTrue(false);
        }

    @DataProvider
        public Object[] getData(){
        String[] a = {"one", "two", "Three"};
        return a;
    }

    @DataProvider
    public Object[][] getData1(){
        return new Object[][]{
                {"one"},
                {"two"},
                {"three"}  };
    }
}
