package tasks;

import interactions.Write;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import userinterfaces.Registro;

public class FormularioRegistro implements Task {

    private String userName;
    private String password;


    public FormularioRegistro(String userName, String password) {

        this.userName = userName;
        this.password = password;



    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Write.on(Registro.CAMPO_USERNAME, this.userName));
        actor.attemptsTo(Write.on(Registro.CAMPO_PASSWORD, this.password));



    }

    public static FormularioRegistro formul(String userName, String password) {


        return Tasks.instrumented(FormularioRegistro.class,
                userName, password);

    }
}
