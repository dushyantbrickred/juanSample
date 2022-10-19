package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShoppingCartPage extends BasePage{

    @FindBy(xpath = "//div[@class='cart_list']//a")
    List<WebElement> cartList;

    public ShoppingCartPage(WebDriver driver){
        super(driver);
    }

    public boolean isElementInList(String element){
        return cartList.stream().anyMatch(item -> item.getText().equals(element));
    }

}
