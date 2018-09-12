package automationpracticeui.steps;

import automationpracticeui.objects.MainPage;
import automationpracticeui.steps.login.LoginPageSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class MainPageSteps {
    private MainPage mainPage;
    protected WebDriver driver;

    public MainPageSteps(WebDriver driver) {
        this.driver = driver;
        this.mainPage = PageFactory.initElements(driver, MainPage.class);
    }

    public void search(String searchQuery){
        mainPage.getSearchInput().clear();
        mainPage.getSearchInput().sendKeys(searchQuery);
        mainPage.getSearchSubmitButton().click();
    }

    public LoginPageSteps clickSigninButton(){
        mainPage.getSigninButton().click();
        return new LoginPageSteps(driver);
    }


    public Boolean isCoolDressDisplayed() {
        return mainPage.getCoolDress().isDisplayed();
    }

    public Boolean isCoolDressShownTheFirst(){
        ArrayList<WebElement> webElementArrayList =
                (ArrayList<WebElement>) driver.findElements(By.cssSelector("[class='product_img_link']"));

        if (webElementArrayList.size() > 0){
            WebElement webElement = webElementArrayList.get(0);
            return webElement.findElement(By.cssSelector("img")).getAttribute("src").
                    contains("http://automationpractice.com/img/p/1/2/12-home_default.jpg");
        }
        return false;
        }

        public void clickBlock() {
        mainPage.getSaleBanner().click();
    }

    }
