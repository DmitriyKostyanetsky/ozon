package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"142408221\"]//button")
    public WebElement firstGood;

    @FindBy(xpath = "//*[@id=\"142408242\"]//button")
    public WebElement secondGood;

    @FindBy(xpath = "//*[@id=\"147034039\"]//button")
    public WebElement thirdGood;

    @FindBy(xpath = "//*[@id=\"140981081\"]//button")
    public WebElement fourthGood;

    @FindBy(xpath = "//*[@id=\"138208703\"]//button")
    public WebElement fifthGood;

    @FindBy(xpath = "//*[@id=\"142408221\"]//div[@data-test-id=\"tile-name\"]")
    public WebElement firstGoodName;

    @FindBy(xpath = "//*[@id=\"142408242\"]//div[@data-test-id=\"tile-name\"]")
    public WebElement secondGoodName;

    @FindBy(xpath = "//*[@id=\"147034039\"]//div[@data-test-id=\"tile-name\"]")
    public WebElement thirdGoodName;

    @FindBy(xpath = "//*[@id=\"140981081\"]//div[@data-test-id=\"tile-name\"]")
    public WebElement fourthGoodName;

    @FindBy(xpath = "//*[@id=\"138208703\"]//div[@data-test-id=\"tile-name\"]")
    public WebElement fifthGoodName;
}