package interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.*;

import net.serenitybdd.core.Serenity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProducPageInterface {



    public static Target SELECT_PRODUCT = Target.the("select product").located(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img"));

    public static Target ADD_TO_CAR = Target.the("add to car").located(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a"));

    public static Target RETURN_HOME = Target.the("return home").located(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
    public static Target VIEW_CAR = Target.the("view car").located(By.xpath("//*[@id=\"cartur\"]"));


    public static Target PLACE_ORDER = Target.the("return home").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));







    public Alert manejarAlert() {
        WebDriver driver = Serenity.getWebdriverManager().getWebdriver();; // Obtén el WebDriver de Serenity

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();


            String textoAlerta = alert.getText(); // Obtener el texto del alerta

            System.out.println ("El precio es de " + textoAlerta + " euros");

             // Aceptar el alerta (también puedes usar alert.dismiss() para cancelarlo)
            return driver.switchTo().alert();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


}
