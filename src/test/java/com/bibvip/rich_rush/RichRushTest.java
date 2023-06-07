package com.bibvip.rich_rush;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import static com.bibvip.config.DriverConfig.getChromeConfig;
import static com.bibvip.config.DriverConfig.getDriverWait;
import static com.bibvip.util.AppUtil.getElementWithPolling;

/**
 * @author ef-Olaf
 */


@Slf4j
public class RichRushTest {
    private WebDriver chromeConfig = null;
    private WebDriverWait getDriver = null;

    private final static String ADS = "//*[@id=\"__layout\"]/span/div/div[2]/div/div[9]/div/button";

    private final static String RICH_RUSH_BTN = "//*[@id=\"__layout\"]/span/div/div[1]/header/div[1]/div[3]/span";

    @Test
    public void setup() {
        chromeConfig = getChromeConfig();
        WebDriverWait webDriverWait = getDriverWait(chromeConfig);

        WebElement close_ads = getElementWithPolling(webDriverWait, By.ByXPath.xpath(ADS));
        close_ads.click();
    }


}
