package Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import javax.security.auth.login.Configuration;

public class Driver {

    private static WebDriver driver;
    private Driver(){

    } // why we have to create a constructor here?

    public static WebDriver getDriver(){
        if (driver == null){
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;

            }
        }
        return driver;
    }
    public static void closeDriver(){
        if ((driver!= null)){
            driver.quit();
            driver =null;
        }
    }


}