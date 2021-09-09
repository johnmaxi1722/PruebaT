package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Registro extends PageObject {

    public static final Target CAMPO_USERNAME = Target.the("Campo Usuario")
            .located(By.id("sign-username"));

    public static final Target CAMPO_PASSWORD = Target.the("Campo Password")
            .located(By.id("sign-password"));

    public static final Target BOTON_SIGNUP = Target.the("Botón Ingresar")
            .located(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));

}
