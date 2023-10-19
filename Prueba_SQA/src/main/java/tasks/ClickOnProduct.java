package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickOnProduct implements Task {

    private Target product;

    public ClickOnProduct(Target product) {
        this.product = product;
    }

    public static ClickOnProduct called(Target product) {
        return new ClickOnProduct(product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(product)
        );
    }
}
