package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementFetch {
    public  static WebElement getWebElement (String identifierType, String identifierValue) {
        switch (identifierType){
            case "ID":
                return BaseTest.driver.findElement(By.id(identifierValue));
            case "CSS":
                return BaseTest.driver.findElement(By.cssSelector(identifierValue));
            case "tagName":
                return BaseTest.driver.findElement(By.tagName(identifierValue));
            case "XPATH":
                return BaseTest.driver.findElement(By.xpath(identifierValue));
            case "ClassName":
                return BaseTest.driver.findElement(By.className(identifierValue));
            default:
                return null;
        }
    }

    public  static  List<WebElement> getListWebElement (String identifierType, String identifierValue) {
        switch (identifierType){
            case "ID":
                return BaseTest.driver.findElements(By.id(identifierValue));
            case "CSS":
                return BaseTest.driver.findElements(By.cssSelector(identifierValue));
            case "tagName":
                return BaseTest.driver.findElements(By.tagName(identifierValue));
            case "XPATH":
                return BaseTest.driver.findElements(By.xpath(identifierValue));
            case "ClassName":
                return BaseTest.driver.findElements(By.className(identifierValue));
            default:
                return null;
        }
    }
}
