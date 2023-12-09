import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddToCartTest extends TestBase{
    private HomePage h ;
    private LoginClass log ;
    private AddToCartClass  add;

    @Test
    public void Verify_That_we_Can_Itme_to_Cart(){
      h =new HomePage(driver) ;
      h.navigate_to_login_page() ;
      log =new LoginClass(driver) ;
      log.Fill_Email("fazaki1234@gamil.com");
      log.Fill_Pasword("$FaresMahmoud246810");
      log.Click_On_LOgin_Button();
      add=new AddToCartClass(driver);
      add.CLick_on_Computers();
      add.CLick_on_Computer_Desktop();
      add.Choose_pc_of_DesktopType();
      add.Select_pc_component_processor_Ram("1" ,"3");
      add.choose_Hdd_320GB();
      add.Add_pc_to_cart();
      SoftAssert soft =new SoftAssert() ;
      WebElement element = driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
      String txt =element.getText();
      soft.assertTrue(txt.contains("The product has been added to your "));
      String Actual_Color = element.getCssValue("background-color") ;
      String Expected_Color = "#4bb07a";
      soft.assertEquals(Color.fromString(Actual_Color).asHex() , Expected_Color);
      soft.assertAll();
    }

}
