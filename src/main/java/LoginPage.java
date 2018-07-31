import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sun.rmi.runtime.Log;


public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    private By loginButton = By.xpath("//input[@id=\"loginform-username\"]");
    private By passButton = By.xpath("//input[@id=\"loginform-password\"]");
    private By langButton = By.xpath("//label[text()=\"Language\"]/following-sibling::select[@name=\"LoginForm[language]\"]");
    private String optionLangButton = "//label[text()=\"Language\"]/following-sibling::select/option[text()='%s']";
    private By entryButton = By.xpath("//button[@id=\"login-submit\"]");
    private By errorUserName = By.xpath("//input[@id=\"loginform-username\"]/following-sibling::div[text()=\"Login cannot be blank.\"]");
    private By errorPassword = By.xpath("//input[@id=\"loginform-password\"]/following-sibling::div[text()=\"Password cannot be blank.\"]");
    private By errorLogin = By.xpath("//input[@id=\"loginform-password\"]/following-sibling::div[text()=\"Error of login\"]");
    /*private By capcha = By.xpath("//input[@id=\"loginform-verify_code\"]");*/
    private By windowAuthorization = By.xpath("//div[@id=\"login-form\"]");

    public LoginPage typeUserName (String username) {
        driver.findElement(loginButton).sendKeys(username);
        return this;

    }

    public LoginPage typePassword (String password) {
        driver.findElement(passButton).sendKeys(password);
        return this;

    }

//    public LoginPage capcha (String name) {
//        driver.findElement(capcha).sendKeys("test");
//        return this;
//    }

    public LoginPage selectOptionLangButton ( String option ) {
        driver.findElement(langButton).click();
        String optionXpath = String.format(optionLangButton, option);
        driver.findElement(By.xpath(optionXpath)).click();
        return this;
    }

    public void clearUserNameField () {
        driver.findElement(loginButton).clear();
    }

    public void clearPasswordField () {
        driver.findElement(passButton).clear();
    }


    public MainPage logInWithValidField (String username, String password, String option) {
        this.clearUserNameField();
        this.clearPasswordField();
        this.typeUserName(username);
        this.typePassword(password);
        this.selectOptionLangButton(option);
        driver.findElement(entryButton).click();
        return new MainPage(driver);
    }

    public LoginPage logInWithEmptyField(String username, String password, String option) {
        this.clearUserNameField();
        this.clearPasswordField();
        this.selectOptionLangButton(option);
        driver.findElement(entryButton).click();
        return this;
    }

    public LoginPage logInWithInvalidField (String username, String password, String option) {
        this.clearUserNameField();
        this.clearPasswordField();
        this.typeUserName(username);
        this.typePassword(password);
        this.selectOptionLangButton(option);
        driver.findElement(entryButton).click();
        return this;
    }

    public String getErrorTextUserName() {
       return driver.findElement(errorUserName).getText();
    }

    public String getErrorPassword() {
        return driver.findElement(errorPassword).getText();
    }

    public String getErrorLogin() {
        return driver.findElement(errorLogin).getText();
    }

    public void getWindowAutorization () {
        driver.findElement(windowAuthorization);
    }
}
