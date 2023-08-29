package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookInfoTest {
    ChromeDriver chromeDriver = new ChromeDriver();
    @Test
    public void testName(){
        chromeDriver.findElement(By.xpath("//a[@href='/profile?book=9781449365035']")).click();
    }
    @BeforeTest
    public void logIn()
    {
        chromeDriver.get("https://demoqa.com/books");
        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.id("login")).click();
        chromeDriver.findElement(By.id("userName")).sendKeys("idm");
        chromeDriver.findElement(By.id("password")).sendKeys("Jassumiva123!");
        chromeDriver.findElement(By.id("login")).click();
    }
}
