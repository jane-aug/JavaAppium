package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.SavedArticlePageObject;
import lib.ui.android.AndroidSavedArticlePageObject;
import lib.ui.ios.iOSSavedArticlePageObject;

public class SavedArticlePageObjectFactory {
    public static SavedArticlePageObject get(AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return new AndroidSavedArticlePageObject(driver);
        } else {
            return new iOSSavedArticlePageObject(driver);
        }
    }
}
