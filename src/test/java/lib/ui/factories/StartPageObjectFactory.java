package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.StartPageObject;
import lib.ui.android.AndroidStartPageObject;
import lib.ui.ios.iOSStartPageObject;

public class StartPageObjectFactory {

    public static StartPageObject get(AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return new AndroidStartPageObject(driver);
        } else {
            return new iOSStartPageObject(driver);
        }
    }
}
