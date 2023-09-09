package glue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import starter.navigation.NavigateTo;
import task.PlacerOrdeFormtPage;
import task.ProducPage;

public class ProductStepDefinitions {

    @Given("{actor} esta buscando producto")
    public void sebas_esta_buscando_producto(Actor actor) {

        actor.wasAbleTo(NavigateTo.theSearchHomePage());

    }

    @When("{actor} ya encontro los {string}")
    public void sebas_ya_encontro_los(Actor actor, String term) {
        actor.attemptsTo(

                ProducPage.about(term)
        );


    }

    @Then("{actor} quiere ver los productos selccionados {string}")
    public void sebas_quiere_ver_los_productos_selccionados(Actor actor, String term) {
        System.out.println("Hola usuario bienvenido" + actor + term);
        actor.attemptsTo(
                ProducPage.vieCard()

        );


    }


    @And("{actor} ingresa a completar la orden")
    public void sebas_ingresa_a_completar_la_orden(Actor actor) {
        actor.attemptsTo(ProducPage.placeOrderForm());
    }




    @When("{actor} completa el formulario y finalizar la compra  {string} {string} {string} {int} {string} {int}")
    public void sebas_completa_el_formulario_y_finalizar_la_compra(Actor actor,String string, String string2, String string3, Integer int1, String string4, Integer int2)  {

        actor.attemptsTo(PlacerOrdeFormtPage.withData(string,string2,string3,int1.toString(),string4,int2.toString()));
    }
}
