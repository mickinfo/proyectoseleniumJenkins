package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.TestDropDownPage;

public class TestDropDownSteps {

  TestDropDownPage testDropDown = new TestDropDownPage();

  @Given("^I navigate to the web page$")
  public void navigateToDropDownSite() {
    testDropDown.navigateTestDropDown();
  }

  @And("^select a value from the dropdown$")
  public void selectState() {
    testDropDown.selectCategory("1");
  }
}
