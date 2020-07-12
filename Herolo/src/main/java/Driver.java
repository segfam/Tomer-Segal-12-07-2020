import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Driver {
    public static WebDriver driver;

    public static void chromeInit () throws IOException, SAXException, ParserConfigurationException {
        String webDriverName = HeroloConfig.getData("webDriverName");
        String chromePath = HeroloConfig.getData("chromePath");
        System.setProperty(webDriverName, chromePath);
        driver = new ChromeDriver();
    }
}
