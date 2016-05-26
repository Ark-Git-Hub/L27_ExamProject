import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by Ark on 26.05.2016.
 */
public class MailPageTest {
    private WebDriver driver;
    static final String LOGIN = "testforOTS";
    static final String PASSWORD = "ZXCvbn123";
    static final int MAILCOUNT = 41;

    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://www.tut.by/");
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }

    @Test
    public void gotoMailPage() {
        HomePage homePage = new HomePage(driver);
        homePage.clickMailButton();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.insertLogin(LOGIN);
        loginPage.insertPassword(PASSWORD);
        loginPage.submitLogin();

        MailPage mailPage = new MailPage(driver);
        int mailCnt = mailPage.countMails();
        assertEquals(MAILCOUNT, mailCnt);
    }

}
