import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SinupClass  extends PageBase {
    public SinupClass(WebDriver driver) {
        super(driver);
    }

    // first object is check gender
   private   By Check_Gender = By.cssSelector("input[type=\"radio\"][id=\"gender-male\"]");
    WebElement element;

    public void Clic_on_gender_Method() {
        element = driver.findElement(Check_Gender);
        Clicking(element);
    }

     private By Fill_firdtName = By.cssSelector("input[id=\"FirstName\"]");
    WebElement e;

    public void Fill_first_Name_Method(String First_Name) {
        e = driver.findElement(Fill_firdtName);
        Search_for_items(e, First_Name);
    }

     private By Fill_LastName = By.cssSelector("input[id=\"LastName\"]");
    WebElement e1;

    public void Fill_Last_Name_Method(String Last_Name) {
        e1 = driver.findElement(Fill_LastName);
        Search_for_items(e1, Last_Name);

    }

    private By Day_Birth_Object = By.cssSelector("select[name=\"DateOfBirthDay\"]");
    WebElement Day_Element;
    private By Month_Birth_Object = By.cssSelector("select[name=\"DateOfBirthMonth\"]");
    WebElement Month_Element;
    private By Year_Birth_Object = By.cssSelector("select[name=\"DateOfBirthYear\"]");
    WebElement Year_Element;

    public void Enter_Data_Of_Birth(String Day, String Month, String Year) {
        Day_Element = driver.findElement(Day_Birth_Object);
        Day_Element.sendKeys(Day);
        Month_Element = driver.findElement(Month_Birth_Object);
        Month_Element.sendKeys(Month);
        Year_Element = driver.findElement(Year_Birth_Object);
        Year_Element.sendKeys(Year);
    }

     private By Email_object = By.cssSelector("input[id=\"Email\"]");
    WebElement Email;

    public void Fill_Email_Feild_Method(String email) {
        Email = driver.findElement(Email_object);
        Search_for_items(Email, email);
    }

    public void Fill_Company_Name(String Compay_Name) {
        WebElement e = driver.findElement(By.cssSelector("input[id=\"Company\"]"));
        Search_for_items(e, Compay_Name);
    }

    public void Click_Register() {
        WebElement e = driver.findElement(By.cssSelector("button[id=\"register-button\"]"));
        Clicking(e);
    }

    public void Fill_Password_Feild_Method(String password) {
        WebElement pass = driver.findElement(By.cssSelector("input[id=\"Password\"]"));
        Search_for_items(pass, password);
    }

    public void Fill_rePassword_Feild_Method(String Re_password) {
        WebElement Repass = driver.findElement(By.cssSelector("input[id=\"ConfirmPassword\"]"));
        Search_for_items(Repass, Re_password);

    }
    public void Click_on_Books(){
        WebElement element = driver.findElement(By.cssSelector("a[href=\"/books\"]"));
        Clicking(element);
    }
      private By x = By.cssSelector("button[class=\"button-2 product-box-add-to-cart-button\"]");
     public void Add_Book_To_Cart(){
         WebElement e =driver.findElement(x);
         Clicking(e);
     }
     public void Navigate_To_Shopping_Cart(){
         WebElement e = driver.findElement(By.cssSelector("span[class=\"cart-label\"]"));
        Clicking(e);
     }

        public void go_to_cart(){
         WebElement ele = driver.findElement(By.cssSelector("button[class=\"button-1 cart-button\"]"));
          Clicking(ele);
     }

    public String Get_Current_URl(){
        String Current_Url = driver.getCurrentUrl();
        return Current_Url ;
    }



}