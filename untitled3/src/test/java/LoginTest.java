import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase{
    private HomePage home ;
    private LoginClass login ;


    @Test
    public void Login_with_invalid_Credentials(){
         home = new HomePage(driver);
         home.navigate_to_login_page();
         login =new LoginClass(driver);
         login.Fill_Email("wefde");
         login.Fill_Pasword("gwefuj");
         login.Click_On_LOgin_Button();
         //Assert
        //1. Assert that the url is same  before and after execute test case
         // using SoftAsser
        SoftAssert soft = new SoftAssert();
       String Actual_Url= login.Get_Current_URl() ;
        String Expected_Url = "https://demo.nopcommerce.com/login?returnUrl=%2F" ;
        soft.assertEquals(Actual_Url , Expected_Url);
        WebElement Wrong_Msg_Element =driver.findElement(By.cssSelector("span[class=\"field-validation-error\"]") );
        String error_Text= Wrong_Msg_Element.getText();
        soft.assertTrue(error_Text.contains("Wrong email"));
        soft.assertAll();

    }
    @Test
    public  void Login_With_valid_Credentials(){
    home = new HomePage(driver) ;
    home.navigate_to_login_page() ;
    login =new LoginClass(driver) ;
    login.Fill_Email("fazaki1234@gamil.com");
    login.Fill_Pasword("$FaresMahmoud246810");
    login.Click_On_LOgin_Button();
    // ASSERTION
    SoftAssert soft = new SoftAssert() ;
    String Actual_Url = login.Get_Current_URl() ;
    String Expected_URL ="https://demo.nopcommerce.com/" ;
     soft.assertEquals(Actual_Url , Expected_URL);
     WebElement e = driver.findElement(By.cssSelector("div[class=\"topic-block-title\"]"));
      String tex =e.getText();
      soft.assertTrue(tex.contains("Welcome to our store"));
      soft.assertAll();
    }

}
