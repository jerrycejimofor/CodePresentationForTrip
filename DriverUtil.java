package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtil {

    public static WebDriver driver;

    public void setDriver(String Browser) {
        if (driver == null) {
            if (Browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
            }
             driver = new FirefoxDriver();
        }
    }

}
