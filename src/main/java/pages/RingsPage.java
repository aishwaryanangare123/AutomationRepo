package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import textbase.WebTestBase;
import utils.Utility;

public class RingsPage extends WebTestBase{
    @FindBy(xpath = "//span[text()='MORE FILTERS']")
    WebElement clickOnFilters;
    @FindBy(xpath = "//input[@id='searchDiscountRange_40']//parent::li")
 WebElement selectRadio;


    public RingsPage(){
        PageFactory.initElements(driver, this);
    }
    public void selectRadioButton() {
        clickOnFilters.click();
        selectRadio.click();
    }






}
