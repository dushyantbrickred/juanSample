import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
    protected WebDriver driver;

    //Sensible data like these two fields should be in a properties file, included in git ignore (never checked in)
    protected String validUserName = "standard_user";
    protected String validPassword = "secret_sauce";

    private String baseUrl = "https://www.saucedemo.com/";

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "<INSERT CHROMEDRIVER PATH HERE>");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
