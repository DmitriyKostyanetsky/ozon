package steps;

import cucumber.api.java.en.When;
import pages.MainPage;

public class MainSteps {


    @When("переход на страницу с корзиной")
    public void loadPage() {
        MainPage mainPage = new MainPage();
        mainPage.clickOnElement(mainPage.goToCart);
    }
}