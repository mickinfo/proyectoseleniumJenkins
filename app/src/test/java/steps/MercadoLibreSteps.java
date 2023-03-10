package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.MercadoLibrePage;

public class MercadoLibreSteps {

  MercadoLibrePage  mercado = new MercadoLibrePage();
  
  @Given("^I am on the MercadoLibre search page$")
  public void navigateToMercadoLibre() {
    mercado.navigateToMercadoLibrePage();
  }

  @When("^I enter a search criteria mercado$")
  public void enterSearchCriteriaMercadoLibre() {
    mercado.enterSearchCriteria("Blue Yeti");
  }
}
