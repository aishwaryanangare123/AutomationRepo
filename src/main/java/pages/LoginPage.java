package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import textbase.WebTestBase;
import utils.Utility;

public class LoginPage extends WebTestBase {
    @FindBy(xpath ="//input[@name='userLoginEmail']")
    WebElement emailAddress;
    @FindBy(xpath = "//input[@id ='userLoginPassword']")
    WebElement passwordlog;
    @FindBy(xpath = "//input[@id ='submit-login']")
    WebElement submitLogin;
    @FindBy(xpath = "//span[text() = 'Welcome']")
    WebElement title;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public void login(String email1, String password1){
        Utility.frameLogin(driver);
        emailAddress.sendKeys(email1);
        passwordlog.sendKeys(password1);
        submitLogin.click();

    }
}
