import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Ark on 26.05.2016.
 */
public class HomePage {
    By mailButton = By.xpath(".//*[@id='mainmenu']/ul/li[3]/a");

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMailButton() {
        driver.findElement(mailButton).click();
    }
}
