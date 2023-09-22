package interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class PlacerOrderFormInterface {


    public static Target NAME = Target.the("input name").located(By.xpath("//*[@id=\"name\"]"));

    public static Target COUNTRY = Target.the("input country").located(By.id("country"));
    public static Target CITY = Target.the("input city").located(By.id("city"));
    public static Target CARD= Target.the("input card").located(By.id("card"));
    public static Target MONTH = Target.the("input month").located(By.id("month"));
    public static Target YEAR = Target.the("input year").located(By.id("year"));
    public static Target PURCHASE = Target.the("Button purchase").located(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));






}
