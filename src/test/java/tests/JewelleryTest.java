package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.JewelleryPage;
import pages.HomePage;
import textbase.WebTestBase;

public class JewelleryTest extends WebTestBase {
    HomePage homePage;
    JewelleryPage jewelleryPage;

    public JewelleryTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialisation();
        homePage = new HomePage();
        jewelleryPage = new JewelleryPage();
    }
    @Test
    public void selectMetalWeightCheckBox(){
        homePage.clickOnRings();
        jewelleryPage.selectCheckbox();

    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
