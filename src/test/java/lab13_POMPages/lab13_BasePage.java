package lab13_POMPages;

import myproject.utilities.DriverUtil;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class lab13_BasePage {
    protected WebDriverWait driverWait = new WebDriverWait(DriverUtil.getDriver(), Duration.ofSeconds(20));
    public lab13_BasePage(){
        PageFactory.initElements(DriverUtil.getDriver(), this);
    }
}
