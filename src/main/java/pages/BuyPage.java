package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class BuyPage extends BasePage {

    @FindBy(xpath = "//div[@class=\"tiles\"]//child::div[@id]")
    public List<WebElement> goodsList;

    private List<String> goodsName = new ArrayList<>();

    public void setGoodsName(List<String> goodsName) {
        this.goodsName = goodsName;
    }

    public List<String> getGoodsName() {
        return goodsName;
    }
}