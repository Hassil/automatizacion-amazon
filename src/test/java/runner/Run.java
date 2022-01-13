package runner;

import configuracion.DriverFactory;
import org.openqa.selenium.WebDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class Run  extends AbstractTestNGCucumberTests{
    public static WebDriver driver = DriverFactory.getDriver();
}
