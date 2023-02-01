package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RingsPage;
import textbase.WebTestBase;

public class RingsTest extends WebTestBase {
    HomePage homePage;
    RingsPage ringsPage;

    public RingsTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialisation();
        homePage = new HomePage();
        ringsPage= new RingsPage();
    }
    @Test
    public void radioButtonClick(){
        homePage.clickOnRings();
        ringsPage.selectRadioButton();

    }



    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
