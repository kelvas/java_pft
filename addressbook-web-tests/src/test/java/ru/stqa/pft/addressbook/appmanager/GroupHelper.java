package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupDate;

public class GroupHelper extends HelperBase {

  public GroupHelper(WebDriver driver) {
    super(driver);  // обращение к конструктору базового класса
  }

  public void fillGroupForm(GroupDate groupDate) {
    type(By.name("group_name"), groupDate.getName());
    type(By.name("group_header"), groupDate.getHeader());
    type(By.name("group_footer"), groupDate.getFooter());
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void deleteSelectedGroups() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }

  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void updateGroupModification() {
    click(By.name("update"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  // возврат на страницу групп
  public void returnToGroupPage() {
    click(By.linkText("group page"));
  }

  // метод создать группу
  public void creatGroup(GroupDate group) {
    initGroupCreation();    // инициализировать создание новой группы
    fillGroupForm(group); // заполнить форму разными данными
    submitGroupCreation();  // подтвердить создание группы
    returnToGroupPage();    // вернуться на страницу со списком групп
  }

  // проверка наличие какогото элемента
  public boolean isTheraAGroup() {
    return isElementPresent(By.name("selected[]"));
  }
}
