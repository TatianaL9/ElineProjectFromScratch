package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtilities {
    public static JavascriptExecutor javaScript;

    public static void jsClick(WebDriver driver, WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("argument[0].click();", element);

    }
    public static void scroll (WebDriver driver, WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView();", element);
    }
    public static void scrollClick (WebDriver driver, WebElement element) {
        scroll(driver, element);
        element.click();
    }

    public static void scrollClick(WebDriver driver, By by) {
        WebElement element = driver.findElement(by);
        scroll(driver, element);
        element.click();
    }

    //To Select Calendar Date Or Data Picker using Java Script Executor.
    public static void selectDateByJS(WebDriver driver, WebElement element, String dateValue)
    {
        javaScript= ((JavascriptExecutor) driver);
        javaScript.executeScript("arguments[0].setAttribute('value','" + dateValue + "');", element);
    }
}
