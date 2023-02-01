package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ResisterPage;
import textbase.WebTestBase;

public class RegisterTest extends WebTestBase {
    HomePage homePage;
    ResisterPage resisterPage;

    public RegisterTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialisation();
        homePage = new HomePage();
        resisterPage = new ResisterPage();}

    @Test
    public void registerToPcjeweller(){
        homePage.resisterButtonClick();
        resisterPage.signUp(prop.getProperty("name"), prop.getProperty("email"), prop.getProperty("password"), prop.getProperty("confirmpassword"));
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }

}
