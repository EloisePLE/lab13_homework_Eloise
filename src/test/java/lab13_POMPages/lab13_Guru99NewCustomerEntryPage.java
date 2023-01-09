package lab13_POMPages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class lab13_Guru99NewCustomerEntryPage extends lab13_BasePage{

    @FindBy(xpath = "//p[contains(text(),'Add New Customer')]")
    public WebElement newCustomerText;

    @FindBy(xpath = "//tbody/tr[4]/td[2]/input[1]")
    public WebElement customerName;

    @FindBy(xpath = "//input[@value='f']")
    public WebElement genderFRadioButton;

    @FindBy(id = "dob")
    public WebElement dateOfBirth;

    @FindBy(tagName = "textarea")
    public WebElement address;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='pinno']")
    public WebElement pin;

    @FindBy(xpath = "//input[@name='telephoneno']")
    public WebElement mobileNumber;

    @FindBy(xpath = "//input[@name='emailid']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@name='sub']")
    public WebElement submitButton;

    @FindBy(xpath = "//p[contains(text(),'Customer Registered Successfully!!!')]")
    public WebElement registrationConfirmationText;

    Faker faker = new Faker();

    public String getNewCustomerPageText(){
       return newCustomerText.getText();
    }

    public void Guru99NeCustomerEntry(){
        customerName.sendKeys(faker.name().fullName());
        genderFRadioButton.click();
        String year = faker.number().digits(4);
        String month = String.valueOf(faker.number().numberBetween(01, 30));
        String day = String.valueOf(faker.number().numberBetween(01, 12));
        dateOfBirth.sendKeys(year);
        dateOfBirth.sendKeys(Keys.ARROW_RIGHT);
        dateOfBirth.sendKeys(month);
        dateOfBirth.sendKeys(Keys.ARROW_RIGHT);
        dateOfBirth.sendKeys(day);
        address.sendKeys(faker.address().streetAddress());
        city.sendKeys(faker.address().city());
        state.sendKeys(faker.address().state());
        pin.sendKeys(faker.number().digits(6));
        mobileNumber.sendKeys(faker.number().digits(10));
        email.sendKeys(faker.internet().emailAddress());
        passwordBox.sendKeys(faker.internet().password());
        submitButton.click();
    }

    public String getRegistrationConfirmationText(){
        return registrationConfirmationText.getText();
    }
}
