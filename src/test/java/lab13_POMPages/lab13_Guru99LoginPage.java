package lab13_POMPages;

import myproject.utilities.PropertiesReadingUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class lab13_Guru99LoginPage extends lab13_BasePage {
    @FindBy(css = "table:nth-child(2) tbody:nth-child(1) tr:nth-child(1) td:nth-child(2) > input:nth-child(1)")
    public WebElement idTextBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//h2[contains(text(),'Guru99 Bank')]")
    public WebElement divText;


    public void loginForGuru99(){
        idTextBox.sendKeys(PropertiesReadingUtil.getProperties("Guru99userId"));
        passwordTextBox.sendKeys(PropertiesReadingUtil.getProperties("Guru99password"));
        loginButton.click();
    }

    public String getGuru99LoginText(){
        return divText.getText();
    }
}

