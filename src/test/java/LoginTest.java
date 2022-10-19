import Pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    String wrongUserName = "asd";

    @Test
    public void wrongLoginNameTest() {
        String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(wrongUserName, validPassword);
        String actualErrorMessage = loginPage.getErrorMessage();
        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Test
    public void validLoginTest() {
        String expectedHeaderText = "PRODUCTS";
        String actualHeaderText = new LoginPage(driver)
                .login(validUserName, validPassword)
                .getHeaderText();
        Assertions.assertEquals(expectedHeaderText, actualHeaderText);
    }

}
