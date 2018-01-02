package ru.stqa.pft.addressbook.tests.contact;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactDate;
import ru.stqa.pft.addressbook.tests.TestBase;

public class ContactEditTests extends TestBase {

  @Test
  public void testContactEdit() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContactEdit();
    app.getContactHelper().fillContactForm(new ContactDate("test_name1", "test_surname1"));
    app.getContactHelper().updateContactModification();
    app.getContactHelper().returnToHomePage();
  }

}
