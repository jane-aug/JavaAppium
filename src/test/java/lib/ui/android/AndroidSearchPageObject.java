package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.SearchPageObject;

public class AndroidSearchPageObject extends SearchPageObject {

     static {
         SEARCH_INIT_ELEMENT = "xpath://*[contains(@text,'Search Wikipedia')]";
                 SEARCH_INPUT = "id:org.wikipedia:id/search_src_text";
                 SEARCH_INPUT_ON_PAGE = "id:org.wikipedia:id/page_toolbar_button_search";
                 SEARCH_RESULT_BY_SUBSTRING_TPL = "xpath://*[@resource-id='org.wikipedia:id/search_container']//*[@text='{SUBSTRING}']";
                 SEARCH_UNDO_BUTTON = "xpath://android.widget.ImageButton[@content-desc=\"Navigate up\"]";
                 PLACEHOLDER_SEARCH_LINE = "Search Wikipedia";
                 SEARCH_RESULT_LOCATOR = "xpath://*[@resource-id='org.wikipedia:id/fragment_search_results']//*[@resource-id='org.wikipedia:id/search_results_list']";
                 EMPTY_RESULT_LABEL = "xpath://*[@text='No results']";
     }
    public AndroidSearchPageObject(AppiumDriver driver){
        super(driver);
    }

}
