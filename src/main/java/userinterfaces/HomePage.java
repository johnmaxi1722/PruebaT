package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static final Target BOTON_SIGNUP = Target.the("Botón Inscribirse")
            .located(By.id("signin2"));

}
