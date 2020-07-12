import org.openqa.selenium.By;

public class TalkToUs {
    public static void talkToUsFillInForm(String name, String company, String email, String phoneNumber) {
        Driver.driver.findElement(By.cssSelector("input#name")).sendKeys(name);
        Driver.driver.findElement(By.cssSelector("input#company")).sendKeys(company);
        Driver.driver.findElement(By.cssSelector("input#email")).sendKeys(email);
        Driver.driver.findElement(By.cssSelector("input#telephone")).sendKeys(phoneNumber);
        Driver.driver.findElement(By.cssSelector("a > span")).click();
    }
}
