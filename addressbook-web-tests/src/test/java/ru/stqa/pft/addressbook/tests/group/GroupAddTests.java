package ru.stqa.pft.addressbook.tests.group;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDate;
import ru.stqa.pft.addressbook.tests.TestBase;

public class GroupAddTests extends TestBase {

  @Test
  public void testGroupAdd() {
    app.getNavigationHelper().gotoGroupPage();        // перейти на страницу списка групп
    app.getGroupHelper().creatGroup(new GroupDate("test1", null, null)); // создать группу
 }
}
