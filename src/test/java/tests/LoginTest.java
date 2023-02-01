package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import textbase.WebTestBase;

public class LoginTest extends WebTestBase {
    HomePage homePage;
    LoginPage loginPage;

    public LoginTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialisation();
        homePage = new HomePage();
        loginPage = new LoginPage();

    }
    @Test
    public void verifyValidCredencial(){
        SoftAssert softAssert = new SoftAssert();
        homePage.loginButton();
        loginPage.login(prop.getProperty("email1"), prop.getProperty("password1"));
        softAssert.assertEquals(homePage.getTextOfHomePage(),"Welcome" , "Welcome text should be match");
        softAssert.assertAll();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
