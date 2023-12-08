package tests;

import lib.CoreTestCase;
import lib.Platform;
import lib.ui.ArticlePageObject;
import lib.ui.MainPageObject;
import lib.ui.SearchPageObject;
import lib.ui.StartPageObject;
import lib.ui.factories.ArticlePageObjectFactory;
import lib.ui.factories.SearchPageObjectFactory;
import lib.ui.factories.StartPageObjectFactory;
import org.junit.Test;

public class ArticleTests extends CoreTestCase {

    @Test
    public void testCompareArticleTitle(){
        StartPageObject StartPageObject = StartPageObjectFactory.get(driver);
        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
        ArticlePageObject ArticlePageObject = ArticlePageObjectFactory.get(driver);

        StartPageObject.skipOnboardingButton();
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Java");
        if (Platform.getInstance().isAndroid()){SearchPageObject.clickByArticleWithSubstring("Object-oriented programming language");}
        else SearchPageObject.clickByArticleWithSubstring("Язык программирования");
        if (Platform.getInstance().isAndroid()) {
        String article_title = ArticlePageObject.getArticleTitle();
        assertEquals(
                "We see unexpected title",
                "Object-oriented programming language",
                article_title

        );}
        else {
            String article_title = ArticlePageObject.getArticleTitle();
            assertEquals(
                    "We see unexpected title",
                    "язык программирования",
                    article_title

            );
        }
    }
    // Занятие 4 - продвинутые тесты

    @Test
    public void testSwipeArticle(){

        MainPageObject MainPageObject = new MainPageObject(driver);
        StartPageObject StartPageObject =  StartPageObjectFactory.get(driver);
        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
        ArticlePageObject ArticlePageObject = ArticlePageObjectFactory.get(driver);


        StartPageObject.skipOnboardingButton();
        SearchPageObject.initSearchInput();
        if (Platform.getInstance().isAndroid()) {
        SearchPageObject.typeSearchLine("Java");
        SearchPageObject.clickByArticleWithSubstring("Object-oriented programming language");}
        else {
        SearchPageObject.typeSearchLine("Java");
        SearchPageObject.clickByArticleWithSubstring("зык программирования");}
        ArticlePageObject.waitForTitleElement();
        MainPageObject.tuochByCoordinate(671,441);
        if (Platform.getInstance().isAndroid()) {ArticlePageObject.changeMenu();}
        ArticlePageObject.swipeToFooter();

    }

    @Test
    public void testSwipeArticlev2(){

        MainPageObject MainPageObject = new MainPageObject(driver);
        StartPageObject StartPageObject =  StartPageObjectFactory.get(driver);
        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
        ArticlePageObject ArticlePageObject = ArticlePageObjectFactory.get(driver);


        StartPageObject.skipOnboardingButton();
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Java");
        SearchPageObject.clickByArticleWithSubstring("зык программирования");
        ArticlePageObject.waitForTitleElement();
        MainPageObject.verticalSwipeToBottom();

    }


}
