package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;


public class HelperBase {
  private boolean acceptNextAlert = true;

  protected WebDriver driver;

  public HelperBase(WebDriver driver) {
    this.driver = driver;
  }

  protected void click(By locator) {
    driver.findElement(locator).click();
  }

  protected void type(By locator, String text) {
    click(locator);
    if (text != null) {
      // получаем значение поля ввода
      String existingText = driver.findElement(locator).getAttribute("value");
      // если не верно что текст совпадает с существующим текстом
      if (! text.equals(existingText)) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
      }
    }
  }


  // Если при помощи инструмента selenium попытаетесь найти не существующий элемент
  // то будет выбрашено то же исключение
  // Механизм - сообщить о том, что при выполнениие метода возникла какая то проблема
  // Мы будем часто предотвращать возникновение проблем с помощью if и предварительные
  // проверки условий else - профилактика а иногда приходиться перехватывать исключение
  public boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  // проверка вызова диалогового окна которое иногда возникает на странице веб приложений
  // библиотека selenium не предлогаит ни какого способа проверить наличие или отсутствия
  // этого диалогового окна. Эдинственное что можно сделать это попытаться переключиться
  // на это окно. Если оно есть то мы успешно на него переключимся но если его нет при
  // попытке переключения возникает исключение NoAlertPresentException и поэтому мы вынуждены и
  // мы вынуждены только устранять последствия
  //
  // Попытались переключиться - хорошо
  // Не получилось - перехватываем исключение и тоже все хорошо
  // Это аварийное прерывание не будет распространяться дальше
  // и те функции которые обращаются к методу isAlertPresent()
  // в место прерывания и исключения получат нормальные значения
  // true или false
  private boolean isAlertPresent() {
    try { //попытаться
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) { // catch  - Поймать, перехватить
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
