package ru.stqa.pft.addressbook.tests.contact;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactDate;
import ru.stqa.pft.addressbook.tests.TestBase;

public class ContactAddTests extends TestBase {

  @Test
  public void testContactAdd() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactDate("test_name", "test_surname", "test1"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }
}
