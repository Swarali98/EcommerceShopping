package pageObject;

import org.openqa.selenium.By;
import resuable.BrowserInvocation;

public class LoginPage extends BrowserInvocation {

    public static void enterEmail(){

        driver.findElement(By.id("ap_email")).sendKeys(prprty.getProperty("username"));
    }

    public static void clickContinueButton(){

        driver.findElement(By.id("continue")).click();
    }

    public static void enterpwd(){

        driver.findElement(By.id("ap_password")).sendKeys(prprty.getProperty("password"));
    }

    public static void clickSignin(){

        driver.findElement(By.id("signInSubmit")).click();
    }

    public static String getErrMsg(){
        return driver.findElement(By.xpath("//div[@class='a-alert-content']")).getText();
    }

}
