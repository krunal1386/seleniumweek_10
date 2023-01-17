package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    //Main method
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login"; //storing base URL
        System.setProperty("webdriver.edge.driver", "src/drivers/msedgedriver.exe"); //setting webdriver
        WebDriver driver = new EdgeDriver(); //creating object of Chrome webdriver
        driver.get(baseUrl); //method to invoke url
        driver.manage().window().maximize(); //to maximise window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session

        String title = driver.getTitle(); //storing title
        System.out.println("TITLE OF PAGE: " + title); //print title

        String currentURL = driver.getCurrentUrl(); //storing current URL
        System.out.println("CURRENT URL OF PAGE: " + currentURL); //print current URL

        String pageSource = driver.getPageSource(); //storing page source
        System.out.println("PAGE SOURCE: " + pageSource); //print page source

        WebElement usernameField = driver.findElement(By.id("username")); //storing email field
        usernameField.sendKeys("tomsmith"); //sending keys to email field

        WebElement passwordField = driver.findElement(By.id("password")); //storing email field
        passwordField.sendKeys("SuperSecretPassword!"); //sending keys to email field

     //  driver.close(); //close browser
    }
}
