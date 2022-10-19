package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "user-name")
    WebElement userNameTextBox;

    @FindBy(id = "password")
    WebElement passwordTextBox;

    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement loginErrorMessage;

    public LoginPage(WebDriver driver){
        super(driver);
    }

    private LoginPage enterUserName(String userName){
        userNameTextBox.sendKeys(userName);
        return this;
    }

    private LoginPage enterPassword(String password){
        passwordTextBox.sendKeys(password);
        return this;
    }

    private CatalogPage clickLoginButton(){
        loginButton.click();
            return new CatalogPage(driver);
    }

    public String getErrorMessage(){
        return loginErrorMessage.getText();
    }

    public CatalogPage login(String userName, String password){
        return enterUserName(userName).enterPassword(password).clickLoginButton();
    }

}
