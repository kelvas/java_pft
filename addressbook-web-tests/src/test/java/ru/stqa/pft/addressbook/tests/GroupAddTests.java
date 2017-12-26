package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDate;

public class GroupAddTests extends TestBase {

  @Test
  public void testGroupAdd() {
    app.getNavigationHelper().gotoGroupPage();        // перейти на страницу списка групп
    app.getGroupHelper().initGroupCreation();    // инициализировать создание новой группы
    app.getGroupHelper().fillGroupForm(new GroupDate("test1", "test2", "test3")); // заполнить форму разными данными
    app.getGroupHelper().submitGroupCreation();  // подтвердить создание группы
    app.getGroupHelper().returnToGroupPage();    // вернуться на страницу со списком групп
  }
}
