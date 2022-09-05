import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddressStateAndCity {


    By addressBoxLocator = By.cssSelector("textarea[id='currentAddress']");
    By stateLocator = By.xpath("(//div[@class=' css-1wy0on6'])[1]");
    By uttarLocator = By.cssSelector("div[id='react-select-3-option-1']");
    By cityLocator = By.xpath("(//div[@class=' css-1wy0on6'])[2]");
    By merrutLocator = By.cssSelector("div[id='react-select-4-option-2']");
    By submitButtonLocator = By.cssSelector("button[id='submit']");


    public void addressStateAndCity(WebDriver driver, String address){
        driver.findElement(addressBoxLocator).sendKeys(address);
        driver.findElement(stateLocator).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(uttarLocator));
        driver.findElement(uttarLocator).click();
        driver.findElement(cityLocator).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(merrutLocator));
        driver.findElement(merrutLocator).click();
        driver.findElement(submitButtonLocator).click();
    }

}
