import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginClass extends PageBase{
    public LoginClass(WebDriver driver){
        super(driver);
    }
    private By fill_email = By.cssSelector("input[id=\"Email\"]");
    WebElement elemet ;
    public void Fill_Email(String mail){
        elemet =driver.findElement(fill_email) ;
        Search_for_items(elemet , mail);
    }
     private By fill_password = By.cssSelector("input[id=\"Password\"]");
    WebElement e ;
    public void Fill_Pasword(String pass){
        e =driver.findElement(fill_password) ;
        Search_for_items(e , pass);
    }
    public void Click_On_LOgin_Button(){
        WebElement e =driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
        Clicking(e);
    }

     public String Get_Current_URl(){
          String Current_Url = driver.getCurrentUrl();
            return Current_Url ;
    }

}
