package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.StartPageObject;

public class iOSStartPageObject extends StartPageObject
{

    static {
        START_SKIP_BUTTON = "xpath://XCUIElementTypeButton[@name='Пропустить']";
    }
    public iOSStartPageObject(AppiumDriver driver){
        super(driver);
    }

}
