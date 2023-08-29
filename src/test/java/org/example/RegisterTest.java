package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest {
    ChromeDriver chromeDriver = new ChromeDriver();

    @Test
    public void testName() {
        chromeDriver.get("https://demoqa.com/books");
        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.id("login")).click();
        chromeDriver.findElement(By.id("newUser")).click();
        chromeDriver.findElement(By.id("firstname")).sendKeys("iva");
        chromeDriver.findElement(By.id("lastname")).sendKeys("dimeska");
        chromeDriver.findElement(By.id("userName")).sendKeys("idm");
        chromeDriver.findElement(By.id("password")).sendKeys("P@ssw0rd");
        chromeDriver.findElement(By.id("recaptcha-anchor")).click();
        chromeDriver.findElement(By.id("register")).click();

    }
}