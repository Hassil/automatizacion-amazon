package configuracion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InicializarPage {

    public static WebDriver driver = DriverFactory.getDriver();


    protected static void init(Class page){
        PageFactory.initElements(driver, page);
    }
}