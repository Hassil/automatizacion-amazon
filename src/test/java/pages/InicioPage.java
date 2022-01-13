package pages;

import configuracion.InicializarPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utileria.Log4J;

public class InicioPage extends InicializarPage {

    @FindBy(id = "twotabsearchtextbox")
    private static WebElement inputBarraBusqueda;

    @FindBy(id = "nav-search-submit-button")
    private static WebElement iconoBuscar;

    @FindBy(xpath = "//span[contains(text(),'resultados para')]")
    private static WebElement spanResultados;

    @FindBy(xpath = "//span[contains(text(),'Amazon Internacional')]")
    private static WebElement spanAmazonInternacional;

    @FindBy(xpath = "//span[contains(text(),'El principito (TD)')]")
    private static WebElement spanPrincipitoTD;

    @FindBy(xpath = "//span[contains(text(),'Literatura Infantil')]")
    private static WebElement spanLiteraturaInfantil;

    @FindBy(xpath = "//span[contains(text(),'El principito (Spanish)')]")
    private static WebElement spanPrincipitoSpanish;



    private static void initElements() {
        init(InicioPage.class);
    }

    public static void busquedaProducto(String producto) {
        initElements();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(inputBarraBusqueda)).click();
        inputBarraBusqueda.sendKeys(producto);
        wait.until(ExpectedConditions.elementToBeClickable(iconoBuscar)).click();
    }

    public static void validaResultados() {
        initElements();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(spanResultados));
        Log4J.info(spanResultados.getText());
    }

    public static void filtrarResultados() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(spanAmazonInternacional)).click();
        wait.until(ExpectedConditions.visibilityOf(spanPrincipitoTD));

        wait.until(ExpectedConditions.elementToBeClickable(spanLiteraturaInfantil)).click();
        wait.until(ExpectedConditions.visibilityOf(spanPrincipitoSpanish));
        System.out.println("Se encotró el producto: " + spanPrincipitoSpanish.getText());
    }
}
