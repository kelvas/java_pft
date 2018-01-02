package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactDate;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver driver) {
    super(driver);
  }

  public void fillContactForm(ContactDate contactDate) {
    type(By.name("firstname"), contactDate.getFirstname());
    type(By.name("lastname"), contactDate.getSecondname());
  }

  // верхний клик в контактах на редактирование контакта
  public void updateContactModification() {
    click(By.name("update"));
  }

  // клик на карандаш для редактирования
  public void selectContactEdit() {
    click(By.xpath("//img[@alt='Edit']"));
  }


  // подтверждение изменений из создания контакта
  public void submitContactCreation() {
    click(By.name("submit"));
  }

  // клик на человечка ддля изменения
  public void detailsContacn() {
    click(By.xpath("//img[@alt='Details']"));
  }

  // клик для подтверждения изменений
  public void modifyContact() {
    click(By.name("modifiy"));
  }

  // возврат на домашнюю страницу
  public void returnToHomePage() {
    click(By.linkText("home page"));
  }

}
