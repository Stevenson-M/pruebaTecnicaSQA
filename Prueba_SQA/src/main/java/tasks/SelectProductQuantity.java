package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;


import static userInterfaces.ProductPage.productQuantity;

public class SelectProductQuantity implements Task {

    private final String quantity;

    public SelectProductQuantity(String quantity) {
        this.quantity = quantity;
    }

    public static SelectProductQuantity ofQuantity(String quantity) {
        return new SelectProductQuantity(quantity);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(quantity).into(productQuantity).thenHit(Keys.ENTER)
        );
    }
}

