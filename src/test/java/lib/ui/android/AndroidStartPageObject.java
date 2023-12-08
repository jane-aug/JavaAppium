package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.StartPageObject;

public class AndroidStartPageObject extends StartPageObject {

    static {
        START_SKIP_BUTTON = "id:org.wikipedia:id/fragment_onboarding_skip_button";
    }
    public AndroidStartPageObject(AppiumDriver driver){
        super(driver);
    }
}
