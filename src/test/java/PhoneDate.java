import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class PhoneDate {


    By numberLocator = By.cssSelector("input[id='userNumber']");
    By dateOfBirthLocator = By.cssSelector("input[id='dateOfBirthInput']");
    By monthsLocator = By.className("react-datepicker__month-select");
    By yearLocator = By.className("react-datepicker__year-select");
    By dayLocator = By.cssSelector("div[aria-label='Choose Friday, October 7th, 1994']");







    public void phoneDate (WebDriver driver,String number){
        driver.findElement(numberLocator).sendKeys(number);
        driver.findElement(dateOfBirthLocator).click();
        driver.findElement(monthsLocator).click();
        Select slc = new Select(driver.findElement(monthsLocator));
        slc.selectByValue("9");
        driver.findElement(yearLocator).click();
        slc = new Select(driver.findElement(yearLocator));
        slc.selectByVisibleText("1994");
        driver.findElement(dayLocator).click();
    }

}
