package stepdefinitions;

import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import userinterfaces.Carrito;
import userinterfaces.HomePage;
import userinterfaces.Registro;

import java.util.Calendar;

public class AddCarritoStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("John");
    private HomePage homePage = new HomePage();

    @Dado("^El usuario se registra en el portal web$")
    public void el_usuario_se_registra_en_el_portal_web() {

        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));

    }


    @Cuando("^Usuario selecciona articulo$")
    public void usuario_selecciona_articulo() {

        actor.attemptsTo(Click.on(Carrito.BOTON_LAPTOP));
        actor.attemptsTo(Click.on(Carrito.LINK_PCSONY));
        actor.attemptsTo(Click.on(Carrito.BTN_ADDCART));

    }

    @Entonces("^Agrega el producto al carrito$")
    public void agrega_el_producto_al_carrito() {

    }

}
