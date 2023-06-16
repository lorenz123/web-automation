package com.bibvip.config;

import com.bibvip.consts.ElementType;
import com.bibvip.util.AppUtil;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.bibvip.util.AppUtil.getElementWithPolling;

@Slf4j
public class CodeShorter {

    public static void emailElementsWithFields (WebDriverWait wait, ElementType types, String path, String message, Long sleepTime,
                                                String sendKeys) throws InterruptedException{

        WebElement element = getElementWithPolling(wait, AppUtil.getBy(types, path, message, sleepTime,sendKeys));
        if (element.isDisplayed()){
            log.info(message);
        } else {
            log.error("element doesn't exist!");
        }element.click();
        element.sendKeys(sendKeys);
        Thread.sleep(sleepTime);
    }
}
