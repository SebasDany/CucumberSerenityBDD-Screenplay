package task;

import interfaces.ProducPageInterface;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ProducPage {



    public static Performable about(String searchTerm) {






        return Task.where( WaitUntil.the(ProducPageInterface.SELECT_PRODUCT, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ProducPageInterface.SELECT_PRODUCT),
                WaitUntil.the(ProducPageInterface.ADD_TO_CAR, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ProducPageInterface.ADD_TO_CAR)




        );

    }

    public static Performable vieCard() {
        ProducPageInterface p=new ProducPageInterface();
        p.manejarAlert().accept();


        return Task.where(
                WaitUntil.the(ProducPageInterface.RETURN_HOME, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ProducPageInterface.RETURN_HOME),
                WaitUntil.the(ProducPageInterface.SELECT_PRODUCT, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ProducPageInterface.SELECT_PRODUCT),
                WaitUntil.the(ProducPageInterface.ADD_TO_CAR, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ProducPageInterface.ADD_TO_CAR)




        );
    }

    public  static Performable placeOrderForm(){
        ProducPageInterface p=new ProducPageInterface();
        p.manejarAlert().accept();

        return Task.where(

                WaitUntil.the(ProducPageInterface.VIEW_CAR, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ProducPageInterface.VIEW_CAR),

                WaitUntil.the(ProducPageInterface.PLACE_ORDER,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ProducPageInterface.PLACE_ORDER)



        );
    }


}
