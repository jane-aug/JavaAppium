package lib.ui;

import io.appium.java_client.AppiumDriver;

abstract public class SavedArticlePageObject extends MainPageObject{
    protected static  String
            SAVED,
            EXPLORE,
            MENU_BUTTON ,
            CRATE_NEW_LIST_BUTTON ,
            INPUT_FIELD_FOR_NEW_LIST,
            FIELD_NAME_FOR_LIST ,
            OK_BUTTON ,
            ARTICLE_IN_LUST_RESULT_BY_SUBSTRING_TPL,
            ITEM_TITLE,
            CLOSE_SINCH_X_BUTTON,
            DELETE_BUTTON_ON_SAVED_PAGE;




    public SavedArticlePageObject(AppiumDriver driver){
        super(driver);
    }

    private static String getResultArticleElement(String subString){
        return ARTICLE_IN_LUST_RESULT_BY_SUBSTRING_TPL.replace("{SUBSTRING}", subString);
    }

    public void clickByArticleInListWithSubstring(String subString){
        String search_result_id = getResultArticleElement(subString);
        this.waitForElementAndClick(search_result_id,"Cannot find and click in article list result with substring " + subString,10);
    }

    public  void clickByArticleInList(){
        this.waitForElementAndClick(ITEM_TITLE,"Cannot find and click article on list result!",5);
       // this.waitForElementAndClick(By.xpath("//*[@resource-id='org.wikipedia:id/item_title']"),"Cannot find and click article on list result!",5);

    }

    public void getSavedAriclePage(){
        this.waitForElementAndClick(SAVED, "Cannot find nav_tab_reading_lists",5);
    }

    public void openMenu(){
        this.waitForElementAndClick(MENU_BUTTON,"Cannot find menu_overflow_button", 5);
    }

    public void createNewList(String nameForList ){
        openMenu();
        this.waitForElementAndClick(CRATE_NEW_LIST_BUTTON,"Cannot find create_new_list", 5);
        this.waitForElementAndSendKeys(INPUT_FIELD_FOR_NEW_LIST, nameForList ,"Cannot find text input",5 );
        this.waitForElementAndClick(OK_BUTTON,"Cannot find OK button",5);
        this.assertElementHasText(FIELD_NAME_FOR_LIST, nameForList, "Cannot find new list" + nameForList,5);
        this.waitForElementAndClick(EXPLORE, "Cannot find explore", 5);

    }

    public void closeSinchXButton (){
        waitForElementAndClick(CLOSE_SINCH_X_BUTTON,"Cannont find and click X button",5);
    }

    public void deleteArticleOnSavedPage(){
        waitForElementAndClick(DELETE_BUTTON_ON_SAVED_PAGE,"Cannont find and click delete button",5);
    }

}
