import org.openqa.selenium.By;

public class Whatsapp {
    public static void pressWhatsapp () {
        Driver.driver.findElement(By.cssSelector(".cPQmgB.callUsWhatsapp__BtnWhatsapp-sc-1bcgurk-0")).click();
    }
}
