package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Write implements Interaction {
    private Target element;
    private String text;
    public Write(Target element, String text){
        this.element = element;
        this.text = text;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitElement.visible(this.element));
        actor.attemptsTo(Enter.keyValues(this.text).into(this.element));
    }

    public static Write on(Target element, String text) {
        return new Write(element, text);

    }
}
