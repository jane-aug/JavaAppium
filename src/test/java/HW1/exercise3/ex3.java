package HW1.exercise3;

import lib.CoreTestCase;
import lib.ui.MainPageObject;
import lib.ui.SearchPageObject;
import lib.ui.StartPageObject;
import lib.ui.factories.SearchPageObjectFactory;
import lib.ui.factories.StartPageObjectFactory;
import org.junit.Assert;
import org.junit.Test;

public class ex3 extends CoreTestCase {
    private lib.ui.MainPageObject MainPageObject;

    protected  void setUp() throws Exception {
        super.setUp();
        MainPageObject = new MainPageObject(driver);
    }



    @Test
    public void testExercise3() throws Exception {
        StartPageObject StartPageObject = StartPageObjectFactory.get(driver);
        SearchPageObject SearchPageObject = SearchPageObjectFactory.get(driver);

        StartPageObject.skipOnboardingButton();
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Java");
        SearchPageObject.waitForSearchResult("Java");
        Assert.assertTrue("Cannot find specific search results on search page",
                MainPageObject.quantityElements("xpath://*[contains(@text, 'Java')]").size() > 1);

        SearchPageObject.waitForUndoButtonToAppear();
        SearchPageObject.clickUndoButton();
        SearchPageObject.waitForUndoButtonToDisappear();
    }
}