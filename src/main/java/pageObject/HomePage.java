package pageObject;

import org.openqa.selenium.By;
import resuable.BrowserInvocation;

import java.util.ArrayList;

public class HomePage extends BrowserInvocation {

    public static void navigateSignin(){
        driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']")).click();
    }

    public static void enterSearch(String searchKeyword){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchKeyword);
    }

    public static void clickSearchButton(){
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public static void homePage(int num) throws InterruptedException {
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(num));
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(2000);
    }

    public static void navigateTab(int num) throws InterruptedException {
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(num));
        Thread.sleep(2000);
        driver.findElement(By.id("twotabsearchtextbox")).clear();
    }

}
