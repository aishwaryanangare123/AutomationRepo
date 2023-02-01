package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.OverviewPage;
import pages.HomePage;
import textbase.WebTestBase;

public class OverviewTest extends WebTestBase {
    HomePage homePage;
    OverviewPage overviewPage;

    public OverviewTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialisation();
        homePage = new HomePage();
        overviewPage = new OverviewPage();
    }
    @Test
    public void multipleWindowHandles(){
        homePage.digitalGoldClick();
        overviewPage.windowHandles();

    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }

}
