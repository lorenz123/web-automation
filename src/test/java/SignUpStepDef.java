import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.bibvip.config.DriverConfig.getChromeConfig;
import static com.bibvip.config.DriverConfig.getDriverWait;
import static com.bibvip.login.LoginElements.X_BUTTON_OF_WEALTH_ENANCEMENT;
import static com.bibvip.util.AppUtil.getElementWithPolling;

@Slf4j
public class SignUpStepDef {
//Background


    WebDriver chromeConfig = getChromeConfig();
    WebDriverWait driverWait = getDriverWait(chromeConfig);

    @Test
    @When("navigates to Homepage")
    public void navigatesToHomepage() {

        WebElement wealthEnhancementXBtn = getElementWithPolling(driverWait, By.xpath(X_BUTTON_OF_WEALTH_ENANCEMENT));
        wealthEnhancementXBtn.click();
    }

    @Test
    @And("I click the Sign Up page")
    public void iClickTheSignUpPage(WebDriver driver, WebDriverWait wait) {


        driver.findElement(By.cssSelector(".bib-1-cl > .bib-1-cl")).click();
    }


    @Given("I am going to click the Email tab")
    public void iAmGoingToClickTheEmailTab() {

        WebElement clickTheEmailTab = getElementWithPolling(driverWait, By.cssSelector(".bib-1-cl > .bib-1-cl"));
        clickTheEmailTab.click();
    }

    @When("I enter a unused email")
    public void iEnterAUnusedEmail() {
    }

    @And("also I enter password as Alphanumerical")
    public void alsoIEnterPasswordAsAlphanumerical() {
    }

    @And("I also able to click the hidden eye button")
    public void iAlsoAbleToClickTheHiddenEyeButton() {
    }

    @And("Click the checkbox of User's Agreement and Privacy Policy")
    public void clickTheCheckboxOfUserSAgreementAndPrivacyPolicy() {
    }

    @And("I will able to click the Sign Up button successfully")
    public void iWillAbleToClickTheSignUpButtonSuccessfully() {
    }

    @Then("the gee-test will show up to solve the puzzle")
    public void theGeeTestWillShowUpToSolveThePuzzle() {
    }
}
