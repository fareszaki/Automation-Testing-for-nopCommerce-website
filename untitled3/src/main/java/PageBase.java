import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.ProtectionDomain;

public class PageBase {
     protected WebDriver driver ;
     public PageBase(WebDriver driver ) {
         this.driver =driver ;
     }
    public static void Clicking(WebElement element) {
         element.click();
    }
    public void Search_for_items(WebElement element , String item ){
         element.sendKeys(item);
    }
}
