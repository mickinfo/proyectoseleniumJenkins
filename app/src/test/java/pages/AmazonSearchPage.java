package pages;

public class AmazonSearchPage extends BasePage {
  
  private String inputSearchBox = "//*[@id='twotabsearchtextbox']";
  private String searchButton = "//*[@id='nav-search-submit-button']";
  private String thirdResult = "//*[@id='search']/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a";
  private String addCartButton = "//*[@id='add-to-cart-button']";
  private String addMessageText = "//span[contains(text(),'Agregado al carrito')]";

  public AmazonSearchPage() {
    super(driver);
  }
  public void navigateToAmazon() {
    navigateTo("https://www.amazon.com");
  }
  public void enterSearchCriteria(String criteria) {
    write(inputSearchBox, criteria); 
  } 
  public void clickSearchAmazon() {
    clickElement(searchButton);
  }
  public void goToPage2(String pageNumber){
    //* Ir hacia esa pagina
    goToLinkText(pageNumber);
  }
  public void pick3rdItem() {
    clickElement(thirdResult);
  }
  public void addToCard() {
    clickElement(addCartButton);
  }
  public String addedToCartMessage() {
    return textFromElement(addMessageText);
  }

}
