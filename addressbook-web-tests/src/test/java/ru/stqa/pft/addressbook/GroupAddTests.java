package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupAddTests extends TestBase {

  @Test
  public void testGroupAdd() {
    gotoGroupPage();        // перейти на страницу списка групп
    initGroupCreation();    // инициализировать создание новой группы
    fillGroupForm(new GroupDate("test1", "test2", "test3")); // заполнить форму разными данными
    submitGroupCreation();  // подтвердить создание группы
    returnToGroupPage();    // вернуться на страницу со списком групп
  }
}
