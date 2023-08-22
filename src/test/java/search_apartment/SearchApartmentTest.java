package search_apartment;

import base.BaseTest;
import org.example.pages.base.BasePage;
import org.testng.annotations.Test;

import static org.example.constants.Constant.UrlConstants.REALT_HOME_PAGE;

public class SearchApartmentTest extends BaseTest {

    @Test
    public void checkIsRedirectToListing() {
        basePage.open(REALT_HOME_PAGE);
        realtHomePage
                .enterCountRooms()
                .clickToFind();

        realtListingPage.checkCardsCount();
    }
}
