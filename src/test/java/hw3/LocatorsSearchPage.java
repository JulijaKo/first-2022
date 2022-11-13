package hw3;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LocatorsSearchPage {
    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
    private final By SPECIAL_OFFERS_BLOCK = By.xpath(".//div[@class = 'flt-type']");
    private final By MIN_PRICE = By.xpath(".//span[@class ='min-price']");
    private final By GASOLINE = By.id("filter-fuel-type");
    private final By NUMBER_OF_SEATS = By.id("filter-number-of-seats");
    private final By SMALL_CAR = By.id("car-groups-small");
    private final By FILTER_CONTROL_NEXT = By.xpath(".//div[@class='car-top-filter-control next']");
    private final By SHOWING_CARS = By.xpath(".//span[@class ='showing-cars']");
    private final String ONE_BAG = "1 bag";
    private final By RENTAL_CONDITIONS = By.xpath(".//div[@class = 'rc-link']");
    private final By VIEW = By.xpath(".//div[@class = 'ca-table-cell top']");
    private final By PARTIAL_PREPAYMENT = By.xpath(".//span[@class ='dc-ui badge badge-medium badge-blue']");
    private final By SUPPLIER_RATING = By.xpath(".//div[@class ='supplier-rating']");
    private final By PRICE_ITEM = By.xpath(".//div[@class ='price-item-price-main']");


    @Test
    public void openSearchPageCheck() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://www.discovercars.com/en/search/a3fcefc9-6d2c-43c5-ad59-f4b93ed016cc");

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));
        browser.findElement(ACCEPT_COOKIES_BTN).click();
    }
}
