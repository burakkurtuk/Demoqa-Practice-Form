import org.openqa.selenium.WebDriver;



public class Main {




    public static void main(String[] args) {

        WebDriver driver;
        Url url = new Url();
        driver = url.getDriver();
        Personal personal = new Personal();
        personal.personalInf(driver,"Firstname", "Lastname", "Email");
        PhoneDate phoneDate = new PhoneDate();
        phoneDate.phoneDate(driver,"phoneNumber");
        SubjectHobbiesPicture subhobpic = new SubjectHobbiesPicture();
        subhobpic.subjectHobbiesPicture(driver,"Com","Che","path of file");
        AddressStateAndCity addStateCity = new AddressStateAndCity();
        addStateCity.addressStateAndCity(driver,"Istanbul, Turkey");







    }
}