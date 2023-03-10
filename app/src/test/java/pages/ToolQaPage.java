package pages;

public class ToolQaPage extends BasePage {

  private String fileButton = "//input[@id='uploadPicture']";

  public ToolQaPage() {
    super(driver);
  }

  public void navigateToQaWeb() {
    navigateTo("https://demoqa.com/automation-practice-form");
  }
  
  // public void clickButtoFile() {
  //   clickElement(fileButton);
  // }

  public void sendFile() {
    setValueFileButton(fileButton, "C:\\Users\\MIGUEL\\Desktop\\archivo\\github.png");
  }
}
