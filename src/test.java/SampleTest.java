import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.Constants;
import utils.ElementFetch;
import utils.JavaScriptUtilities;

import javax.xml.xpath.XPath;
import java.util.ArrayList;
import java.util.List;

public class SampleTest extends BaseTest {
   private static final By PI = By.className("selector");

   private static void acceptCapcha(){

   }

    @Test
    public void checkHomePageUrl() {
        Assert.assertEquals(driver.getCurrentUrl(), Constants.URL);
    }

    @Test
    public void checkIfMainSignIsPresent() {
        String mainSignText = "Start Growing Your Business";
        WebElement mainSign = driver.findElement(By.className("elb-header-big-text"));
        Assert.assertEquals(mainSign.getText(),mainSignText);
    }
    @Test
    public void checkIfDropshipButtonIsClickable() {
        WebElement dropShipButton = ElementFetch.getWebElement("XPATH", ".//a[text()='dropship']");
        dropShipButton.click();
        Assert.assertNotEquals(driver.getCurrentUrl(), Constants.URL);
    }

    @Test
    public void countCategoriesAndDots () {
        WebElement acceptCookieFiles = driver.findElement(By.cssSelector("#CookiePolicyAcceptBtn"));
        acceptCookieFiles.click();

        WebElement shopByCategory= driver.findElement(By.className("elb-home-section-title"));
        JavaScriptUtilities.scroll(driver, shopByCategory);
        WebElement cat = driver.findElement(By.cssSelector(".ui.button.fluid.orange"));

        System.out.println(cat.getText());
       /* List <WebElement> listCategories = new ArrayList(driver.findElements(By.className("  ui button fluid orange ")));


        System.out.println(listCategories.size());*/
    }

}
