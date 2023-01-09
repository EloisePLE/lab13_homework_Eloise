import lab13_POMPages.lab13_Guru99HomePage;
import lab13_POMPages.lab13_Guru99LoginPage;
import lab13_POMPages.lab13_Guru99NewCustomerEntryPage;
import myproject.base.TestBase2;
import myproject.utilities.DriverUtil;
import myproject.utilities.PropertiesReadingUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class lab13_Guru99Tests extends TestBase2 {
    @Test
    public void TC1_Guru99Login() {
        //Go to Guru99 Demo Site http://demo.guru99.com/V4/
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("Guru99DemoSite"));
        //In Login page check text "Guru99 Bank" is present
        lab13_Guru99LoginPage lab13_guru99LoginPage = new lab13_Guru99LoginPage();
        String expectedText = "Guru99 Bank";
        String actualText = lab13_guru99LoginPage.getGuru99LoginText();
        Assert.assertEquals(expectedText, actualText, "Verification failed. Text 'Guru99 Bank' not present.");
        //Login into application with given credentials
        lab13_guru99LoginPage.loginForGuru99();
    }

    @Test
    public void TC2_Guru99HomePageVerification(){
        //Verify that the Home page contains text as "Manger Id : mngr467390"
        lab13_Guru99HomePage lab13_guru99HomePage = new lab13_Guru99HomePage();
        String expectedText = "Manger Id : mngr467390";
        String actualText = lab13_guru99HomePage.getGuru99ManagerIdText();
        Assert.assertEquals(expectedText, actualText, "Verification failed. Text 'Manger Id : mngr467390' not present.");
        // Click on new customer button
        lab13_guru99HomePage.clickGuru99NewCustomerButton();
    }

    @Test
    public void TC3_newCustomerRegistrationVerification(){
        // Verify you are in New Customer Entry Page
        lab13_Guru99NewCustomerEntryPage lab13_guru99NewCustomerEntryPage = new lab13_Guru99NewCustomerEntryPage();
        String expectedText = "Add New Customer";
        String actualText = lab13_guru99NewCustomerEntryPage.getNewCustomerPageText();
        Assert.assertEquals(expectedText, actualText, "Verification failed. Text 'Add New Customer' not present.");
        // Fill the information for new customer
        lab13_guru99NewCustomerEntryPage.Guru99NeCustomerEntry();
        // Verify new customer added successfully
        String expectedText2 = "Customer Registered Successfully!!!";
        String actualText2 = lab13_guru99NewCustomerEntryPage.getRegistrationConfirmationText();
        Assert.assertEquals(expectedText, actualText, "Verification failed. Text 'Customer Registered Successfully!!!' not present.");
    }
}
