import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.WatchEvent;

public class AddToCartClass extends PageBase {
   public AddToCartClass(WebDriver driver ){
       super(driver);
   }
  private  By click_on_v0computer = By.cssSelector("a[href=\"/computers\"]");
   private WebElement element ;
   public void CLick_on_Computers(){
       element = driver.findElement(click_on_v0computer) ;
       Clicking(element);
   }
    private  By click_on_DeskTop = By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000002_desktops_450.jpg\"]");
    private WebElement element1 ;
    public void CLick_on_Computer_Desktop(){
        element1 = driver.findElement(click_on_DeskTop) ;
        Clicking(element1);
    }
      private  By Choose_PC = By.cssSelector("button[class=\"button-2 product-box-add-to-cart-button\"]");
      private WebElement ele ;
      public void Choose_pc_of_DesktopType(){
          ele = driver.findElement(Choose_PC);
          Clicking(ele);
      }
      public void Select_pc_component_processor_Ram(String processor , String Ram ){
          WebElement e1 =driver.findElement(By.cssSelector("select[id=\"product_attribute_1\"]"));
          Select  s1 =new Select(e1) ;
          s1.selectByValue(processor);
          WebElement e2 =driver.findElement(By.cssSelector("select[id=\"product_attribute_2\"]"));
          Select s2 =new Select(e2);
          s2.selectByValue(Ram);

      }
      public void  choose_Hdd_320GB(){
          WebElement e = driver.findElement(By.cssSelector("input[id=\"product_attribute_3_6\"]"));
          Clicking(e);
      }
    public void  choose_Hdd_400GB() {
        WebElement e = driver.findElement(By.cssSelector("input[id=\"product_attribute_3_7\"]"));
        Clicking(e);

    }

        public void Add_pc_to_cart(){
       WebElement ele = driver.findElement(By.cssSelector("button[id=\"add-to-cart-button-1\"]"));
        Clicking(ele);
    }

}
