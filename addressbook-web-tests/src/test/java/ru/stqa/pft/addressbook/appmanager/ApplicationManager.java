package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.fail;

public class ApplicationManager {
  private WebDriver driver;

  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private ContactHelper contactHelper;
  private StringBuffer verificationErrors = new StringBuffer();
  private String browser;


  // конструктор создания определенного вебдрайвера
  public ApplicationManager(String browser) {
    this.browser = browser;
  }

  public void init() throws Exception {
    switch (browser) {
      case BrowserType.FIREFOX:
        driver = new FirefoxDriver();
        break;
      case BrowserType.CHROME:
        driver = new ChromeDriver();
        break;
      case BrowserType.IE:
        driver = new InternetExplorerDriver();
        break;
    }
    driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    driver.get("http://localhost/addressbook/");
    groupHelper = new GroupHelper(driver);
    navigationHelper = new NavigationHelper(driver);
    contactHelper = new ContactHelper(driver);
    SessionHelper sessionHelper = new SessionHelper(driver);
    sessionHelper.login("admin", "secret");    // вход в систему с любым пользователем и паролем
  }

  public void stop() {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ContactHelper getContactHelper() { return contactHelper; }
}
