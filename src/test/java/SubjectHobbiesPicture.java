import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SubjectHobbiesPicture {




    By subjectsBoxLocator = By.cssSelector("input[id='subjectsInput']");
    By subject1Locator = By.id("react-select-2-option-0");
    By subhect2Locator = By.id("react-select-2-option-0");
    By sportsCheckBoxLocator = By.cssSelector("label[for='hobbies-checkbox-1']");
    By musicCheckBoxLocator = By.cssSelector("label[for='hobbies-checkbox-3']");
    By uploadLocator = By.cssSelector("input[id='uploadPicture']");






    public void subjectHobbiesPicture(WebDriver driver, String text,String text1,String path) {
        driver.findElement(subjectsBoxLocator).sendKeys(text);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(subject1Locator));
        driver.findElement(subject1Locator).click();
        driver.findElement(subjectsBoxLocator).sendKeys(text1);
        wait.until(ExpectedConditions.visibilityOfElementLocated(subhect2Locator));
        driver.findElement(subhect2Locator).click();
        driver.findElement(sportsCheckBoxLocator).click();
        driver.findElement(musicCheckBoxLocator).click();
        driver.findElement(uploadLocator).sendKeys(path);





    }





}
