package tests;

import base.DriverInstance;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TC_003_ValidateLoginFunctionality extends DriverInstance {

    @Test
    public void tc_001_Login_Functionality() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("Hello");
        loginPage.enterPassword("Hello");
        loginPage.clickLogIn();
    }
}







