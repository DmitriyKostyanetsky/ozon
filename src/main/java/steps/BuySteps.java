package steps;

import cucumber.api.java.en.When;
import pages.BuyPage;

public class BuySteps {

    private BuyPage buyPage = new BuyPage();

    @When("выбираем 5 товаров и нажимаем купить")
    public void buyProducts() {
        buyPage.clickOnElement(buyPage.firstGood);
        buyPage.clickOnElement(buyPage.secondGood);
        buyPage.clickOnElement(buyPage.thirdGood);
        buyPage.clickOnElement(buyPage.fourthGood);
        buyPage.clickOnElement(buyPage.fifthGood);
    }
}