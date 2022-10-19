package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends BasePage{

    @FindBy(xpath = "//div/span[@class = 'title']")
    WebElement headerContainer;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addBackpackToCartButton;

    @FindBy(id = "shopping_cart_container")
    WebElement shoppingCartButton;

    public CatalogPage(WebDriver driver){
        super(driver);
    }

    public String getHeaderText() {
        return headerContainer.getText();
    }

    public CatalogPage clickAddBackpackToCartButton(){
        addBackpackToCartButton.click();
        return this;
    }

    public ShoppingCartPage clickShoppingCartButton(){
        shoppingCartButton.click();
        return new ShoppingCartPage(driver);
    }

}
