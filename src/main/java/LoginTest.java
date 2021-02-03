import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest   {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {


        //Chrome browser
          System.setProperty("webdriver.chrome.driver", "src/chromedriver_win32/chromedriver.exe");
          driver=new ChromeDriver(); //ChromeDriver driver=new ChromeDriver(); //Launch the chrome browser

        driver.get(""); //Open URL  http://opensource.demo.orangehrmlive.com

        driver.findElement(By.name("userName")).sendKeys(""); //Enter username  (Admin).

        driver.findElement(By.name("password")).sendKeys(""); //Enter password  (admin).

        driver.findElement(By.id("tynamoEnter")).click();   //Click on Submit.

        Thread.sleep(5000);

        String actTitle="Find a Flight: Mercury Tours:";
        String expTitle=driver.getTitle();

        //Verify title of the page
        if(expTitle.equals(actTitle))
        {
            System.out.println("Login test passed");
        }
        else
        {
            System.out.println(" Login Test failed");
        }

        driver.close(); // closes the browser
    }
}
