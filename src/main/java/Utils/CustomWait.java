package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CustomWait extends WebDriverWait {
    public CustomWait(WebDriver driver, long timeOutInSeconds) {
        super(driver, Duration.ofSeconds(timeOutInSeconds));
    }
}