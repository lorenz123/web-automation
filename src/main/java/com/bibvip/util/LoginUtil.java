package com.bibvip.util;

import com.bibvip.config.DriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.bibvip.util.AppUtil.getElementWithPolling;

/**
 * @author EF-lance
 */
public class LoginUtil extends DriverConfig {

    static String loginBTN = "button[contains(.,'Log In')]";

    public static void main(String[] args) {

        WebDriver chromeConfig = getChromeConfig();
        WebDriverWait driverWait = getDriverWait(chromeConfig);


        clickTheLoginBtn(driverWait);

    }

    static void clickTheLoginBtn(WebDriverWait wait){

        WebElement login = getElementWithPolling(wait, By.xpath(loginBTN));
        login.click();

    }

}
