package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(WebDriver driver) {
    // обращение к конструктору базового класса
    super(driver);
  }

  // идти на домашнюю стануцк
  public void gotoHomePage() {
    click(By.linkText("home"));
  }

  // идти на страницу групп
  public void gotoGroupPage() {
    click(By.linkText("groups"));
  }
}
