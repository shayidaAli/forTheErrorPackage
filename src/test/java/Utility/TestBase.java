package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public abstract class TestBase { // too general
    protected WebDriver driver;
    protected SoftAssert softAssert;
    protected Actions actions;

    @BeforeClass
    public void setUp(){
        driver=Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actions = new Actions(driver);
        softAssert = new SoftAssert();

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(1000);
        Driver.closeDriver();
        softAssert.assertAll();
        //excuse me  ?? why line 30
    }



}
