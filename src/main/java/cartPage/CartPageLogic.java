package cartPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class CartPageLogic extends CartPageElements {
    public String titleProduct(SelenideElement title) {
        title.shouldBe(Condition.visible);
        return title.text().trim();
    }

    public String priceProduct(SelenideElement price) {
        price.shouldBe(Condition.visible);
        return price.text().replaceAll("₴", "").trim();
    }
}
