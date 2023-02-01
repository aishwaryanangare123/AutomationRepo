package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Utility {
    public static final long PAGE_LOAD_TIMEOUT = 20;
    public static final long IMPLICITLY_WAIT = 20;

    public static void frameLogin(WebDriver driver){
        driver.switchTo().frame("iframeLogin");
    }

    public static void mouseOver(WebDriver driver, WebElement dropDownList){
        Actions action = new Actions(driver);
        action.moveToElement(dropDownList).build().perform();


    }

    public static void selectPrice(WebDriver driver,WebElement dropDown){
        Actions action1 = new Actions(driver);
        action1.moveToElement(dropDown).build().perform();
    }

    public static void selectByValue(WebElement element,String term,String value){
        Select dropDown = new Select(element);
        if (term.equalsIgnoreCase("byValue")){
            dropDown.selectByValue(value);
        }
        else if (term.equalsIgnoreCase("byIndex")){
            dropDown.selectByIndex(Integer.parseInt(value));
        }
        else if (term.equalsIgnoreCase("byVisibleText")){
            dropDown.selectByVisibleText(value);
        }
        else {
            System.out.println("please select the correct value");
        }
    }


    public static void getWindowHandles(WebDriver driver){
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();
        Iterator<String> I1 = s.iterator();
        while (I1.hasNext()){

            String child_window = I1.next();
            if (!parent.equals(child_window)){
                driver.switchTo().window(child_window);
                System.out.println(driver.switchTo().window(child_window).getTitle());
                driver.close();
            }
            driver.switchTo().window(parent);
        }
    }

    public static void elementEnabledOrNot(WebElement element){
        System.out.println(element.isEnabled());
    }
    public static void elementDisplayedOrNot(WebElement element){
        System.out.println(element.isDisplayed());
    }
    public static void elementSelectedOrNot(WebElement element){
        System.out.println(element.isSelected());
    }

}

