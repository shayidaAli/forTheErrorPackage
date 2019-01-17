package Tests;

import Pages.HomePage;
import Utility.ConfigurationReader;
import Utility.TestBase;
import org.testng.annotations.Test;

public class LogintestWithProperties extends TestBase {

    @Test
    public void readPropertyTest(){
        driver.get(ConfigurationReader.getProperty("url"));
        HomePage homePage= new HomePage();
        String username=ConfigurationReader.getProperty("username");
        String password=ConfigurationReader.getProperty("password");
        homePage.login(username,password);




    }

}
