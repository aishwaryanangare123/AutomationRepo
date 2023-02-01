package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FilterPage;
import pages.HomePage;
import textbase.WebTestBase;

public class FiltersTest extends WebTestBase {
    HomePage homePage;
    FilterPage filterPage;

    public FiltersTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialisation();
        homePage = new HomePage();
        filterPage = new FilterPage();
    }
    @Test
    public void verifyDropDown(){

        filterPage.setDropDown("byVisibleText", "5000");

    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
