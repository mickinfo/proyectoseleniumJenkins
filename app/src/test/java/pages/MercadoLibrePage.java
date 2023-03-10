package pages;

public class MercadoLibrePage extends BasePage {

  private static String inputSearch = "//*[@id='cb1-edit']";

  public MercadoLibrePage() {
    super(driver);
  }

  public void navigateToMercadoLibrePage() {
    navigateTo("https://www.mercadolibre.cl");
  }

  public void enterSearchCriteria(String criteria) {
    write(inputSearch, criteria);
  }
}
