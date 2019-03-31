package steps;

import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
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
        cartPage.waitPageLoaded();
        cartPage.clickOnElement(cartPage.mainSearch);
        cartPage.inputInField(cartPage.mainSearch, value);
    }

    @When("нажимаем кнопку поиска")
    public void goSearch() {
        cartPage.clickOnElement(cartPage.goButton);
    }

    @When("выбираем \"(.+)\" товаров и нажимаем купить")
    public void buyProducts(int value) {
        for (int i = 0; i < value; i++) {
            buyPage.goodsList.get(i).findElement(By.xpath(".//child::div[@class=\"buy-button-container\"]")).click();
            buyPage.getGoodsName().add(buyPage.goodsList.get(i).findElement(By.xpath(".//child::div[@data-test-id=\"tile-name\"]")).getText());
        }
        buyPage.setGoodsName(buyPage.getGoodsName());
    }

    @When("проверяем что выбранные товары в корзине")
    public void checkProducts() {
        Assert.assertEquals(cartPage.goodsList.get(0).getText().replace(", Black", ""), buyPage.getGoodsName().get(4));
        Assert.assertEquals(cartPage.goodsList.get(1).getText().replace(", Black", ""), buyPage.getGoodsName().get(3));
        Assert.assertEquals(cartPage.goodsList.get(2).getText().replace(", цвет: черный", ""), buyPage.getGoodsName().get(2));
        Assert.assertEquals(cartPage.goodsList.get(3).getText(), buyPage.getGoodsName().get(1));
        Assert.assertEquals(cartPage.goodsList.get(4).getText().replace(", Black", ""), buyPage.getGoodsName().get(0));
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