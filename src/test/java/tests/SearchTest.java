package tests;

import lib.CoreTestCase;
import lib.ui.ArticlePageObject;
import lib.ui.SearchPageObject;
import lib.ui.StartPageObject;
import lib.ui.MainPageObject;
import lib.ui.factories.ArticlePageObjectFactory;
import lib.ui.factories.SearchPageObjectFactory;
import org.junit.Test;
import lib.ui.factories.StartPageObjectFactory;

public class SearchTest extends CoreTestCase {
    @Test
    public void testSearch()
    {
        StartPageObject StartPageObject = StartPageObjectFactory.get(driver);
        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);

        StartPageObject.skipOnboardingButton();
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Java");
        SearchPageObject.waitForSearchResult("Object-oriented programming language");
    }


    @Test
    public void testSecondTest()
    {
        StartPageObject StartPageObject = StartPageObjectFactory.get(driver);
        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);

        StartPageObject.skipOnboardingButton();
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Java");
        SearchPageObject.waitForUndoButtonToAppear();
        SearchPageObject.clickUndoButton();
        SearchPageObject.waitForUndoButtonToDisappear();
    }



    @Test
    public void testCancelSearchAndDelete(){
        StartPageObject StartPageObject = StartPageObjectFactory.get(driver);
        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);

        StartPageObject.skipOnboardingButton();
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Java");
        SearchPageObject.clearSearchText();
        SearchPageObject.clickUndoButton();
        SearchPageObject.waitForUndoButtonToDisappear();
    }



    @Test
    public void testex2(){
        MainPageObject MainPageObject = new MainPageObject(driver);
        StartPageObject StartPageObject = StartPageObjectFactory.get(driver);
        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);

        StartPageObject.skipOnboardingButton();
        SearchPageObject.initSearchInput();
        SearchPageObject.checkPlaceholderInSearchLine();

        MainPageObject.assertElementHasText(
                "id:org.wikipedia:id/search_src_text",
                "Search Wikipedia",
                "We see unexpected title",
                5
        );
    }



    @Test
    public void testAmountOfNotEmtySearch(){
        StartPageObject StartPageObject = StartPageObjectFactory.get(driver);
        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);

        StartPageObject.skipOnboardingButton();

        String searh_line = "Linkin Park Discography";
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine(searh_line);
        SearchPageObject.assertSearchHasResult("We did not found any results",10);

    }

    @Test
    public void testAmountOfEemptySerch(){
        StartPageObject StartPageObject = StartPageObjectFactory.get(driver);
        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);

        StartPageObject.skipOnboardingButton();

        String searh_line = "jhvghjhhgjghjg";
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine(searh_line);
        SearchPageObject.assertSearchNotResult("We see results",5);


    }

    @Test
    public void testEx6() {
        StartPageObject StartPageObject = StartPageObjectFactory.get(driver);
        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
        ArticlePageObject ArticlePageObject = ArticlePageObjectFactory.get(driver);

        StartPageObject.skipOnboardingButton();

        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Java");
        SearchPageObject.clickByArticleWithSubstring("Object-oriented programming language");
        ArticlePageObject.assertArticleTitlePresent();


    }
}
