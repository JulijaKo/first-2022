package hw3;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LocatorsHomePage {

    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
    private final By SEARCH_LOGO = By.xpath(".//div[@class = 'logo']");
    private final By CURRENT = By.id("currentCurrency");
    private final String LOG_IN = "my-booking trigger-login";
    private final By PICK_UP_LOCATION = By.xpath(".//div[@class = 'home-caption']");
    private final By DATE_FIELD = By.xpath(".//div[@class = 'fake-field clearfix']");
    private final By RESIDENCE_COUNTRY = By.xpath(".//span[@class = 'sb-residence-text']");
    private final By SEARCH_BTN = By.xpath(".//div[@class ='sb-button']");
    private final By SLIDER = By.id("review-arrow-left");
    private final By RECOMMENDED_WIDGETS = By.xpath(".//div[@class ='tp-widget-review']");
    private final By HEADER_WE_COMPARE = By.xpath(".//div[@class='row is-table-row']");



    @Test
    public void openHomePageCheck() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.discovercars.com/");

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));
        browser.findElement(ACCEPT_COOKIES_BTN).click();









    }
}
