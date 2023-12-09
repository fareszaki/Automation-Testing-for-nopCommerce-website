import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterTest  extends TestBase{
    private SinupClass reg ;
    private HomePage h1 ;
    private SoftAssert soft ;

    @Test
    public void SingUp_using_valid_Data() {


        reg = new SinupClass(driver);
        h1 = new HomePage(driver);
        h1.navigate_to_register_page();
        reg.Clic_on_gender_Method();
        reg.Fill_first_Name_Method("fares");
        reg.Fill_Last_Name_Method("mahmoud");
        reg.Enter_Data_Of_Birth("1", "May", "2000");
        reg.Fill_Email_Feild_Method("fazaki1234@gamil.com");
        reg.Fill_Company_Name("Itworks Eduction");
        reg.Fill_Password_Feild_Method("$FaresMahmoud246810");
        reg.Fill_rePassword_Feild_Method("$FaresMahmoud246810");
        reg.Click_Register();
        soft = new SoftAssert() ;
       String Actual_URL = reg.Get_Current_URl() ;
        String Expected_Url ="https://demo.nopcommerce.com/registerresult/1?returnUrl=/";
        soft.assertEquals(Actual_URL , Expected_Url);
        String MSG = " Your registration completed " ;
       WebElement e = driver.findElement(By.cssSelector("div[class=\"result\"]")) ;
       String Result = e.getText();
       soft.assertTrue(Result.contains(MSG));
       soft.assertAll();
    }
    @Test
    // register by
    public void SingUp_By_not_Fill_Required_Fields(){
        reg = new SinupClass(driver);
        h1 = new HomePage(driver);
        h1.navigate_to_register_page();
        reg.Clic_on_gender_Method();
        reg.Fill_first_Name_Method("");
        reg.Fill_Last_Name_Method("");
        reg.Enter_Data_Of_Birth("1", "May", "2000");
        reg.Fill_Email_Feild_Method("");
        reg.Fill_Company_Name("Itworks Eduction");
        reg.Fill_Password_Feild_Method("");
        reg.Fill_rePassword_Feild_Method("");
        reg.Click_Register();
       soft =new SoftAssert() ;
      WebElement e= driver.findElement(By.cssSelector("span[class=\"field-validation-error\"]"));
      String msg =  e.getText();
        System.out.println(msg);
      soft.assertTrue(msg.contains("First name is required."));
      soft.assertAll();
    }


}
