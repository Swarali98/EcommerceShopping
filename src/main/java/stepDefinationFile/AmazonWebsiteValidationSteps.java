package stepDefinationFile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.*;
import org.testng.Assert;
import resuable.ReadExcel;

import java.io.IOException;

public class AmazonWebsiteValidationSteps {

    @Given("User enters the credential on login page")
    public void userSignin(){
        HomePage.navigateSignin();
        LoginPage.enterEmail();
        LoginPage.clickContinueButton();
        LoginPage.enterpwd();
        LoginPage.clickSignin();
    }

    @When("User validates the error message")
    public void errorMsgDisplay(){
        String err = LoginPage.getErrMsg();
        String expextedErr = "Your password is incorrect";
        if(err.equals(expextedErr)){
            Assert.assertTrue(true);
        }
        else {
            Assert.assertTrue(false);
        }
    }

    @Given("User search a specific product on search tab, row {string} column {string}")
    public void searchProduct(String row, String coln) throws IOException {
        HomePage.enterSearch(ReadExcel.fetchData("ProductList",Integer.valueOf(row),Integer.valueOf(coln)));
        HomePage.clickSearchButton();
    }

    @When("Results should be displayed for searched keyword")
    public void resultsDisplayforProduct() {
        String title = SearchResult.getTitle();
        System.out.println("title of the browser is: "+title);
    }

    @And("User will select appropriate search result")
    public void selectProduct() throws InterruptedException {
        SearchResult.clickProduct();
    }

    @And("User will add the product to cart")
    public void addToCart() throws InterruptedException {
        ProductPage.addProductToCart();
    }

    @And("User will view the cart and increase product quantity, row {string} column {string}")
    public void increaseQty(String row, String coln) throws InterruptedException, IOException {
        ProductPage.incQtyCart(ReadExcel.fetchData("ProductList",Integer.valueOf(row),Integer.valueOf(coln)));
    }

    @Then("User will proceed for payment")
    public void payment() throws InterruptedException {
        ProductPage.pay();
    }

    @When("Results should be displayed for searched keyword.")
    public void resultsDisplayforProduct1() {
        String title = SearchResult.getTitle();
        System.out.println("title of the browser is: "+title);
    }

    @And("User will select appropriate search result and add to cart")
    public void selectProduct1() throws InterruptedException {
        SearchResult.clickProduct1();
        ProductPage.addProductToCart1();
    }

    @When("User will select appropriate result and add to the cart")
    public void addToCart2() throws InterruptedException {
        SearchResult.clickProduct2();
        ProductPage.addProductToCart2();
    }

    @And("User will select a product and add to cart")
    public void addToCart3() throws InterruptedException {
        SearchResult.clickProduct3();
        ProductPage.addProductToCart2();
    }

    @And("User navigates to 1st tab and returns to homepage")
    public void navigateHomePage() throws InterruptedException {
        HomePage.homePage(0);
    }

    @And("User selects a product of Wall shelves and add to the cart")
    public void addCartWithPOD() throws InterruptedException {
        SearchResult.clickProduct4();
        ProductPage.addProductToCart2();
    }

    @And("User removes 1st product from cart")
    public void removeProduct() throws InterruptedException {
        ProductPage.removeFromCart();
    }

    @And("User select pop holder and add to cart")
    public void addToCart4() throws InterruptedException {
        SearchResult.clickProduct5();
        ProductPage.addProductToCart3();
    }

    @And("User select earphone and add to cart, row {string} column {string}")
    public void addToCart5(String row, String coln) throws InterruptedException, IOException {
        SearchResult.clickProduct6();
        ProductPage.incQtyEarphone(ReadExcel.fetchData("ProductList",Integer.valueOf(row),Integer.valueOf(coln)));
        ProductPage.addProductToCart3();
        ProductPage.viewCart();
    }

    @And("User will decrease quantity of earphone and increase quantity of pop holder")
    public void modifyQty() throws InterruptedException {
        ProductPage.modQty("1","2");
    }

    @When("User select 2 brands from checkbox")
    public void selectBrand() throws InterruptedException {
        SearchResult.chooseBrand();
    }

    @And("User select a category and price range")
    public void selectPrice() throws InterruptedException {
        SearchResult.choosePrice();
    }
    @And("User select a Bag and adds to wishlist")
    public void selectBag() throws InterruptedException {
        SearchResult.chooseBag();
        ProductPage.addtoWishlist();
    }

    @And("User navigates to 1st tab and clears the search field")
    public void returnToTab() throws InterruptedException {
        HomePage.navigateTab(0);
    }

    @And("User sorts the search results and filters according to ratings")
    public void sortResults() throws InterruptedException {
        SearchResult.sortFilter();
    }

    @Then("User select a wallet and add to wishlist")
    public void selectWallet() throws InterruptedException {
        SearchResult.chooseWallet();
        ProductPage.addtoWishlist();
    }
}
