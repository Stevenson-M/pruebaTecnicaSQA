package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static userInterfaces.HomePage.productInput;

public class SearchForProduct implements Task {

    private final String productName;

    public SearchForProduct(String productName) {
        this.productName = productName;
    }

    public static SearchForProduct named(String productName) {
        return new SearchForProduct(productName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(productName).into(productInput),
                Hit.the(Keys.ENTER).into(productInput)
        );
    }
}



