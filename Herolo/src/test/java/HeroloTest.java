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
    public void test_3() {
        Whatsapp.pressWhatsapp();
        HeroloConfig.SwitchTab();
    }

    @Test
    public void test_4() throws IOException, SAXException, ParserConfigurationException {
        TalkToUs.talkToUsFillInForm(HeroloConfig.getData("talkToUsName"),
                HeroloConfig.getData("talkToUsCompany"),
                HeroloConfig.getData("talkToUsEmail"),
                HeroloConfig.getData("talkToUsPhoneNumber"));
        Driver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Driver.driver.findElement(By.cssSelector(".idImZT.thankYou__backLink-bl9e43-10 > span")).click();
    }


}
