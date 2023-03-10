package pages;

public class TestDropDownPage extends BasePage {
  
  private String myDropdown = "//select[@id='dropdown']";
  public TestDropDownPage() {
    super(driver);
  }

  public void navigateTestDropDown() {
    navigateTo("https://the-internet.herokuapp.com/dropdown");
  }

  public void selectCategory(String category) {
    selectFromDropDownByValue(myDropdown, category);
  }
}
