//package com.bibvip.login;
//
//import com.bibvip.config.DriverConfig;
//import io.cucumber.java.en.Given;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import org.junit.runner.RunWith;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import static com.bibvip.util.AppUtil.getElementWithPolling;
//
///**
// * @author EF-lance
// */
//
//@RunWith(Cucumber.class)
//@CucumberOptions(features = "Features", glue = {"StepDefinition"})
//public class LoginUtil extends DriverConfig {
//
//    //Buttons
////    static String ekisBtnWealthEnhancement ="/html/body/div/div/span/div/div[2]/div/div[9]/div/button";
////    static String loginBTN = "/html/body/div/div/span/div/div[1]/header/div[2]/span/button[2]";
////    static String login = "//button[@id='login-btn']/span";
////    //Email text box inputs
////    static String emailBtn = "/html/body/div[3]/div/div[2]/section/div[2]/div/div[1]/ul/li[2]/span";
////    static String emailTextbox = "email";
////    static String fuckingPassword = "(//input[@type='password'])[2]";
////    static String hideEyeBtn = ".ps-is-show";
//
//    public static void main(String[] args) {
//
//        WebDriver chromeConfig = getChromeConfig();
//        WebDriverWait driverWait = getDriverWait(chromeConfig);
//
//        //Redirect to LoginPage
//        WebElement wealthEnhancementXBtn = getElementWithPolling(driverWait, By.xpath(ekisBtnWealthEnhancement));
//        wealthEnhancementXBtn.click();
//        clickTheLoginBtn(driverWait);
//        input_Elements_In_TextBox_Email(driverWait);
//
//    }
//
//    @Given("^I am going to login with my registered E-mail address")
//    static void clickTheLoginBtn(WebDriverWait wait){
//
//        WebElement login = getElementWithPolling(wait, By.xpath(loginBTN));
//        login.click();
//
//    }
//
//    static void input_Elements_In_TextBox_Email(WebDriverWait wait){
//
//        //Clicking the E-mail button
//        WebElement emailTab = getElementWithPolling(wait, By.xpath(emailBtn));
//        emailTab.click();
//
//        //email
//        WebElement emailTxtBox = getElementWithPolling(wait, By.name(emailTextbox));
//        emailTxtBox.click();
//        emailTxtBox.sendKeys("bibvip.mananabas@gmail.com");
//        //password
//        WebElement passwordEmail = getElementWithPolling(wait, By.xpath(fuckingPassword));
//        passwordEmail.click();
//        passwordEmail.sendKeys("Admin@1234567890");
//        //Hide eye Button
//        WebElement hideEyeButton = getElementWithPolling(wait, By.cssSelector(hideEyeBtn));
//        hideEyeButton.click(); hideEyeButton.click();
//        //Click the Login
//        WebElement loginButton = getElementWithPolling(wait, By.xpath(login));
//        loginButton.click();
//        //Gee-test manually operated
//        //Get the e-mail verification
//
//
//        WebElement button = getElementWithPolling(wait, By.xpath("/html/body/div/div/span/div/div[2]/div/div[1]/div/div[2]/button"));
//        button.click();
//
//
//
//    }
//
//}
