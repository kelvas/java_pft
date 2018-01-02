package ru.stqa.pft.addressbook.model;

public class ContactDate {
  private final String firstname;
  private final String secondname;

  public ContactDate(String firstname, String secondname) {
    this.firstname = firstname;
    this.secondname = secondname;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getSecondname() {
    return secondname;
  }

}
