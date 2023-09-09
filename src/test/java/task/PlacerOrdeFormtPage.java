package task;


import interfaces.PlacerOrderFormInterface;
import interfaces.ProducPageInterface;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PlacerOrdeFormtPage {

    public final String name;
    public final String country ;
    public final String city;
    public final String card;
    public final String month;
    public final String year;


    public PlacerOrdeFormtPage(String name, String country, String city, String card, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.card = card;
        this.month = month;
        this.year = year;
    }
    public static Performable withData(String name, String country, String city, String card, String month, String year) {

        return Task.where(

                WaitUntil.the(PlacerOrderFormInterface.NAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(name).into(PlacerOrderFormInterface.NAME),

                WaitUntil.the(PlacerOrderFormInterface.COUNTRY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(country).into(PlacerOrderFormInterface.COUNTRY),

                WaitUntil.the(PlacerOrderFormInterface.CITY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(city).into(PlacerOrderFormInterface.CITY),
                WaitUntil.the(PlacerOrderFormInterface.CARD, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(card).into(PlacerOrderFormInterface.CARD),

                WaitUntil.the(PlacerOrderFormInterface.MONTH, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(month).into(PlacerOrderFormInterface.MONTH),

                WaitUntil.the(PlacerOrderFormInterface.YEAR, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(year).into(PlacerOrderFormInterface.YEAR),

                WaitUntil.the(PlacerOrderFormInterface.PURCHASE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PlacerOrderFormInterface.PURCHASE)






        );

    }




}
