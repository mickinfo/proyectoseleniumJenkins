package steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.GridPage;

public class GridTestSteps {
  GridPage grid = new GridPage();

  @Given("^I navigate to the static table$")
  public void navigateToGridPage() {
    grid.navigateToGrid();
  }

  @Then("^I can return the value I wanted$")
  public void returnValue() {
    String value = grid.getValueFromGrid(3, 2);
    Assert.assertEquals("r: 2, c: 1", value);
    /*
    * 1. Navega a hacia un sitio web
    * 2. Hace una acción
    * 3. Prueba algo
     */
  }
  
  @Then("^I can validate the table is displayed$")
  public void theTableIsThere() {
    Assert.assertTrue("No Fallo, no existe!!", grid.gridStatus());
  }
}
