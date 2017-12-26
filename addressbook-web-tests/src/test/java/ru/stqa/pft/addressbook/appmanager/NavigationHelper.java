package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper {
  //privet FirefoxDriver driver;
  //public NavigationHelper(ChromeDriver driver) {
  //  this.driver = driver;
  //}

  private ChromeDriver driver;

  public NavigationHelper(ChromeDriver driver) {
    this.driver = driver;
  }

  public void gotoGroupPage() {
    driver.findElement(By.linkText("groups")).click();
  }
}
