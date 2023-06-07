package com.bibvip.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * @author ef-LORENZ
 */
public class DriverConfig {
    private final static String prodEnv = "https://www.bibvip.com/en_US";
    private final static Integer WAITING_TIME = 40;

    public static WebDriver getChromeConfig() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        WebDriver driverChrome = new ChromeDriver(options);
        driverChrome.get(prodEnv);
        return driverChrome;

    }

    public static WebDriverWait getDriverWait(WebDriver driver){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(WAITING_TIME));
        return webDriverWait;
    }
}
