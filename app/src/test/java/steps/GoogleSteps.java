package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
// import cucumber.api.java.en.*;
import pages.GooglePage;

public class GoogleSteps {

  GooglePage google = new GooglePage();

  @Given("^I am on the Google search page$")
  public void navigateToGoogle() {
    google.navigateToGoogle();
  }

  @When("^I enter a search criteria$")
  public void enterSearchCriteria() {
    google.enterSearchCriteria("Java");
  }

  @And("^click on the search button$")
  public void clickSearchButton() {
    google.clickGoogleSearch();
  }

  @Then("^the results match the criteria$")
  public void validateResults() {
    //* De esta forma estamos creando un test desde Steps definitions */
    Assert.assertEquals("Descargar Java para Windows", google.firstResult());
    
  }
}
