import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Ark on 26.05.2016.
 */
public class LoginPage {
    By userLogin = By.xpath(".//*[@id='Username']");
    By userPassword = By.xpath(".//*[@id='Password']");
    By buttonInput = By.xpath(".//*[@id='form']/fieldset/div[3]/input");

    private final WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void insertLogin(String login) {
        driver.findElement(userLogin).sendKeys(login);
    }
    public void insertPassword(String password) {
        driver.findElement(userPassword).sendKeys(password);
    }
    public void submitLogin() {
        driver.findElement(buttonInput).click();
    }

}
