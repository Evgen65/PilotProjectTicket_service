import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartTicketTest {
    WebDriver wd;


    @BeforeMethod
    public void preCondition() {
        wd = new ChromeDriver();
        wd.get("https://ticket-service-69443.firebaseapp.com/");
        System.out.println("Precondition");

    }

    @Test
    public void testName() {
        System.out.println("test started");

    }



    @AfterMethod
    public void postCondition() {
        System.out.println("Postcondition");
        //  wd.close();
      //  wd.quit();


    }
}