package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDate;

public class GroupAddTests extends TestBase {

  @Test
  public void testGroupAdd() {
    app.gotoGroupPage();        // перейти на страницу списка групп
    app.initGroupCreation();    // инициализировать создание новой группы
    app.fillGroupForm(new GroupDate("test1", "test2", "test3")); // заполнить форму разными данными
    app.submitGroupCreation();  // подтвердить создание группы
    app.returnToGroupPage();    // вернуться на страницу со списком групп
  }
}
