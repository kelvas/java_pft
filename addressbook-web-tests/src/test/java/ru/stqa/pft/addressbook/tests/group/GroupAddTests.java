package ru.stqa.pft.addressbook.tests.group;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDate;
import ru.stqa.pft.addressbook.tests.TestBase;

public class GroupAddTests extends TestBase {

  @Test
  public void testGroupAdd() {
    app.getNavigationHelper().gotoGroupPage();        // перейти на страницу списка групп
    app.getGroupHelper().initGroupCreation();    // инициализировать создание новой группы
    app.getGroupHelper().fillGroupForm(new GroupDate("test1", null, null)); // заполнить форму разными данными
    app.getGroupHelper().submitGroupCreation();  // подтвердить создание группы
    app.getNavigationHelper().returnToGroupPage();    // вернуться на страницу со списком групп
  }
}
