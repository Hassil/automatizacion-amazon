package configuracion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;

public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = createDriver();
            driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }

    private static WebDriver createDriver() {

        if (ProjectProperties.getProperties().getProperty("browser.name").equals(FIREFOX)) {
            driver = new FirefoxDriver();
        } else if (ProjectProperties.getProperties().getProperty("browser.name").equals(CHROME)) {
           // ChromeOptions options = new ChromeOptions();
          //  options.addArguments("windows-size=1400,600");
           // options.addArguments("headless");

            driver = new ChromeDriver();

        }
        return driver;
    }

    public static void deleteDriver() {
        if (driver != null) {
            driver.quit();
        }

        System.out.println("La instancia de driver fue eliminada con éxito.");
    }
}
