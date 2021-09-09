package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Carrito extends PageObject {

    public static final Target BOTON_LAPTOP = Target.the("Botón Laptop")
            .located(By.id("itemc"));

    public static final Target LINK_PCSONY = Target.the("Articulo PC Sony")
            .located(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));


    public static final Target BTN_ADDCART = Target.the("Botón Agregar al Carrito")
            .located(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));

}
