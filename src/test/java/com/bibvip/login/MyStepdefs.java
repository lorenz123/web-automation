package com.bibvip.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.bibvip.config.DriverConfig.getChromeConfig;
import static com.bibvip.config.DriverConfig.getDriverWait;
import static com.bibvip.login.LoginElements.*;
import static com.bibvip.util.AppUtil.getElementWithPolling;

public class MyStepdefs {


    WebDriver chromeConfig = getChromeConfig();
    WebDriverWait driverWait = getDriverWait(chromeConfig);

    //Background
    @Test
    @Given("I am at homepage and will click X button of the modal to navigate in Login page")
    public void iAmAtHomepageAndWillClickXButtonOfTheModalToNavigateInLoginPage() {
        //Redirect to LoginPage
        WebElement wealthEnhancementXBtn = getElementWithPolling(driverWait, By.xpath(X_BUTTON_OF_WEALTH_ENANCEMENT));
        wealthEnhancementXBtn.click();
    }

    @Test
    @And("Click the Login button page")
    public void clickTheLoginButtonPage() {

        WebElement clickTheLoginPage = getElementWithPolling(driverWait, By.xpath(LOGIN));
        clickTheLoginPage.click();

    }

    @Test
    @Given("I will click the Email tab button first")
    public void iWillClickTheEmailTabButtonFirst() {

        WebElement clickEmailBtnTab = getElementWithPolling(driverWait, By.xpath(EMAIL_TAB_IN_THE_MODAL));
        clickEmailBtnTab.click();

    }

    @Test
    @When("I Enter a valid email address")
    public void iEnterAValidEmailAddress() {

        //email
        WebElement email = getElementWithPolling(driverWait, By.name(EMAIL_TEXTBOX));
        email.click();
        email.sendKeys("bibvip.mananabas@gmail.com");
    }

    @Test
    @And("I enter valid password")
    public void iEnterValidPassword() {

        //password
        WebElement passwordEmail = getElementWithPolling(driverWait, By.xpath(FUCKING_PASSWORD));
        passwordEmail.click();
        passwordEmail.sendKeys("Admin@1234567890");
    }

    @Test
    @And("Click the hide eye button")
    public void clickTheHideEyeButton() {

        //Hide eye Button
        WebElement hideEyeButton = getElementWithPolling(driverWait, By.cssSelector(HIDE_EYE_BTN));
        hideEyeButton.click();
    }

    @Test
    @Then("should click the login button to show the gee-test")
    public void shouldClickTheLoginButtonToShowTheGeeTest() {

        //Click the Login
        WebElement loginButton = getElementWithPolling(driverWait, By.xpath(EMAIL_LOGIN_BUTTON));
        loginButton.click();

        /*Gee-test manually operated
        Get the e-mail verification*/
    }

    @Test
    @When("I Enter a invalid email address")
    public void iEnterAInvalidEmailAddress() {

        WebElement enterInvalidEmailAdd = getElementWithPolling(driverWait, By.name(EMAIL_TEXTBOX));
        enterInvalidEmailAdd.click();
        enterInvalidEmailAdd.sendKeys("bibvip.mananabas.com");

    }

    @Test
    @And("I enter invalid password")
    public void iEntervalidPassword() {

        WebElement enterInvalidPass = getElementWithPolling(driverWait, By.xpath(FUCKING_PASSWORD));
        enterInvalidPass.click();
        enterInvalidPass.sendKeys("Admin@1234567890");
    }

    @Test
    @Then("will not click the Login button")
    public void willNotClickTheLoginButton() {
        //Click the Login
//        WebElement willNotClickLoginBtn = getElementWithPolling(driverWait, By.xpath(EMAIL_LOGIN_BUTTON));
    }

    @Test
    @Then("will Click the Login button")
    public void willClickTheLoginButton() {

        WebElement clickTheLoginBtn = getElementWithPolling(driverWait,By.xpath(EMAIL_LOGIN_BUTTON));
        clickTheLoginBtn.click();
    }
}
