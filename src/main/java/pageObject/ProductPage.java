package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import resuable.BrowserInvocation;

import java.util.List;

public class ProductPage extends BrowserInvocation {

    public static void addProductToCart() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@aria-labelledby='attachSiNoCoverage-announce']")).click();
    }

    public static void incQtyCart(String num) throws InterruptedException {
        driver.findElement(By.linkText("Go to Cart")).click();
        driver.findElement(By.xpath("//span[@data-action='a-dropdown-button']")).click();
        Thread.sleep(1000);
        WebElement qty = driver.findElement(By.xpath("//span[@data-action='a-dropdown-button']"));
        List<WebElement> list1 = qty.findElements(By.xpath("//li[@class='a-dropdown-item quantity-option']"));
        for (WebElement q : list1){
            String quantity = q.getText();
            if (quantity.equals(num)){
                q.click();
            }
        }
        Thread.sleep(1000);
    }
    public static void pay() throws InterruptedException {
        driver.findElement(By.name("proceedToRetailCheckout")).click();
        Thread.sleep(1000);
    }

    public static void addProductToCart1() throws InterruptedException {
        driver.findElement(By.name("submit.addToCart")).click();
        Thread.sleep(2000);
    }

    public static void addProductToCart2() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        Thread.sleep(1000);
    }

    public static void removeFromCart() throws InterruptedException {
        driver.findElement(By.linkText("Go to Cart")).click();
        Thread.sleep(1000);
        driver.findElements(By.xpath("//input[@value='Delete']")).get(2).click();
        Thread.sleep(1000);
    }

    public static void addProductToCart3() throws InterruptedException {
        driver.findElement(By.cssSelector("input[id='add-to-cart-button']")).click();
        Thread.sleep(20000);
    }

    public static void incQtyEarphone(String num) throws InterruptedException {
        WebElement quant = driver.findElement(By.cssSelector("select[id='quantity']"));
        Select option = new Select(quant);
        option.selectByValue(num);
        Thread.sleep(1000);
    }

    public static void modQty(String num1, String num2) throws InterruptedException {

        WebElement qty1 = driver.findElements(By.cssSelector("span[data-action='a-dropdown-button']")).get(0);
        qty1.click();
        Thread.sleep(1000);
        List<WebElement> list1 = qty1.findElements(By.xpath("//li[@class='a-dropdown-item quantity-option']"));
        for (WebElement q1 : list1){
            String quantity1 = q1.getText();
            if (quantity1.equals(num1)){
                q1.click();
            }
        }
        Thread.sleep(10000);

        WebElement qty2 = driver.findElements(By.cssSelector("span[data-action='a-dropdown-button']")).get(1);
        qty2.click();
        Thread.sleep(1000);
        List<WebElement> list2 = qty2.findElements(By.xpath("//li[@class='a-dropdown-item quantity-option']"));
        for (WebElement q2 : list2){
            String quantity2 = q2.getText();
            if (quantity2.equals(num2)){
                q2.click();
            }
        }
        Thread.sleep(10000);
    }

    public static void viewCart(){
        driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();
    }

    public static void addtoWishlist() throws InterruptedException {
        driver.findElement(By.xpath("//a[@title='Add to Wish List']")).click();
        Thread.sleep(3000);
    }

}
