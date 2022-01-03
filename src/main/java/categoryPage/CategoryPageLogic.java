package categoryPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import searchPage.SearchPageLogic;

public class CategoryPageLogic extends CategoryPageElements {
    public SearchPageLogic clickOnCategory(SelenideElement category) {
        category.shouldBe(Condition.visible).click();
        return Selenide.page(SearchPageLogic.class);
    }
}
