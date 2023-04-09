package TestCase1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1Code {
    WebDriver driver;
    @Given("open the browser and launch Amazon application")
    public void open_the_browser_and_launch_amazon_application() {
    driver=new ChromeDriver();
     driver.get("https://www.amazon.com/");
    }
    @When("user can type item name in the search box")
    public void user_can_type_item_name_in_the_search_box() {
WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
searchBox.sendKeys("easter candy");
    }
    @When("click on search button")
    public void click_on_search_button() {
       WebElement searchBtn=driver.findElement(By.id("nav-search-submit-button"));
       searchBtn.click();


    }
    @Then("list of items are displayed")
    public void list_of_items_are_displayed() {


    }
    @Then("close the browser")
    public void close_the_browser() {
        driver.close();

    }




}
