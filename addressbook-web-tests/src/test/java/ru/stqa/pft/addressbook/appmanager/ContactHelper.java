package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.ContactDate;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver driver) { super(driver); }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void fillContactForm(ContactDate contactDate) {
    type(By.name("firstname"), contactDate.getFirstname());
    type(By.name("lastname"), contactDate.getSecondname());
    // выбрать элемент из выпадающего списка списка
    // использ вспомогательный класс
    if (isElementPresent(By.name("new_group"))) {
      new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactDate.getGroup());
    }
  }

  public void submitContactCreation() { click(By.name("submit")); }

  public void returnToHomePage() { click(By.linkText("home page")); }

  public void initContactModify() { click(By.xpath("//img[@alt='Edit']")); }

  public void submitContactModify() { click(By.name("update"));
  }
}
