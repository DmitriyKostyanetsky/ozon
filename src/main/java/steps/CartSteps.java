package steps;

import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.BuyPage;
import pages.CartPage;

public class CartSteps {

    private BuyPage buyPage = new BuyPage();
    private CartPage cartPage = new CartPage();

    @When("нажимаем кнопку Войдите")
    public void entrance() {
        cartPage.clickOnElement(cartPage.entrance);
    }

    @When("нажимаем кнопку Войти по почте")
    public void entranceToMail() {
        cartPage.clickOnElement(cartPage.entranceToMail);
    }

    @When("заполняем логин \"(.+)\"")
    public void inputMail(String value) {
        cartPage.clickOnElement(cartPage.inputMail);
        cartPage.inputInField(cartPage.inputMail, value);
    }

    @When("заполняем пароль \"(.+)\"")
    public void inputPassword(String value) {
        cartPage.clickOnElement(cartPage.inputPassword);
        cartPage.inputInField(cartPage.inputPassword, value);
    }

    @When("нажимаем кнопку Войти после введенных логин пароль")
    public void entranceToCabinet() {
        cartPage.clickOnElement(cartPage.entranceButton);
    }

    @When("выбираем в главном поиске значения \"(.+)\"")
    public void mainSearch(String value) {
        cartPage.clickOnElement(cartPage.mainSearch);
        cartPage.inputInField(cartPage.mainSearch, value);
    }

    @When("нажимаем кнопку поиска")
    public void goSearch() {
        cartPage.clickOnElement(cartPage.goButton);
    }

    @When("проверяем что 5 выбранных товаров в корзине \"(.+)\", \"(.+)\", \"(.+)\", \"(.+)\", \"(.+)\"")
    public void checkProducts(String first, String second, String third, String fourth, String fifth) {
        Assert.assertEquals(cartPage.goodsList.get(0).getText(), fifth);
        Assert.assertEquals(cartPage.goodsList.get(1).getText(), fourth);
        Assert.assertEquals(cartPage.goodsList.get(2).getText(), third);
        Assert.assertEquals(cartPage.goodsList.get(3).getText(), second);
        Assert.assertEquals(cartPage.goodsList.get(4).getText(), first);
    }

    @When("удаляем все товары из корзины")
    public void deleteProducts() {
        cartPage.clickOnElement(cartPage.deleteGoodsButton);
        cartPage.clickOnElement(cartPage.acceptToDelete);
    }

    @When("разлогиниваемся")
    public void logOut() {
        cartPage.clickOnElement(cartPage.userButton);
        cartPage.clickOnElement(cartPage.logOut);
    }

    @When("проверяем что корзина пустая")
    public void emptyCart() {
        if (cartPage.checkCartEmpty.getText().equals("Корзина пуста")) {
            return;
        }
        Assert.fail("Корзина не пуста");
    }
}