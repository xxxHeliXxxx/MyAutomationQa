package cartPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPageElements {
    public SelenideElement titleProductOnCartPage = $(By.xpath("//div[@class='cart-product__main']"));
    public SelenideElement priceProductOnCartPage = $(By.xpath("//div[@class='cart-receipt ng-star-inserted']/div"));
}
