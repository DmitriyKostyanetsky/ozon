package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Init;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Init.getDriver(), this);
    }

    public void clickOnElement(WebElement element) {
        Wait<WebDriver> wait = new WebDriverWait(Init.getDriver(), 30, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void inputInField(WebElement element, String inputText) {
        element.clear();
        element.sendKeys(inputText);
    }

    /**
     * Проскролить до элемента
     */
    public void scrollDown(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Init.getDriver();
        Assert.assertNotNull(element);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public boolean isElementPresent(WebElement element) {
        try {
            Init.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
        finally {
            Init.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }

    public void waitPageLoaded(){
        WebDriverWait wait = new WebDriverWait(Init.getDriver(), 30);
        wait.ignoring(NoSuchElementException.class).until((ExpectedCondition<Boolean>) driver ->
                !isPresent( By.xpath("//*[@class='helpers-params loading']")));
    }

    public boolean isPresent(By locator){
        try {
            Init.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            return Init.getDriver().findElement(locator).isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }finally {
            Init.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }
    }
}