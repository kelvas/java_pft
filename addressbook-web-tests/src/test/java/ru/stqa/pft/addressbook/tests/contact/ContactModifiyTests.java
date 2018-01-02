package ru.stqa.pft.addressbook.tests.contact;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactDate;
import ru.stqa.pft.addressbook.tests.TestBase;

public class ContactModifiyTests extends TestBase {

  @Test
  public void testContactModifiyAdd() {
    // зашли на дом стр
    app.getNavigationHelper().gotoHomePage();
    // кликнули на просмотр деталей (человечек)
    app.getContactHelper().detailsContacn();
    // кликнули на изменение
    app.getContactHelper().modifyContact();
    // заполнили поля
    app.getContactHelper().fillContactForm(new ContactDate("test_name1", "test_surname1"));
    // подтвердили изменения
    app.getContactHelper().updateContactModification();
    // вернулись на дом стр
    app.getNavigationHelper().returnToHomePage();
  }

}
