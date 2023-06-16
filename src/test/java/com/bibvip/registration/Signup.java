package com.bibvip.registration;

import com.bibvip.config.DriverConfig;
import com.bibvip.consts.ElementType;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Map;

import static com.bibvip.config.DriverConfig.getChromeConfig;
import static com.bibvip.config.DriverConfig.getDriverWait;

public class Signup {


    public static WebDriver  PositiveRegistration(){
        WebDriver chromeConfig = getChromeConfig();
        WebDriverWait driver = new WebDriverWait(chromeConfig, Duration.ofSeconds(3000L));

        // SIGNUP_BUTTON
        driver.until(ExpectedConditions.visibilityOf((WebElement) By.cssSelector(".register"))).click();
        // Clicking the Email tab
        driver.until(ExpectedConditions.visibilityOf((WebElement) By.cssSelector(".bib-1-cl > .bib-1-cl"))).click();
        // Click the email textbox
        driver.until(ExpectedConditions.visibilityOf((WebElement) By.cssSelector(".bib-13-bd > .bib-5-cl"))).click();
        // input email textbox
        driver.until(ExpectedConditions.visibilityOf((WebElement) By.cssSelector(".bib-13-bd > .bib-5-cl"))).sendKeys("bibvip.mananabas@gmail.com");
        // sendkeys to email textbox
        driver.until(ExpectedConditions.visibilityOf((WebElement) By.cssSelector(".bib-13-bd > .bib-5-cl"))).sendKeys(Keys.ENTER);
        // Click the Email Password textbox
        driver.until(ExpectedConditions.visibilityOf((WebElement) By.cssSelector(".bib-5-cl:nth-child(2)"))).click();
        // input email password textbox
        driver.until(ExpectedConditions.visibilityOf((WebElement) By.cssSelector(".bib-5-cl:nth-child(2)"))).sendKeys("Admin@1234567890");
        // sendkeys ti email password textbox
        driver.until(ExpectedConditions.visibilityOf((WebElement) By.cssSelector(".bib-5-cl:nth-child(2)"))).sendKeys(Keys.ENTER);
        // Hide text button
        driver.until(ExpectedConditions.visibilityOf((WebElement) By.cssSelector(".ps-is-show"))).click();
        // Signup button
        driver.until(ExpectedConditions.visibilityOf((WebElement) By.cssSelector(".loginBtn > span"))).click();
        return null;
    }

    public static void main(String[] args) {
        PositiveRegistration();
    }
}
