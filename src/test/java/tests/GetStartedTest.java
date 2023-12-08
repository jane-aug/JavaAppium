package tests;

import lib.CoreTestCase;
import lib.Platform;
import lib.ui.StartPageObject;
import lib.ui.factories.StartPageObjectFactory;
import org.junit.Test;

public class GetStartedTest  extends CoreTestCase {
    @Test
    public void testPassThroughWelcome () {
        if(Platform.getInstance().isAndroid()){
            return;
        }
        StartPageObject StartPageObject = StartPageObjectFactory.get(driver);
        StartPageObject.skipOnboardingButton();
    }
}
