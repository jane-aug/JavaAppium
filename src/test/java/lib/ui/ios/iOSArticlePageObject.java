package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.ArticlePageObject;

public class iOSArticlePageObject extends ArticlePageObject {

    static {
        TITLE = "xpath://XCUIElementTypeStaticText[@name='язык программирования']";
        FOOTER_ELEMENT = "xpath://XCUIElementTypeStaticText[@name='Просмотреть статью в браузере']";
        UNDO_BUTTON = "xpath://XCUIElementTypeButton[@name='Лента']";
        SAVE_MENU = "xpath://XCUIElementTypeButton[@name='Сохранить на потом']";
       // FIRST_LIST = "id:org.wikipedia:id/item_title_container";
        ARTICLE_RESULT_BY_SUBSTRING_TPL = "xpath://*[@resource-id='org.wikipedia:id/reading_list_recycler_view']//*[@text='{SUBSTRING}']";
    }
    public iOSArticlePageObject(AppiumDriver driver){
        super(driver);
    }

}
