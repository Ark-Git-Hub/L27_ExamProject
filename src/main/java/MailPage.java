import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Ark on 26.05.2016.
 */
public class MailPage {
    By mailContent = By.xpath(".//span[@class='b-folders__folder__counters__total']");

    private final WebDriver driver;

    public MailPage(WebDriver driver) {
        this.driver = driver;
    }

    public int countMails() {
        String delim = "/";
        String[] text = driver.findElement(mailContent).getText().split(delim);
        return Integer.parseInt(text[1].trim());
    }

}
