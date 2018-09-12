package automationpracticeui.objects.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends SignUpPage {
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "customer_firstname")
    private WebElement firstNameInputInfo;

    @FindBy(id = "customer_lastname")
    private WebElement lastNameInputInfo;

    @FindBy(id = "firstname")
    private WebElement firstNameInputAddress;

    @FindBy(id = "lastname")
    private WebElement lastNameInputAddress;

    @FindBy(id = "address1")
    private WebElement addressInput;


    public WebElement getFirstNameInputInfo() {
        return firstNameInputInfo;
    }

    public WebElement getLastNameInputInfo() {
        return lastNameInputInfo;
    }

    public WebElement getFirstNameInputAdress() {
        return firstNameInputAddress;
    }

    public WebElement getLastNameInputAdress() {
        return lastNameInputAddress;
    }

    public WebElement getAddressInput() {
        return addressInput;
    }

}
