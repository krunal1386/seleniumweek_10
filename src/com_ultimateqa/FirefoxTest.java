package com_ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxTest {
    //Main method
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in"; //storing base URL
        System.setProperty("webdriver.gecko.driver", "src/drivers/gecko.exe"); //setting webdriver
        WebDriver driver = new FirefoxDriver(); //creating object of Chrome webdriver
        driver.get(baseUrl); //method to invoke url
        driver.manage().window().maximize(); //to maximise window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session

        String title = driver.getTitle(); //storing title of the page
        System.out.println("TITLE OF PAGE: " + title); //print title

        String currentURL = driver.getCurrentUrl(); //storing current URL
        System.out.println("CURRENT URL OF PAGE: " + currentURL); //print current URL

        String pageSource = driver.getPageSource(); //storing page source
        System.out.println("PAGE SOURCE: " + pageSource); //print page source

        WebElement usernameField = driver.findElement(By.id("user[email]")); //storing email field
        usernameField.sendKeys("patelkrunal1386@gmail.com"); //sending keys to email field

        WebElement passwordField = driver.findElement(By.id("user[password]")); //storing password field
        passwordField.sendKeys("Kr13051986@"); //sending keys to password field

        driver.close(); //close browser
    }
}
