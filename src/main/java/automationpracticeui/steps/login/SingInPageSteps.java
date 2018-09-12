package automationpracticeui.steps.login;

import automationpracticeui.objects.login.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SingInPageSteps extends SignUpPageSteps {
    private SignInPage signInPage;

    public SingInPageSteps(WebDriver driver) {
        super(driver);
        signInPage = PageFactory.initElements(driver, SignInPage.class);
    }

    public SignInPage writeInForm(String firstName, String lastName, String address) {
        signInPage.getFirstNameInputInfo().clear();
        signInPage.getFirstNameInputInfo().sendKeys(firstName);
        signInPage.getLastNameInputInfo().clear();
        signInPage.getLastNameInputInfo().sendKeys(lastName);
        signInPage.getAddressInput().clear();
        signInPage.getAddressInput().sendKeys(address);
        return new SingInPageSteps(driver);


    }

}
