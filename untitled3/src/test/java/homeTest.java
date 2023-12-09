import org.testng.annotations.Test;

public class homeTest extends TestBase{

    private  HomePage h1 ;

    @Test(priority = 0)
    public void test1(){
    h1=new HomePage(driver);
      ///  h1.Select_price_type();
    h1.navigate_to_register_page();

    }
    @Test(priority = 1)
    public void d(){
        h1 =new HomePage(driver);
        //search for computer uding POM Selenium
        h1.Search_for_item("computer ");
        h1.Click_on_search();
        h1.Click_On_Category();

    }
}
