import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Communication {

    private WebDriver driver;

    public Communication(WebDriver driver) {
        this.driver = driver;
    }

    private By dashboard = By.xpath("//div[@id=\"top-navigation\"]/descendant::li[2]/a");
    private By table = By.xpath("//table[@class=\"table table-bordered table-striped\"]");

    public String getTextDashboard (){
        return driver.findElement (dashboard).getText();
    }



}
