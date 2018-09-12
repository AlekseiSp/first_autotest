package tests.login;

import automationpracticeui.steps.login.LoginPageSteps;
import org.testng.annotations.Test;
import tests.BaseTest;

public class TestSignIn extends BaseTest {

    @Test(description = "96")
    void testSingIn() {
        LoginPageSteps loginPageSteps = mainPageSteps.clickSigninButton();
        loginPageSteps.

    }
}
