package lib;

import io.appium.java_client.AppiumDriver;
import junit.framework.TestCase;
import org.openqa.selenium.ScreenOrientation;
public class CoreTestCase extends TestCase {
    protected AppiumDriver driver;
    @Override
    protected void setUp() throws Exception
    {
        super.setUp();
        driver = Platform.getInstance().getDriver();
        driver.rotate(ScreenOrientation.PORTRAIT);
    }

    @Override
    protected void tearDown() throws Exception
    {
        driver.quit();
        super.tearDown();
    }

    protected void rotateScreenPortraint(){
        driver.rotate(ScreenOrientation.PORTRAIT);
    }
    protected void rotateScreenLandsCape(){
        driver.rotate(ScreenOrientation.LANDSCAPE);
    }

   // protected void backgroundApp(Duration seconds){driver.runAppInBackground(seconds);}


}
