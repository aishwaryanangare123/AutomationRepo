package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import textbase.WebTestBase;
import utils.Utility;

public class HomePage extends WebTestBase {
    @FindBy(xpath = "//input[@name = 'searchKeyword']")
    WebElement element;

    @FindBy(xpath = "//input[@name = 'serachButton']")
    WebElement element1;

    @FindBy(xpath = "//a[text() = 'Register']")
    WebElement registerbtn;

    @FindBy(xpath = "//a[text() = 'Login']")
    WebElement loginbtn;
    @FindBy(xpath = "//span[text() = 'Welcome']")
    WebElement welcometitle;

    @FindBy(xpath = "//a[text()='Earrings']")
    WebElement dropDownList;

    @FindBy(xpath = "//button[@class ='btn  dropdown-toggle text-overflow hidden-xs hidden-sm']")
    WebElement dropDown;
    @FindBy(xpath = "//a[text()='Newly Listed']")
    WebElement selectPopularity;
    @FindBy(xpath = "//a[text()='Rings']")
    WebElement rings;
    @FindBy(xpath = "//li[@class='digigold  no-child']")
    WebElement digitalGold;
    @FindBy(xpath = "//a[text()='Hoops']")
    WebElement hoops;




    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void searchJewellery(String searchitem) {
        element.sendKeys(searchitem);
        element.sendKeys(Keys.ENTER);
    }

    public void resisterButtonClick() {
        registerbtn.click();
    }

    public void loginButton() {
        loginbtn.click();
    }

    public String getTextOfHomePage() {
        return welcometitle.getText();
    }

    public void showDropdown(){
        Utility.mouseOver( driver,dropDownList);
    }

    public void clickOnRings(){
        rings.click();
    }
    public void digitalGoldClick(){

        digitalGold.click();
    }
    public void checkElementEnable(){
        Utility.elementEnabledOrNot(loginbtn);
    }
    public void checkElementDisplayed(){
        Utility.elementDisplayedOrNot(hoops);
    }






}



