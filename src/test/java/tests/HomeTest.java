package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import textbase.WebTestBase;

public class HomeTest extends WebTestBase {
    HomePage homePage;


    public HomeTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialisation();
        homePage = new HomePage();
    }
    @Test
    public void verifySearch(){

        homePage.searchJewellery(prop.getProperty("searchitem"));

    }
    @Test
    public void moveTodropDown(){
        homePage.showDropdown();
    }

    @Test
   public void isEnabled(){
        homePage.checkElementEnable();
}
    @Test
    public void isDisplayed(){
        homePage.checkElementDisplayed();
    }


    @AfterMethod
    public void afterMethod(){
        driver.close();
    }

}
