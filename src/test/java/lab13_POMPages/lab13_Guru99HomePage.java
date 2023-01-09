package lab13_POMPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class lab13_Guru99HomePage extends lab13_BasePage {
    @FindBy(xpath = "//td[contains(text(),'Manger Id : mngr467390')]")
    public WebElement textManagerId;

    @FindBy(linkText = "New Customer")
    public WebElement newCustomerButton;

    public String getGuru99ManagerIdText(){
        return textManagerId.getText();
    }

    public void clickGuru99NewCustomerButton(){
        newCustomerButton.click();
    }
}
