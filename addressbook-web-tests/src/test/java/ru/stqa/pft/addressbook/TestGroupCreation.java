package ru.stqa.pft.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;


public class TestGroupCreation {

    //FirefoxDriver wd;   // Firefox
    ChromeDriver wd;    // Chrome

    // Метод инициализации фикстуры
    @BeforeMethod
    public void setUp() throws Exception {
        //System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");    // Firefox
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");    // Chrome
        //FirefoxDriver wd = new FirefoxDriver(); // Firefox
        wd = new ChromeDriver();    // Chrome
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/group.php");
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys("admin");
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys("secret");
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }
    
    @Test
    public void GroupCreationTests() {
        wd.findElement(By.linkText("groups")).click();
        wd.findElement(By.name("new")).click();
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys("test1");
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys("test2");
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys("test3");
        wd.findElement(By.name("submit")).click();
        wd.findElement(By.linkText("group page")).click();
    }

    // Метод завершения фикстуры
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }

    // public static boolean isAlertPresent(FirefoxDriver wd) {     // Firefox
    public static boolean isAlertPresent(ChromeDriver wd) {     // Chrome
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
