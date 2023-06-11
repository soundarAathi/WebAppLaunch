package org.example;

import com.google.common.annotations.VisibleForTesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;


public class Main {

 @Test
public void loginTest(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     WebElement user=driver.findElement(By.name("username"));
     user.sendKeys("Admin");
     WebElement pass=driver.findElement(By.name("password"));
     pass.sendKeys("admin123");
     WebElement logIn=driver.findElement(By.xpath("//*[@type='submit']"));
     logIn.click();




 }
}