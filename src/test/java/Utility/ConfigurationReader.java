package Utility;

import javax.security.auth.login.Configuration;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static {
        String path= "Configuration.properties";

       try{
           FileInputStream fileInputStream= new FileInputStream(path);
           properties= new Properties();
           properties.load(fileInputStream);
           fileInputStream.close();

       } catch (IOException e) {
           e.printStackTrace();

       }// idk what we are doing here??

    }


    public static String getProperty(String property ){
         return properties.getProperty(property);

    }




}
