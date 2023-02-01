package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import textbase.WebTestBase;

public class JewelleryPage extends WebTestBase {
    @FindBy(xpath = "//span[text()='MORE FILTERS']")
    WebElement clickOnFilters;
    @FindBy(xpath = "//input[@id='searchmetalWeightRange_8']//parent::li")
    WebElement checkboxClick;


    public JewelleryPage(){
        PageFactory.initElements(driver, this);
    }
    public void selectCheckbox(){
        clickOnFilters.click();
        checkboxClick.click();

    }
}
