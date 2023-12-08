package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.ArticlePageObject;

public class AndroidArticlePageObject extends ArticlePageObject {

    static {
        TITLE = "xpath://android.view.View[@resource-id='pcs-edit-section-title-description']";
        FOOTER_ELEMENT = "xpath://android.view.View[@resource-id='pcs-footer-container-menu']";
        MENU_BUTTON = "id:org.wikipedia:id/page_toolbar_button_show_overflow_menu";
        CUSTOMIZE_BUTTON = "id:org.wikipedia:id/customize_toolbar";
        SAVE_MENU_IN_SETTINGS = "xpath://android.widget.TextView[@text='Save']";
        UNDO_BUTTON = "xpath://android.widget.ImageButton[@content-desc='Navigate up]";
        SAVE_MENU = "id:org.wikipedia:id/page_save";
        SNACKBAR_ACTION = "id:org.wikipedia:id/snackbar_action";
        FIRST_LIST = "id:org.wikipedia:id/item_title_container";
        ARTICLE_RESULT_BY_SUBSTRING_TPL = "xpath://*[@resource-id='org.wikipedia:id/reading_list_recycler_view']//*[@text='{SUBSTRING}']";
    }
    public AndroidArticlePageObject(AppiumDriver driver){
        super(driver);
    }
}
