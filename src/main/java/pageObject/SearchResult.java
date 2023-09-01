package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import resuable.BrowserInvocation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SearchResult extends BrowserInvocation {
    public static String getTitle(){

        return driver.getTitle();
    }

    public static void clickProduct() throws InterruptedException {
        driver.findElements(By.partialLinkText("Pigeon by Stovekraft")).get(0).click();
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
        Thread.sleep(2000);
    }

    public static void clickProduct1() throws InterruptedException {
        driver.findElements(By.partialLinkText("Galaxy A23 5G")).get(0).click();
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
        Thread.sleep(2000);
    }

    public static void clickProduct2() throws InterruptedException {
        driver.findElements(By.partialLinkText("INDULGE HOMES - White Vase")).get(0).click();
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
        Thread.sleep(2000);
    }

    public static void clickProduct3() throws InterruptedException {
        driver.findElements(By.partialLinkText("World Fireᵀᴹ Modern Planters")).get(0).click();
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(2));
        Thread.sleep(2000);
    }

    public static void clickProduct4() throws InterruptedException {
        driver.findElement(By.linkText("Wall Shelves")).click();
        driver.findElements(By.partialLinkText("Wall Shelves")).get(0).click();
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(3));
        Thread.sleep(2000);
    }

    public static void clickProduct5() throws InterruptedException {
        driver.findElements(By.partialLinkText("PopSockets")).get(0).click();
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(2));
        Thread.sleep(2000);
    }

    public static void clickProduct6() throws InterruptedException {
        driver.findElements(By.partialLinkText("boAt BassHeads")).get(0).click();
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(3));
        Thread.sleep(2000);
    }

    public static void chooseBrand() throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='American Tourister']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Skybags']")).click();
        Thread.sleep(3000);
    }

    public static void choosePrice() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='low-price']")).sendKeys("1000");
        driver.findElement(By.xpath("//input[@name='high-price']")).sendKeys("2000");
        driver.findElement(By.xpath("//input[@class='a-button-input']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Laptops']")).click();
        Thread.sleep(3000);
    }

    public static void chooseBag() throws InterruptedException {
        driver.findElement(By.partialLinkText("Skybags")).click();
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
        Thread.sleep(3000);
    }

    public static void sortFilter() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".a-dropdown-label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Price: High to Low']/parent::li")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//section[@aria-label='3 Stars & Up']/child::span")).click();
        Thread.sleep(3000);
    }

    public static void chooseWallet() throws InterruptedException {
        driver.findElement(By.partialLinkText("Handmade")).click();
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(2));
        Thread.sleep(3000);
    }

}
