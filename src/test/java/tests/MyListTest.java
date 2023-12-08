package tests;

import lib.CoreTestCase;
import lib.Platform;
import lib.ui.*;
import lib.ui.factories.ArticlePageObjectFactory;
import lib.ui.factories.SavedArticlePageObjectFactory;
import lib.ui.factories.SearchPageObjectFactory;
import lib.ui.factories.StartPageObjectFactory;
import org.junit.Test;
public class MyListTest extends CoreTestCase
{
    @Test
    public void testEx5() throws InterruptedException {
        // сохраняем 2 статьи в одну папку, 1 удаляем и проверяем что осталась вторая по названию
        MainPageObject MainPageObject = new MainPageObject(driver);
        StartPageObject StartPageObject = StartPageObjectFactory.get(driver);
        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);
        ArticlePageObject ArticlePageObject = ArticlePageObjectFactory.get(driver);
        SavedArticlePageObject SavedArticlePageObject = SavedArticlePageObjectFactory.get(driver);


        StartPageObject.skipOnboardingButton();

        // 1 статья
        SearchPageObject.initSearchInput();
        if (Platform.getInstance().isAndroid()){ SearchPageObject.typeSearchLine("Java");
        SearchPageObject.clickByArticleWithSubstring("Object-oriented programming language");}
        else {
            SearchPageObject.typeSearchLine("Java");
            SearchPageObject.clickByArticleWithSubstring("зык программирования");
        }
        if (Platform.getInstance().isAndroid()){ ArticlePageObject.changeMenu();}
        else {System.out.println("Skip changeMenu for iOS");}
        ArticlePageObject.saveArticle();
        // driver.navigate().back();
        // SearchPageObject.tapBycoordinate();


        // 2 статья
        if (Platform.getInstance().isAndroid()){ SearchPageObject.initSearchInput();}
        else {   driver.navigate().back();
            SearchPageObject.initSearchInput();}
        SearchPageObject.clearSearchText();
        if (Platform.getInstance().isAndroid()){
        SearchPageObject.typeSearchLine("Appium");
        SearchPageObject.clickByArticleWithSubstring("Automation for Apps");}
        else {
            SearchPageObject.typeSearchLine("Appium");
            SearchPageObject.clickByArticleWithSubstring("Вид растений");
        }
        ArticlePageObject.saveArticle();

        //удаляем одну из списка
        if (Platform.getInstance().isAndroid()) {
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();}
        else {
            driver.navigate().back();
            SearchPageObject.cancelSearch();
            driver.navigate().back();
            driver.navigate().back();
            driver.navigate().back();
        }
        SavedArticlePageObject.getSavedAriclePage();

        //SavedArticlePageObject.clickByArticleInListWithSubstring("Saved");
        if (Platform.getInstance().isAndroid()) {
            SavedArticlePageObject.clickByArticleInList();

            MainPageObject.swipeElementToLeft("xpath://*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='Object-oriented programming language']", "Cannot find saved article");
            MainPageObject.assertElementHasNotText("id:org.wikipedia:id/page_list_item_description", "Object-oriented programming language", "Cannot  delete article", 5);
            MainPageObject.assertElementHasText("id:org.wikipedia:id/page_list_item_description", "Automation for Apps", "Second article is still in list", 5);
        } else {
            SavedArticlePageObject.closeSinchXButton();
            MainPageObject.swipeElementToLeftv3("xpath://XCUIElementTypeStaticText[@name='Вид растений']","Cannot find saved article");
            SavedArticlePageObject.deleteArticleOnSavedPage();
            MainPageObject.assertElementHasNotText("xpath://XCUIElementTypeStaticText","Вид растений","Cannot  delete article",5);
            MainPageObject.assertElementHasText("xpath://XCUIElementTypeStaticText[contains(@name,'Язык программирования')]","Язык программирования","Second article is still in list",5);

        }

    }


    // создания списка
    @Test
    public void testCreateList() {
        StartPageObject StartPageObject = StartPageObjectFactory.get(driver);
        SavedArticlePageObject SavedArticlePageObject = SavedArticlePageObjectFactory.get(driver);

        StartPageObject.skipOnboardingButton();
        SavedArticlePageObject.getSavedAriclePage();
        SavedArticlePageObject.createNewList("First");
    }

}
