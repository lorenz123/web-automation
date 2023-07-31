package com.bibvip.stepdefs;

import com.bibvip.config.DriverConfig;
import com.bibvip.consts.ElementType;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.bibvip.config.DriverConfig.getDriverWait;
import static com.bibvip.consts.HomeElements.*;
import static com.bibvip.util.AppUtil.getBy;
import static com.bibvip.util.AppUtil.getElementWithPolling;
import static com.bibvip.util.LoginUtil.getEmailErrorMsg;
import static com.bibvip.util.LoginUtil.goToLoginEmail;

/**
 * @author ef-LORENZ
 */
public class LoginEmailStepDefs {
    private static WebDriver driver;
    private static WebDriverWait wait;
    Add Menu
            Name, Logo, Page Jump Address, Sort, Google Auth

    @BeforeAll
    public static void setup(){
        driver = DriverConfig.getChromeConfig();
        wait = getDriverWait(driver);
        WebElement closeBtn = getElementWithPolling(wait, getBy(CLOSE_BTN_FIRST_MODAL, ElementType.X_PATH));
        closeBtn.click();

    }

    @AfterAll
    public static void destroy(){
        driver.quit();
    }

    @Given("I am Email - Login page")
    public void iAmEmailLoginPage() {
        goToLoginEmail(wait);
    }

    @When("I input an invalid email {string}")
    public void iInputAnInvalidEmail(String email) {
        WebElement emailField = getElementWithPolling(wait, getBy(EMAIL_TXT_FIELD, ElementType.NAME));
        emailField.sendKeys(email);
    }

    @And("I click Login Button")
    public void iClickLoginButton() {
        WebElement login = getElementWithPolling(wait, getBy(LOGIN_BTN, ElementType.ID));
        login.click();
    }

    @Then("I should be prompted with an error {string}")
    public void iShouldBePromptedWithAnError(String error) {
        Assert.assertEquals(getEmailErrorMsg(wait),error);
    }

    @When("I input an incorrect password")
    public void iInputAnIncorrectPassword() {

    }

    @When("I input valid credentials")
    public void iInputValidCredentials() {

    }

    @Then("I should be prompted with a successful message")
    public void iShouldBePromptedWithASuccessfulMessage() {

    }

    @And("I should be redirected to Home page")
    public void iShouldBeRedirectedToHomePage() {

    }
}
