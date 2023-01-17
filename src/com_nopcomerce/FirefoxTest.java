package com_nopcomerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxTest {
    public static void main(String[] args) {
        String baseurl = "https://demo.nopcommerce.com/"; //storing base url
        System.setProperty("Webdriver.gecko.driver", "src/drivers/geckodriver.exe");//setting firefox webdriver
        WebDriver driver = new FirefoxDriver();//creating object of chrome webdriver
        driver.get(baseurl);//methode to invoke Url
        driver.manage().window().maximize(); //maximizing windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session

        String title = driver.getTitle(); //storing title
        System.out.println("Title of the page :" + title); //printing title in console

        String url = driver.getCurrentUrl();//getting url
        System.out.println("current url :" + url);

        String source=driver.getPageSource();
        System.out.println("page source :" + source);

        driver.findElement(By.className("ico-login")).click();//clicking on login link
        WebElement emailIdField = driver.findElement(By.id("Email"));//storing emailfield
        emailIdField.sendKeys("patelkrunal1386@gmail.com");//sending keys to email id field
        WebElement passwordField = driver.findElement(By.id("Password"));//storing password field
        passwordField.sendKeys("kr13051986@");// sendkeys to password field
        driver.close(); //closing browser


    }
}