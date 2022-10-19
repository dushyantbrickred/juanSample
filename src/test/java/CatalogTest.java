import Pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatalogTest extends BaseTest {

    @Test
    public void addBackpackToCart() {
        String expectedProduct = "Sauce Labs Backpack";
        Assertions.assertTrue(new LoginPage(driver)
                .login(validUserName, validPassword)
                .clickAddBackpackToCartButton()
                .clickShoppingCartButton()
                .isElementInList(expectedProduct));
    }
}
