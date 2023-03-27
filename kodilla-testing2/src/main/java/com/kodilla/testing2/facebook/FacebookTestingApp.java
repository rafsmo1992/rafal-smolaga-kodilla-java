package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FacebookTestingApp {

    public static final String XPATH_COOKIE = "//div[contains(@class, \"_9xo5\")]/button[2]";
    public static final String XPATH_CreateAccount = "//div[contains(@class, \"_6ltg\")]/a";
    public static final String XPATH_WAIT_FOR = "//div[contains(@class, \"large_form\")]";
    public static final String XPATH_BIRTH_DAY =  "//select[@name=\"birthday_day\"]";
    public static final String XPATH_BIRTH_MONTH = "//select[contains(@name, \"birthday_month\")]";
    public static final String XPATH_BIRTH_YEAR = "//select[contains(@name, \"birthday_year\")]";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(" https://www.facebook.com/");
        driver.findElement(By.xpath(XPATH_COOKIE)).click();
        driver.findElement(By.xpath(XPATH_CreateAccount)).click();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_WAIT_FOR)));
        WebElement selectDay = driver.findElement(By.xpath(XPATH_BIRTH_DAY));
        Select dayExactly = new Select(selectDay);
        dayExactly.selectByIndex(18);
        WebElement selectMonth = driver.findElement(By.xpath(XPATH_BIRTH_MONTH));
        Select monthExactly = new Select(selectMonth);
        monthExactly.selectByIndex(10);
        WebElement selectYear = driver.findElement(By.xpath(XPATH_BIRTH_YEAR));
        Select yearExactly = new Select(selectYear);
        yearExactly.selectByValue("1992");
    }

}
