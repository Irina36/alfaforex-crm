import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By heading = By.xpath("//a[text()=\"AF Office\"]");
    private By managerProfile = By.xpath("//*[@id=\"mainbody\"]/footer/div/div[2]/a[1]");
    private By exitProfile = By.xpath("//*[@id=\"mainbody\"]/footer/div/div[2]/a[2]");
    private By languageRu = By.xpath("//div[@id=\"language-panel\"]/a[@title='Русский']");
    private By languageEn = By.xpath("//div[@id=\"language-panel\"]/a[@title='Английский']");

    // Icon
    private By iconCollback = By.xpath("//a[@id='communication_callback']");
    private By iconBond = By.xpath("//a[@id='bond_request']");
    private By iconDeposit = By.xpath("//a[@id='deposit_validation_count']");

    // *Communication
    private By communication = By.xpath("//ul[@id=\"w4\"]/li[1]/a");

    // *Customer
    private By customer = By.xpath("//ul[@id=\"w4\"]/li[2]/a");
    private By customerList = By.xpath("//ul[@id=\"w4\"]/li[2]/ul[@class='dropdown-menu']/li[1]/a");
    private By customerDocuments = By.xpath("//ul[@id=\"w4\"]/li[2]/ul[@class='dropdown-menu']/li[2]/a");
    private By complianceControl = By.xpath("//ul[@id=\"w4\"]/li[2]/ul[@class='dropdown-menu']/li[3]/a");

    // *Accounts
    private By account = By.xpath("//ul[@id=\"w4\"]/li[3]/a");
    private By accountTraiding = By.xpath("//ul[@id=\"w4\"]/li[3]/ul[@class='dropdown-menu']/li[1]/a");
    private By accountPamms = By.xpath("//ul[@id=\"w4\"]/li[3]/ul[@class='dropdown-menu']/li[2]/a");
    private By accountBank = By.xpath("//ul[@id=\"w4\"]/li[3]/ul[@class='dropdown-menu']/li[3]/a");
    private By webmoneyWallet = By.xpath("//ul[@id=\"w4\"]/li[3]/ul[@class='dropdown-menu']/li[4]/a");
    private By accountInvest = By.xpath("//ul[@id=\"w4\"]/li[3]/ul[@class='dropdown-menu']/li[5]/a");
    private By investBond = By.xpath("//ul[@id=\"w4\"]/li[3]/ul[@class='dropdown-menu']/li[6]/a");
    private By accountDemo = By.xpath("//ul[@id=\"w4\"]/li[3]/ul[@class='dropdown-menu']/li[7]/a");

    // *Payments
    private By payments = By.xpath("//ul[@id=\"w4\"]/li[4]/a");
    private By depositManual = By.xpath("//ul[@id=\"w4\"]/li[4]/ul[@class='dropdown-menu']/li[1]/a");
    private By deposits = By.xpath("//ul[@id=\"w4\"]/li[4]/ul[@class='dropdown-menu']/li[2]/a");
    private By withdrawal = By.xpath("//ul[@id=\"w4\"]/li[4]/ul[@class='dropdown-menu']/li[3]/a");
    private By transferInternal = By.xpath("//ul[@id=\"w4\"]/li[4]/ul[@class='dropdown-menu']/li[4]/a");
    private By conversionMoney = By.xpath("//ul[@id=\"w4\"]/li[4]/ul[@class='dropdown-menu']/li[5]/a");
    private By requestPamm = By.xpath("//ul[@id=\"w4\"]/li[4]/ul[@class='dropdown-menu']/li[6]/a");
    private By requestBond = By.xpath("//ul[@id=\"w4\"]/li[4]/ul[@class='dropdown-menu']/li[7]/a");
    private By depositCardholderValidation = By.xpath("//ul[@id=\"w4\"]/li[4]/ul[@class='dropdown-menu']/li[8]/a");
    private By withdrawalUOVR = By.xpath("//ul[@id=\"w4\"]/li[4]/ul[@class='dropdown-menu']/li[9]/a");
    private By withdrawalSales = By.xpath("//ul[@id=\"w4\"]/li[4]/ul[@class='dropdown-menu']/li[10]/a");

    // *Support
    private By support = By.xpath("//ul[@id=\"w4\"]/li[5]/a");
    private By sms = By.xpath("//ul[@id=\"w4\"]/li[5]/ul[@class='dropdown-menu']/li[1]/a");

    // Sub Partnership admin zone
    private By partnershipAdminZone = By.xpath("//ul[@id=\"w4\"]/li[5]/ul[@class='dropdown-menu']/li[2]/a");
    private By approvements = By.xpath("//ul[@id=\"w4\"]/li[5]/ul[@class='dropdown-menu']/li[2]/ul/li[1]/a");
    private By partnerSites = By.xpath("//ul[@id=\"w4\"]/li[5]/ul[@class='dropdown-menu']/li[2]/ul/li[2]/a");

    // Sub Log list
    private By logList = By.xpath("//ul[@id=\"w4\"]/li[5]/ul[@class='dropdown-menu']/li[3]/a");
    private By backend = By.xpath("//ul[@id=\"w4\"]/li[5]/ul[@class='dropdown-menu']/li[3]/ul/li[1]/a");
    private By frontend = By.xpath("//ul[@id=\"w4\"]/li[5]/ul[@class='dropdown-menu']/li[3]/ul/li[2]/a");
    private By logMT = By.xpath("//ul[@id=\"w4\"]/li[5]/ul[@class='dropdown-menu']/li[3]/ul/li[3]/a");
    private By errorLogs = By.xpath("//ul[@id=\"w4\"]/li[5]/ul[@class='dropdown-menu']/li[3]/ul/li[4]/a");

    //Sub PAMM
    private By pamm = By.xpath("//ul[@id=\"w4\"]/li[5]/ul[@class='dropdown-menu']/li[4]/a");
    private By rollovers = By.xpath("//ul[@id=\"w4\"]/li[5]/ul[@class='dropdown-menu']/li[4]/ul/li[1]/a");
    private By fixShareCountUtil = By.xpath("//ul[@id=\"w4\"]/li[5]/ul[@class='dropdown-menu']/li[4]/ul/li[2]/a");

    // Sub Study
    private By study = By.xpath("//ul[@id=\"w4\"]/li[5]/ul[@class='dropdown-menu']/li[5]/a");
    private By category = By.xpath("//ul[@id=\"w4\"]/li[5]/ul[@class='dropdown-menu']/li[5]/ul/li[1]/a");
    private By material = By.xpath("//ul[@id=\"w4\"]/li[5]/ul[@class='dropdown-menu']/li[5]/ul/li[2]/a");

    private By tickets = By.xpath("//ul[@id=\"w4\"]/li[5]/ul[@class='dropdown-menu']/li[6]/a");
    private By customerNotification = By.xpath("//ul[@id=\"w4\"]/li[5]/ul[@class='dropdown-menu']/li[7]/a");
    private By email = By.xpath("//ul[@id=\"w4\"]/li[5]/ul[@class='dropdown-menu']/li[8]/a");
    private By promo = By.xpath("//ul[@id=\"w4\"]/li[5]/ul[@class='dropdown-menu']/li[9]/a");

    // *Services
    private By services = By.xpath("//ul[@id=\"w4\"]/li[6]/a");

    // Sub Reports
    private By reports = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[1]/a");
    private By compliance = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[1]/ul/li[1]/a");
    private By reportTracking = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[1]/ul/li[2]/a");
    private By lk = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[1]/ul/li[3]/a");
    private By deposit = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[1]/ul/li[4]/a");
    private By trade = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[1]/ul/li[5]/a");
    private By partner = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[1]/ul/li[6]/a");
    private By searchCommunication = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[1]/ul/li[7]/a");
    private By searchAccount = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[1]/ul/li[8]/a");
    private By reportSearchBulkmail = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[1]/ul/li[9]/a");
    private By reportSales = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[1]/ul/li[10]/a");
    private By convertationReport = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[1]/ul/li[11]/a");
    private By partnerTurnoverReport = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[1]/ul/li[12]/a");

    // Sub Api
    private By api = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[2]/a");
    private By users = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[2]//ul/li[1]/a");
    private By logApi = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[2]//ul/li[2]/a");

    // Sub Desktops
    private By desktops = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[3]/a");
    private By desktop = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[3]/ul/li[1]/a");
    private By customerDesktopType = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[3]/ul/li[2]/a");

    private By bulkmailEmail = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[4]/a");
    private By trakingUrls = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[5]/a");
    private By partnerBanner = By.xpath("//ul[@id=\"w4\"]/li[6]/ul[@class='dropdown-menu']/li[6]/a");

    // *Settings
    private By settings = By.xpath("//ul[@id=\"w4\"]/li[7]/a");

    // Sub Permission
    private By permissions = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[1]/a");
    private By rolesAccess = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[1]/ul/li[1]/a");
    private By managers = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[1]/ul/li[2]/a");
    private By position = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[1]/ul/li[3]/a");
    private By department = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[1]/ul/li[4]/a");
    private By rolesFrontend = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[1]/ul/li[5]/a");

    // Sub Payment Settings
    private By paymentSettings = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[2]/a");
    private By paymentSystems = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[2]/ul/li[1]/a");
    private By paymentSystemGroups = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[2]/ul/li[3]/a");
    private By filterWithdrawal = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[2]/ul/li[4]/a");
    private By cryptoCurrencyAvailability = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[2]/ul/li[5]/a");
    private By cryptoCurrencyFee = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[2]/ul/li[6]/a");
    private By cryptoCurrency = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[2]/ul/li[5]/a");

    // Sub Tracking Setings
    private By trackingSettings = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[3]/a");
    private By countrySettings = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[3]/ul/li[1]/a");
    private By mediumSettings = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[3]/ul/li[2]/a");
    private By compainSettings = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[3]/ul/li[3]/a");
    private By sourceSettings = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[3]/ul/li[4]/a");

    // Sub CRM
    private By crm = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[4]/a");
    private By smartflowSubject = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[4]/ul/li[1]/a");
    private By smartflowMarkup = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[4]/ul/li[2]/a");
    private By configuration = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[4]/ul/li[3]/a");
    private By communicationReason = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[4]/ul/li[4]/a");
    private By reasonDetail = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[4]/ul/li[5]/a");
    private By smartflowTemplate = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[4]/ul/li[6]/a");
    private By refuseReason = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[4]/ul/li[7]/a");


    private By menuItems = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[5]/a");

    // Sub A-club Settings
    private By aclubSettings = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[6]/a");
    private By aclubDivisions = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[6]/ul/li[1]/a");
    private By aclubMenegers = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[6]/ul/li[2]/a");
    private By menuCoificient = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[6]/ul/li[3]/a");

    // Sub BRB Settings
    private By brbSettings = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[7]/a");
    private By brbDivisions = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[7]/a");
    private By brbManagers = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[7]/ul/li[1]/a");

    private By translations = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[8]/a");
    private By holidays = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[9]/a");
    private By loginRange = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[10]/a");
    private By convertationMarkup = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[11]/a");
    private By currencyRate = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[12]/a");
    private By ticketReport = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[13]/a");
    private By bondSettings = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[14]/a");
    private By bondsPortfolioSetting = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[15]/a");

    // Sub Executive Divisions
    private By executiveDivizions = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[16]/a");
    private By divisionsManager = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[16]/ul/li[1]/a");

    // Sub Mobile Apps
    private By mobileApps = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[17]/a");
    private By settingMobileApps = By.xpath("//ul[@id=\"w4\"]/li[7]/ul[@class='dropdown-menu']/li[17]/ul/li[1]/a");

    public String getHeading () {
           return driver.findElement(heading).getText();
        }
    public String getNameProfile () {
        return driver.findElement(managerProfile).getText();
    }
    public void logOut () {
         driver.findElement(exitProfile).click();
    }


}