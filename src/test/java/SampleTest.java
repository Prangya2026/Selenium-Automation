import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void launchGoogle() throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        // launch browser
        WebDriver driver = new ChromeDriver();
        //open website
        driver.get("https://www.google.com");
        //maximize window
        driver.manage().window().maximize();
        //print the title
        String title = driver.getTitle();
        System.out.println("page title is::" +title);
        driver.close();

    }

}
