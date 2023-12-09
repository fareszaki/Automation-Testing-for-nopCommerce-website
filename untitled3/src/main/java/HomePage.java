import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By select_register = By.cssSelector("a[href=\"/register?returnUrl=%2F\"]");
    WebElement register_button;

    public SinupClass navigate_to_register_page() {
        register_button = driver.findElement(select_register);
        Clicking(register_button);
         return  new SinupClass(driver);
    }

    private By select_login_button = By.cssSelector("a[href=\"/login?returnUrl=%2F\"]");
    WebElement login_bitton;

    public LoginClass navigate_to_login_page() {
        login_bitton = driver.findElement(select_login_button);
        Clicking(login_bitton);
        return  new LoginClass(driver) ;
    }

     private By select_wishlist = By.cssSelector("span[class=\"wishlist-label\"]");
    WebElement click_on_whislist;

    public void navigate_to_WhisList_page() {
        click_on_whislist = driver.findElement(select_wishlist);
        Clicking(click_on_whislist);
    }
     private By price_type = By.cssSelector("select[id=\"customerCurrency\"]") ;
        WebElement element ;

   // public void Select_price_type(String option){
         ///int random =(int)Math.floor(Math.random()*(2-1+1)+1) ;
        //element =driver.findElement(price_type);
        //Select select =new Select(element);
      //Clicking(select.selectByValue(option));
    //}
      private By Search = By.cssSelector("input[class=\"search-box-text ui-autocomplete-input\"]");
     WebElement search_for_item ;
     public void Search_for_item(String text){
         search_for_item =driver.findElement(Search);
         Search_for_items(search_for_item , text);
     }
     private By Click_Search = By.cssSelector("button[class=\"button-1 search-box-button\"]");
     WebElement click_on_search_Element ;
     public void Click_on_search(){
         click_on_search_Element = driver.findElement(Click_Search);
         Clicking(click_on_search_Element);
     }
     private By Choose_category= By.xpath("//strong[text()=\"Popular tags\"]");
     WebElement e1 ;
     public void Click_On_Category(){
         e1= driver.findElement(Choose_category);
         Clicking(e1);
    }

}