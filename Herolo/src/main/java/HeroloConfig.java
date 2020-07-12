import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Set;

public class HeroloConfig {

    public static String getData (String keyName) throws ParserConfigurationException, IOException, SAXException {

        File configXmlFile = new File(HeroloConfig.class.getClassLoader().getResource("HeroloConfig.xml")
                .getPath());

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;

        dBuilder = dbFactory.newDocumentBuilder();

        Document doc = null;

        assert dBuilder != null;
        doc = dBuilder.parse(configXmlFile);

        if (doc != null) {
            doc.getDocumentElement().normalize();
        }
        assert doc != null;
        return doc.getElementsByTagName(keyName).item(0).getTextContent();
    }

    public static void SwitchTab () {
        Set<String> windowHandles = Driver.driver.getWindowHandles();
        String firstTab = windowHandles.iterator().next();
        Driver.driver.switchTo().window(firstTab);
    }
}
