import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url  {

    WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    String BASE_URL = "https://demoqa.com/automation-practice-form";







    public Url() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);


    }
}
