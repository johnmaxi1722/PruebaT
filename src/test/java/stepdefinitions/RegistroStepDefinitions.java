package stepdefinitions;

import cucumber.api.java.es.*;
import cucumber.api.java.es.Entonces;
import models.DataRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Shared;
import org.openqa.selenium.WebDriver;
import tasks.FormularioRegistro;
import tasks.Registrarse;
import userinterfaces.HomePage;
import userinterfaces.Registro;

public class RegistroStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("John");
    private HomePage homePage = new HomePage();

    @Shared
    DataRegistro dataRegistro;

    @Dado("^que un usuario ingresa a la web$")
    public void que_un_usuario_ingresa_a_la_web() {

        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
        actor.attemptsTo(Click.on(HomePage.BOTON_SIGNUP));

    }


    @Cuando("^Ingresa diligencia toda la informacion$")
    public void ingresa_diligencia_toda_la_informacion() {

        actor.attemptsTo(FormularioRegistro.formul(dataRegistro.getUserName(), dataRegistro.getPassword()));
        actor.attemptsTo(Click.on(Registro.BOTON_SIGNUP));

    }

    @Entonces("^generara mensaje de registro exitoso$")
    public void generara_mensaje_de_registro_exitoso() {

    }

}
