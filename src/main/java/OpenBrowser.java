import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class OpenBrowser {

    public static void main(String[] args) {
// System Property for Chrome Driver



        WebDriver driver=new ChromeDriver();
        // Launch Website
        driver.navigate().to("http://www.javatpoint.com/");

        //Maximize the browser
        driver.manage().window().maximize();

        //Scroll down the webpage by 5000 pixels
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0, 5000)");

        // Click on the Search button
        driver.findElement(By.linkText("Core Java")).click();

    }

}