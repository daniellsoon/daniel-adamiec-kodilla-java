package com.kodilla.testing2.comfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
    public static final String CHROME = "CHROME_DRIVER";
    public static final String FIREFOX = "FIREFOX_DRIVER";
    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.chrome.driver", "c:\\Selenium-drivers\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "c:\\Selenium-drivers\\Firefox\\geckodriver.exe");
        if (driver.equals(CHROME)) {
            System.out.println("Chrome zainstalowany");
            return new ChromeDriver();
        }else if(driver.equals(FIREFOX)) {
            System.out.println("Firefox zainstalowany");
            return new FirefoxDriver();
        }else {
            System.out.println("Dupa nie działa");
            return null;
        }
    }
}
