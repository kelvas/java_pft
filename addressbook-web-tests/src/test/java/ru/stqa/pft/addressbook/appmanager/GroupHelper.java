package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.pft.addressbook.model.GroupDate;

public class GroupHelper {
  //privet FirefoxDriver driver;
 // public GroupHelper(ChromeDriver driver) {
 //   this.driver = driver;
 // }


  private ChromeDriver driver;

  public GroupHelper(ChromeDriver driver) {
    this.driver = driver;
  }

  public void returnToGroupPage() {
    driver.findElement(By.linkText("group page")).click();
  }

  public void submitGroupCreation() {
    driver.findElement(By.name("submit")).click();
  }

  public void fillGroupForm(GroupDate groupDate) {
    driver.findElement(By.name("group_name")).click();
    driver.findElement(By.name("group_name")).clear();
    driver.findElement(By.name("group_name")).sendKeys(groupDate.getName());
    driver.findElement(By.name("group_header")).click();
    driver.findElement(By.name("group_header")).clear();
    driver.findElement(By.name("group_header")).sendKeys(groupDate.getHeader());
    driver.findElement(By.name("group_footer")).click();
    driver.findElement(By.name("group_footer")).clear();
    driver.findElement(By.name("group_footer")).sendKeys(groupDate.getFooter());
  }

  public void initGroupCreation() {
    driver.findElement(By.name("new")).click();
  }

  public void deleteSelectedGroups() {
    driver.findElement(By.name("delete")).click();
  }

  public void selectGroup() {
    driver.findElement(By.name("selected[]")).click();
  }

  public void initGroupModification() {
    driver.findElement(By.name("edit")).click();
  }

  public void updateGroupModification() {
    driver.findElement(By.name("update")).click();
  }
}
