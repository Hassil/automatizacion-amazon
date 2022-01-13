package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InicioPage;
import runner.Run;

public class InicioSteps  extends Run {

    InicioPage inicio = new InicioPage();

    @And("^la pagina de amazon a sido abierta$")
    public void laPaginaDeAmazonASidoAbierta() {
        String url = "https://www.amazon.com.mx/";
        driver.get(url);
    }

    @When("^busca el nombre del (.*)$")
    public void ingreseElNombreDelProducto(String producto) {

        inicio.busquedaProducto(producto);
    }

    @Then("^aparecen los resultados$")
    public void aparecenLosResultados() {
        inicio.validaResultados();
    }

    @Given("^al seleccionar filtros$")
    public void alSeleccionaElFiltroAmazonInternacional() {
        inicio.filtrarResultados();
    }
}
