package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import textbase.WebTestBase;
import utils.Utility;

public class FilterPage extends WebTestBase {
    @FindBy(xpath = "//a[text()='Rings']")
    WebElement textClick;
    @FindBy(xpath = "//button[@class='btn  dropdown-toggle text-overflow']")
    WebElement clickPrice;
    @FindBy(xpath = "//select[@id='priceDropMin']")
    WebElement dropDown;




    public FilterPage(){
        PageFactory.initElements(driver, this);
    }
    public void setDropDown(String term,String value){
        textClick.click();
        Utility.selectPrice(driver, clickPrice);
        dropDown.click();
        Utility.selectByValue(dropDown,term,value);
        Utility.elementSelectedOrNot(dropDown);
    }
}
