import org.openqa.selenium.By;

public class Footer {
    public static void fillInForm (String name, String email, String phomeMunber) {
        Driver.driver.findElement(By.cssSelector("input[name='name']")).sendKeys(name);
        Driver.driver.findElement(By.cssSelector("input[name='email']")).sendKeys(email);
        Driver.driver.findElement(By.cssSelector("input[name='phone']")).sendKeys(phomeMunber);
        Driver.driver.findElement(By.cssSelector(".Footer__ButtonLabel-sc-1xqajj9-8.iFvXcY > span")).click();

    }
}
