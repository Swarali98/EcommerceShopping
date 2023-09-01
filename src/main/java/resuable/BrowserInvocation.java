package resuable;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BrowserInvocation {

    public static WebDriver driver;
    public static Properties prprty;
    public static WebDriver browserInvoke(String browser) throws IOException {

        FileInputStream file = new FileInputStream(new File("src/test/resources/utility/Config.properties"));
        prprty = new Properties();
        prprty.load(file);

        if (browser.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        }
        else if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        else{
            throw new InvalidArgumentException("Provide valid input");
        }

        driver.navigate().to(prprty.getProperty("Url"));
        driver.navigate().refresh();
        driver.manage().window().maximize();
        return driver;
    }
}
