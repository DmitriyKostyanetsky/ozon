package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(xpath = "//a[@data-v-e638740c]")
    public WebElement entrance;

    @FindBy(xpath = "//*[@data-test-id=\"goToEmailLink\"]")
    public WebElement entranceToMail;

    @FindBy(xpath = "//input[@data-test-id=\"emailField\"]")
    public WebElement inputMail;

    @FindBy(xpath = "//input[@data-test-id=\"passwordField\"]")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@data-test-id=\"loginFormSubmitButton\"]")
    public WebElement entranceButton;

    @FindBy(xpath = "//input[@data-test-id=\"header-search-input\"]")
    public WebElement mainSearch;

    @FindBy(xpath = "//button[@data-test-id=\"header-search-go\"]")
    public WebElement goButton;

    @FindBy(xpath = "//div[@data-v-7723c718]//child::div[@class=\"main split-item\"]//a[@data-test-id=\"cart-item-title\"]")
    public List<WebElement> goodsList;

    @FindBy(xpath = "//button[@data-test-id=\"cart-delete-selected-btn\"]")
    public WebElement deleteGoodsButton;

    @FindBy(xpath = "//button[@data-test-id=\"checkcart-confirm-modal-confirm-button\"]")
    public WebElement acceptToDelete;

    @FindBy(xpath = "//span[@data-test-id=\"header-my-ozon-user\"]")
    public WebElement userButton;

    @FindBy(xpath = "//span[@data-test-id=\"header-my-ozon-logout\"]")
    public WebElement logOut;

    @FindBy(xpath = "//h1[contains(text(),'Корзина пуста')]")
    public WebElement checkCartEmpty;
}