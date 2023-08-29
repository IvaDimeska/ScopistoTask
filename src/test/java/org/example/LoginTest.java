package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
    ChromeDriver chromeDriver = new ChromeDriver();

    @Test
    public void testName() {
        chromeDriver.get("https://demoqa.com/books");
        chromeDriver.manage().window().maximize();
chromeDriver.findElement(By.id("login")).click();
        chromeDriver.findElement(By.id("userName")).sendKeys("idm");
        chromeDriver.findElement(By.id("password")).sendKeys("Jassumiva123!");
        chromeDriver.findElement(By.id("login")).click();

    }
}