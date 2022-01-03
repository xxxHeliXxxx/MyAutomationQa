package mainPage;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class MainPageElements {
    public ElementsCollection categorySideBar = $$(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li"));

}
