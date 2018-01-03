package ru.stqa.pft.addressbook.tests.contact;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactDate;
import ru.stqa.pft.addressbook.tests.TestBase;

public class ContactModifiyTests extends TestBase {

  @Test
  public void testContactModifiyAdd() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().initContactModify();
    app.getContactHelper().fillContactForm(new ContactDate("test_name1", "test_surname1", null));
    app.getContactHelper().submitContactModify();
    app.getContactHelper().returnToHomePage();
  }
}
