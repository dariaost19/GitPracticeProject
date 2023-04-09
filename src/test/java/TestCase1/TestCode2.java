package TestCase1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCode2 {
    WebDriver driver;
    @When("user can click on card")
    public void user_can_click_on_card() {
       WebElement cart= driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
       cart.click();


    }
    @When("see if there are added items")
    public void see_if_there_are_added_items() {
        System.out.println("cart is empty");
    }

}
