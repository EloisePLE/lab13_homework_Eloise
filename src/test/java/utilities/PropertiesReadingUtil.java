package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReadingUtil {
    private static Properties properties = new Properties();
    // encapsulation

    static {
        // will get executed before everything
        // get the path for conf properties
        String pathForPropertiesFile = "configuration.properties";

        try{
            // tell compiler to open file
            FileInputStream fileInputStream = new FileInputStream(pathForPropertiesFile);
            properties.load(fileInputStream);
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("properties file not found");
        }
    }
    public static String getProperties(String keyword){
        return properties.getProperty(keyword);
    }
}
