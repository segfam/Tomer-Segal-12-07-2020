import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HeroloTest {

    @BeforeClass
    public static void runBeforeClass() throws IOException, SAXException, ParserConfigurationException {
        Driver.chromeInit();
    }

    @Test
    public void test_01() throws IOException, SAXException, ParserConfigurationException {
        String url = HeroloConfig.getData("url");
        Driver.driver.get(url);
    }

    @Test
    public void test_02() throws IOException, SAXException, ParserConfigurationException {
        Footer.fillInForm(HeroloConfig.getData("name"),
                HeroloConfig.getData("email"),
                HeroloConfig.getData("phoneNumber"));
        Driver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Driver.driver.findElement(By.cssSelector(".idImZT.thankYou__backLink-bl9e43-10 > span")).click();
    }

    @Test
    public void test_03() {
        Whatsapp.pressWhatsapp();
        HeroloConfig.SwitchTab();
    }

    @Test
    public void test_04() throws IOException, SAXException, ParserConfigurationException {
        TalkToUs.talkToUsFillInForm(HeroloConfig.getData("talkToUsName"),
                HeroloConfig.getData("talkToUsCompany"),
                HeroloConfig.getData("talkToUsEmail"),
                HeroloConfig.getData("talkToUsPhoneNumber"));
        Driver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Driver.driver.findElement(By.cssSelector(".idImZT.thankYou__backLink-bl9e43-10 > span")).click();
    }

    @Test
    public void test_05() {
        Driver.driver.findElement(By.cssSelector(".Footer__ButtonLabel-sc-1xqajj9-8.iFvXcY > span")).click();
        String expectedNameMessage = "שדה שם הוא שדה חובה";
        String nameMessage = Driver.driver.findElement(By.cssSelector
                ("div:nth-of-type(1) > .Footer__InputError-sc-1xqajj9-5.fYJjBk > span")).getText();
        Assert.assertTrue("nameMessageError", nameMessage.contains(expectedNameMessage));
    }

    @Test
    public void test_06() {
        Driver.driver.findElement(By.cssSelector(".Footer__ButtonLabel-sc-1xqajj9-8.iFvXcY > span")).click();
        String expectedEmailMessage = "שדה אימייל הוא שדה חובה";
        String emailMessage = Driver.driver.findElement(By.cssSelector
                ("div:nth-of-type(2) > .Footer__InputError-sc-1xqajj9-5.fYJjBk > span")).getText();
        Assert.assertTrue("nameMessageError", emailMessage.contains(expectedEmailMessage));
    }

    @Test
    public void test_07() {
        Driver.driver.findElement(By.cssSelector(".Footer__ButtonLabel-sc-1xqajj9-8.iFvXcY > span")).click();
        String expectedPhoneNumberMessage = "שדה טלפון הוא שדה חובה";
        String phoneNumberMessage = Driver.driver.findElement(By.cssSelector
                ("div:nth-of-type(3) > .Footer__InputError-sc-1xqajj9-5.fYJjBk > span")).getText();
        Assert.assertTrue("nameMessageError", phoneNumberMessage.contains(expectedPhoneNumberMessage));
    }


}
