package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import textbase.WebTestBase;
import utils.Utility;

public class OverviewPage extends WebTestBase{


    public OverviewPage(){
        PageFactory.initElements(driver, this);
    }

    public void windowHandles(){
        Utility.getWindowHandles(driver);
    }
}
