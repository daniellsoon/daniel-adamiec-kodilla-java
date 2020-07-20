package com.kodilla.testing2.facebook;

import com.kodilla.testing2.comfig.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String  XPATH_DAY= "//*[@id=\"day\"]";
    public static final String  XPATH_MONTH = "//*[@id=\"month\"]";
    public static final String  XPATH_YEAR = "//*[@id=\"year\"]";


    public static void main(String[ ] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        WebElement selectDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDayList = new Select(selectDay);
        selectDayList.selectByIndex(10);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonthList = new Select(selectMonth);
        selectMonthList.selectByIndex(10);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYearList = new Select(selectYear);
        selectYearList.selectByValue("2000");
    }
}

