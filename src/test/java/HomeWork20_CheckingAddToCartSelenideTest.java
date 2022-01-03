import cartPage.CartPageLogic;
import categoryPage.CategoryPageElements;
import com.codeborne.selenide.Configuration;
import mainPage.MainPageLogic;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchPage.SearchPageLogic;

import static com.codeborne.selenide.Selenide.open;

public class HomeWork20_CheckingAddToCartSelenideTest {
    private final CartPageLogic cartPageLogic = new CartPageLogic();
    private final SearchPageLogic searchPageLogic = new SearchPageLogic();
    private final MainPageLogic mainPageLogic = new MainPageLogic();

    @BeforeMethod
    public void before() {
        Configuration.startMaximized = true;
        open("https://rozetka.com.ua");
    }

    @Test
    public void firstTest() {
        new MainPageLogic().clickOnCategory(new MainPageLogic().categorySideBar)
                .clickOnCategory(new CategoryPageElements().laptopCategory);

        int indexProduct = 0;
        String titleOfProductOnSearchPage = searchPageLogic.titleOfProduct(searchPageLogic.titles, indexProduct);
        String priceOfProductOnSearchPage = searchPageLogic.priceOfProduct(searchPageLogic.prices, indexProduct);
        searchPageLogic.addProductToCart(searchPageLogic.addToCartBtn);
        String cartCounter = searchPageLogic.getCartCounterText(searchPageLogic.counterOfCartProducts);
        Assert.assertEquals(cartCounter, "1");

        searchPageLogic.clickOnCartButton(searchPageLogic.cartBtn);

        String titleOfProductCart = cartPageLogic.titleProduct(cartPageLogic.titleProductOnCartPage);
        String priceOfProductCart = cartPageLogic.priceProduct(cartPageLogic.priceProductOnCartPage);

        Assert.assertEquals(titleOfProductCart, titleOfProductOnSearchPage);
        Assert.assertEquals(priceOfProductCart, priceOfProductOnSearchPage);
    }
}
