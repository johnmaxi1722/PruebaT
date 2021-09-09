package tasks;


import interactions.Write;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.apache.poi.ss.formula.functions.T;
import userinterfaces.Registro;


public class Registrarse implements Task {

    private String userName;
    private String password;

    public Registrarse(String userName, String password) {

        this.userName = userName;
        this.password = password;
    }

        @Override
        public <T extends Actor > void performAs(T actor) {


            actor.attemptsTo(Write.on(Registro.CAMPO_USERNAME, this.userName));
            actor.attemptsTo(Write.on(Registro.CAMPO_PASSWORD, this.password));
        }
    public static Registrarse camporeg(String email){
        return Tasks.instrumented(Registrarse.class, email);
    }
}
