package org.example.pages.listing;

import org.example.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.stream.Collectors;

import static org.example.constants.Constant.CheckCountConstants.CARDS_COUNT;

public class RealtListingPage extends BasePage {
    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    private final By cardInListing = By.xpath("//div[@data-index]");

    public RealtListingPage checkCardsCount() {
        int cardCount = driver.findElements(cardInListing).size();
        Assert.assertEquals(cardCount, CARDS_COUNT);
        return this;
    }
}
