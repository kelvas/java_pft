package ru.stqa.pft.addressbook.tests.group;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDate;
import ru.stqa.pft.addressbook.tests.TestBase;

public class GroupDellTests extends TestBase {

  @Test
  public void testGroupDell() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    // если не существует ни одной групп
    // то нужно ее создать
    if (! app.getGroupHelper().isTheraAGroup()) {
      app.getGroupHelper().creatGroup(new GroupDate("test1", null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }
}
