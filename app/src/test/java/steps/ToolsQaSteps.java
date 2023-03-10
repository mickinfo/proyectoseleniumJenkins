package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.ToolQaPage;

public class ToolsQaSteps {
  
  ToolQaPage tools = new ToolQaPage();

  @Given("^I navigate to the Qa website")
  public void navigateToToolQa() {
    tools.navigateToQaWeb();
  }

  @And("^send file$")
  public void setFile() {
    tools.sendFile();
  }
}
