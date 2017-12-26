package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupDellTests extends TestBase {

  @Test
  public void testGroupDell() throws Exception {
    gotoGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }
}
