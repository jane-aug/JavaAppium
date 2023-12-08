package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.SearchPageObject;

public class iOSSearchPageObject extends SearchPageObject {
    static {
        SEARCH_INIT_ELEMENT = "xpath://XCUIElementTypeSearchField[@name='Поиск по Википедии']";
        SEARCH_INPUT = "xpath://XCUIElementTypeSearchField[@name='Поиск по Википедии']";
        SEARCH_INPUT_ON_PAGE = "xpath://XCUIElementTypeButton[@name='Поиск по Википедии']";
        SEARCH_RESULT_BY_SUBSTRING_TPL = "xpath://XCUIElementTypeStaticText[contains(@name,'{SUBSTRING}')]";
        SEARCH_UNDO_BUTTON = "xpath://XCUIElementTypeButton[@name=Поиск']";
        PLACEHOLDER_SEARCH_LINE = "Поиск по Википедии";
        SEARCH_RESULT_LOCATOR = "xpath://XCUIElementTypeStaticText";
        EMPTY_RESULT_LABEL = "xpath://XCUIElementTypeStaticText[@name='Ничего не найдено']";
        CANCEL_BUTTON_IN_SEARCH_LINE = "xpath://XCUIElementTypeStaticText[@name='Отменить']";
    }
    public iOSSearchPageObject(AppiumDriver driver){
        super(driver);
    }
}
