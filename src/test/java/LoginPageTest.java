import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPageTest {
    private WebDriver driver;
    private LoginPage loginPage;
    private MainPage mainPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/irina_okhotina/Документы/Projects/pageobjectseleniumtest/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://office-lk-rc7-dev.alfaforex.com/index/login");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void logInWithEmptyField () {
        loginPage.logInWithEmptyField("","","English");
        String errorUserName = loginPage.getErrorTextUserName();
        String errorPassword = loginPage.getErrorPassword();
        Assert.assertEquals("Login cannot be blank.", errorUserName);
        Assert.assertEquals("Password cannot be blank.", errorPassword);
    }


    @Test
    public void logInWithInvalidField () {
        loginPage.logInWithInvalidField("sss","eed", "Russian");
        String errorLogin = loginPage.getErrorLogin();
        Assert.assertEquals("Error of login", errorLogin);

    }

    @Test
    public void logInWithValidField () {
        MainPage mainPage = loginPage.logInWithValidField("Alena", "QWEasd123", "Russian");
        String nameProfile = mainPage.getNameProfile();
        Assert.assertEquals("Алена Житницкая", nameProfile);

    }

    @Test
    public void logOut () {
        MainPage mainPage = loginPage.logInWithValidField("Alena", "QWEasd123", "Russian");
        mainPage.logOut();
        loginPage.getWindowAutorization();

    }

    @After
    public void tearDown() {
        driver.quit();
    }






}
