package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import textbase.WebTestBase;

public class ResisterPage extends WebTestBase {
    @FindBy(xpath = "//input[@id = 'userFirstName']")
    WebElement nametextbox;
    @FindBy(xpath = "//input[@id = 'userEmail']")
    WebElement emailTextbox;
    @FindBy(xpath = "//input[@id = 'userPassword']")
    WebElement passwordTextbox;
    @FindBy(xpath = "//input[@id = 'userConfirmPassword']")
    WebElement confirmpasswordTextbox;
    @FindBy(xpath = "//label[text()='I agree to the Terms of use and Privacy Statement']")
    WebElement checkboxTextbox;
    @FindBy(xpath = "//input[@name = 'submit']")
    WebElement signupbtn;

    @FindBy(xpath = "//span[@class = 'icon-cross icon-exchange log-close']")
    WebElement closeIcon;

    public ResisterPage(){
        PageFactory.initElements(driver, this);
    }

    public void signUp(String name, String email, String password, String confirmpassword){
        driver.switchTo().frame("iframeLogin");
        nametextbox.sendKeys(name);
        emailTextbox.sendKeys(email);
        passwordTextbox.sendKeys(password);
        confirmpasswordTextbox.sendKeys(confirmpassword);
        checkboxTextbox.click();
        signupbtn.click();
        closeIcon.click();

    }
}
