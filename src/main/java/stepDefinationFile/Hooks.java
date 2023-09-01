package stepDefinationFile;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import resuable.BrowserInvocation;

import java.io.IOException;

public class Hooks extends BrowserInvocation {

    @Before(order=0,value = "@TestCase1")
    public void setup() throws IOException {
        System.out.println("Browser invokes");
        browserInvoke("edge");
    }

    @Before(order=0,value = "@Chrome")
    public void setup1() throws IOException {
        System.out.println("Browser invokes");
        browserInvoke("chrome");
    }

    @Before(order=1,value = "@Edge")
    public void setup2() throws IOException {
        System.out.println("Browser invokes");
        browserInvoke("edge");
    }

    @After()
    public void finished() {

        System.out.println("End");
        driver.quit();
    }

    @AfterStep
    public void takeScreenshot(Scenario sc){         // after each and every statement
        byte[] b= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        sc.attach(b,"image/png",sc.getName());
    }

}
