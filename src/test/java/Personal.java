import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Personal  {




    By firstNameLocator = By.cssSelector("input[id='firstName']");
    By lastNameLocator = By.cssSelector("input[id='lastName']");
    By emailLocator = By.cssSelector("input[id='userEmail']");
    By genderLocator = By.cssSelector("label[for='gender-radio-1']");


    public void personalInf(WebDriver driver, String firstName,String lastName,String email) {
        driver.findElement(firstNameLocator).sendKeys(firstName);
        driver.findElement(lastNameLocator).sendKeys(lastName);
        driver.findElement(emailLocator).sendKeys(email);
        driver.findElement(genderLocator).click();
    }








    }

