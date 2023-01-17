package comOrange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseurl = "https://opensource-demo.orangehrmlive.com/"; //storing base url
        System.setProperty("webdriver.edge.driver", "src/drivers/msedgedriver.exe"); //setting webdriver
        WebDriver driver = new EdgeDriver(); //creating object of chrome webdriver
        driver.get(baseurl); //methode to invoke Url
        driver.manage().window().maximize(); //maximizing windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session

        String title = driver.getTitle(); //storing title
        System.out.println("Title of the page :" + title); //printing title in console

        String url = driver.getCurrentUrl();//getting url
        System.out.println("current url :" + url);

        String pageSource = driver.getPageSource(); //storing page source
        System.out.println("Page source:" + pageSource); //print page source

        WebElement usernameField = driver.findElement(By.name("username")); //storing email field
        usernameField.sendKeys("Admin"); //sending keys to email field

        WebElement passwordField = driver.findElement(By.name("password")); //storing email field
        passwordField.sendKeys("admin123"); //sending keys to email field

     //   driver.close(); //close browser

    }
}
