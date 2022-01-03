import cartPage.CartPageLogic;
import categoryPage.CategoryPageElements;
import mainPage.MainPageLogic;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchPage.SearchPageLogic;

import static com.codeborne.selenide.Selenide.open;

public class HomeWork20_CheckingAddToCartSelenideTest {
    private final CartPageLogic cartPageLogic = new CartPageLogic();
    private final SearchPageLogic searchPageLogic = new SearchPageLogic();

    @BeforeMethod
    public void before() {
        Configuration.startMaximized = true;
        open("https://rozetka.com.ua");
    }

    @Test
    public void firstTest() {
        new MainPageLogic().clickOnCategory(new MainPageLogic().categorySideBar)
                .clickOnCategory(new CategoryPageElements().laptopCategory);

        int indexOfProduct = 0;
        String titleOfProductOnSearchPage = searchPageLogic.titleOfProduct(searchPageLogic.titles, indexOfProduct);
        String priceOfProductOnSearchPage = searchPageLogic.priceOfProduct(searchPageLogic.prices, indexOfProduct);

        searchPageLogic.addProductToCart(searchPageLogic.addToCartBtn);

        String cartCounter = searchPageLogic.getCartCounterText(searchPageLogic.counterOfCartProducts);
        Assert.assertEquals(cartCounter, "1");

        searchPageLogic.clickOnCartButton(searchPageLogic.cartBtn);

        String titleOfProductOnCart = cartPageLogic.titleProduct(cartPageLogic.titleProductOnCartPage);
        String priceOfProductOnCart = cartPageLogic.priceProduct(cartPageLogic.priceProductOnCartPage);

        Assert.assertEquals(titleOfProductOnCart, titleOfProductOnSearchPage);
        Assert.assertEquals(priceOfProductOnCart, priceOfProductOnSearchPage);
    }
}
