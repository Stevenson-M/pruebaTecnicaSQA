package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import tasks.OpenWebsite;
import tasks.SearchForProduct;
import tasks.SelectProductQuantity;






public class stepsDefinitions {


    private Actor actor = Actor.named("User");






    @Given("User enters the sanagel webpage")
    public void userEntersTheSanagelWebpage() {
        WebDriver firefoxDriver = new FirefoxDriver();
        actor.whoCan(BrowseTheWeb.with(firefoxDriver));
        String pageURL = "https://sanangel.com.co/";
        actor.attemptsTo(OpenWebsite.at(pageURL));
    }

    @When("User search for the product {string}")
    public void userSearchForTheProduct(String productName) {
        SearchForProduct.named(productName).performAs(actor);
    }

    @When("User adds the {string} quantities of the product to the shopping cart")
    public void userAddsTheQuantitiesOfTheProductToTheShoppingCart(String quantity) {
        SelectProductQuantity.ofQuantity(quantity).performAs(actor);
    }

    @Then("User sees the product added to the shopping cart")
    public void userSeesTheProductAddedToTheShoppingCart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}



