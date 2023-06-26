package Learning;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataProvidertest {

    @Test(dataProvider = "getData1")
    public void test1(String username){
            System.out.println("entering username");
            System.out.println("entering password");
            System.out.println("click login");
//            Assert.assertTrue(false);
//            SoftAssert assert1 = new SoftAssert();
//            assert1.assertTrue(false);
        }

    @DataProvider
        public String[] getData(){
        String[] a = {"one", "two", "Three"};
        return a;
    }

    @DataProvider
    public Object[][] getData1() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("./"+"src/Excel/test1.xlsx");


        ;
    }
}
