package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();

  @BeforeMethod // Метод инициализации фикстуры
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod(alwaysRun = true)  // Метод завершения фикстуры
  public void tearDown() throws Exception {
    app.stop();
  }
}
