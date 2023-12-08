package lib.ui;

import io.appium.java_client.AppiumDriver;

abstract public class StartPageObject extends MainPageObject{
    protected static  String
    START_SKIP_BUTTON;
    public StartPageObject (AppiumDriver driver){
        super(driver);
    }
    public void skipOnboardingButton() {
        this.waitForElementAndClick(START_SKIP_BUTTON, "Cannot find and click skip button",5);
    }

}
