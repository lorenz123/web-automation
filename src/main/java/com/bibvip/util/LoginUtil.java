package com.bibvip.util;

import com.bibvip.config.DriverConfig;
import com.bibvip.consts.ElementType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.bibvip.consts.HomeElements.*;
import static com.bibvip.util.AppUtil.getBy;
import static com.bibvip.util.AppUtil.getElementWithPolling;

/**
 * @author ef-LORENZ
 */
public class LoginUtil {

    public static void doLoginEmail(WebDriverWait driverWait, String email, String password) {
        WebElement navLoginBtn = getElementWithPolling(driverWait, getBy(NAV_LOGIN_BTN, ElementType.X_PATH));
        navLoginBtn.click();
        WebElement rightBtn = getElementWithPolling(driverWait, getBy(RIGHT_SECTION_BTN, ElementType.CSS_SELECTOR));
        rightBtn.click();
        WebElement emailField = getElementWithPolling(driverWait, getBy(EMAIL_TXT_FIELD, ElementType.NAME));
        emailField.sendKeys(email);
        WebElement passwordField = getElementWithPolling(driverWait, getBy(PASSWORD_TXT_FIELD, ElementType.X_PATH));
        passwordField.sendKeys(password);
        WebElement login = getElementWithPolling(driverWait, getBy(LOGIN_BTN, ElementType.ID));
        login.click();

    }

    public static void closeFirstModal(WebDriverWait driverWait){
        WebElement closeBtn = getElementWithPolling(driverWait, getBy(CLOSE_BTN_FIRST_MODAL, ElementType.X_PATH));
        closeBtn.click();
    }

}
