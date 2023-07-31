// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class DefaultSuiteTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void 1DynamicID() {
    // Test name: 1. Dynamic ID
    // Step # | name | target | value
    // 1 | open | http://uitestingplayground.com/ | 
    driver.get("http://uitestingplayground.com/");
    // 2 | setWindowSize | 1068x1030 | 
    driver.manage().window().setSize(new Dimension(1068, 1030));
    // 3 | click | linkText=Dynamic ID | 
    driver.findElement(By.linkText("Dynamic ID")).click();
    // 4 | click | xpath=//div/button | 
    driver.findElement(By.xpath("//div/button")).click();
    // 5 | assertElementPresent | xpath=//div/button | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div/button"));
      assert(elements.size() > 0);
    }
    // 6 | verifyElementPresent | xpath=//div/button | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div/button"));
      assert(elements.size() > 0);
    }
    // 7 | verifyText | xpath=//button[contains(.,'Button with Dynamic ID')] | Button with Dynamic ID
    assertThat(driver.findElement(By.xpath("//button[contains(.,\'Button with Dynamic ID\')]")).getText(), is("Button with Dynamic ID"));
  }
  @Test
  public void 2ClassAttribute() {
    // Test name: 2. Class Attribute
    // Step # | name | target | value
    // 1 | open | http://uitestingplayground.com/ | 
    driver.get("http://uitestingplayground.com/");
    // 2 | setWindowSize | 1068x1030 | 
    driver.manage().window().setSize(new Dimension(1068, 1030));
    // 3 | click | linkText=Class Attribute | 
    driver.findElement(By.linkText("Class Attribute")).click();
    // 4 | click | css=.class1 | 
    driver.findElement(By.cssSelector(".class1")).click();
    // 5 | assertAlert | Primary button pressed | 
    assertThat(driver.switchTo().alert().getText(), is("Primary button pressed"));
    // 7 | click | css=.class3 | 
    driver.findElement(By.cssSelector(".class3")).click();
    // 8 | verifyText | css=.class3 | Button
    assertThat(driver.findElement(By.cssSelector(".class3")).getText(), is("Button"));
    // 9 | verifyElementPresent | css=.class2 | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".class2"));
      assert(elements.size() > 0);
    }
    // 10 | assertText | css=.class1 | Button
    assertThat(driver.findElement(By.cssSelector(".class1")).getText(), is("Button"));
  }
  @Test
  public void 3HiddenLayers() {
    // Test name: 3. Hidden Layers
    // Step # | name | target | value
    // 1 | open | http://uitestingplayground.com/ | 
    driver.get("http://uitestingplayground.com/");
    // 2 | setWindowSize | 1068x1030 | 
    driver.manage().window().setSize(new Dimension(1068, 1030));
    // 3 | click | linkText=Hidden Layers | 
    driver.findElement(By.linkText("Hidden Layers")).click();
    // 4 | click | id=greenButton | 
    driver.findElement(By.id("greenButton")).click();
    // 5 | click | id=blueButton | 
    driver.findElement(By.id("blueButton")).click();
    // 6 | doubleClick | id=blueButton | 
    {
      WebElement element = driver.findElement(By.id("blueButton"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    // 7 | click | id=blueButton | 
    driver.findElement(By.id("blueButton")).click();
    // 8 | click | id=blueButton | 
    driver.findElement(By.id("blueButton")).click();
    // 9 | doubleClick | id=blueButton | 
    {
      WebElement element = driver.findElement(By.id("blueButton"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    // 10 | click | id=blueButton | 
    driver.findElement(By.id("blueButton")).click();
  }
  @Test
  public void 4LoadDelay() {
    // Test name: 4. Load Delay
    // Step # | name | target | value
    // 1 | open | http://uitestingplayground.com/ | 
    driver.get("http://uitestingplayground.com/");
    // 2 | setWindowSize | 1068x1030 | 
    driver.manage().window().setSize(new Dimension(1068, 1030));
    // 3 | click | linkText=Load Delay | 
    driver.findElement(By.linkText("Load Delay")).click();
    // 4 | pause | 6000 | 
    try {
      Thread.sleep(6000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    // 5 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 6 | verifyElementPresent | css=.btn | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".btn"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void 5AJAXData() {
    // Test name: 5. AJAX Data
    // Step # | name | target | value
    // 1 | open | http://uitestingplayground.com/ | 
    driver.get("http://uitestingplayground.com/");
    // 2 | setWindowSize | 1068x1030 | 
    driver.manage().window().setSize(new Dimension(1068, 1030));
    // 3 | click | linkText=AJAX Data | 
    driver.findElement(By.linkText("AJAX Data")).click();
    // 4 | click | id=ajaxButton | 
    driver.findElement(By.id("ajaxButton")).click();
    // 5 | pause | 15000 | 
    try {
      Thread.sleep(15000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    // 6 | click | css=.bg-success | 
    driver.findElement(By.cssSelector(".bg-success")).click();
    // 7 | verifyText | css=.bg-success | Data loaded with AJAX get request.
    assertThat(driver.findElement(By.cssSelector(".bg-success")).getText(), is("Data loaded with AJAX get request."));
  }
  @Test
  public void 6ClientSideDelay() {
    // Test name: 6. Client Side Delay
    // Step # | name | target | value
    // 1 | open | http://uitestingplayground.com/ | 
    driver.get("http://uitestingplayground.com/");
    // 2 | setWindowSize | 1068x1030 | 
    driver.manage().window().setSize(new Dimension(1068, 1030));
    // 3 | click | linkText=Client Side Delay | 
    driver.findElement(By.linkText("Client Side Delay")).click();
    // 4 | click | id=ajaxButton | 
    driver.findElement(By.id("ajaxButton")).click();
    // 5 | pause | 15000 | 
    try {
      Thread.sleep(15000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    // 6 | assertText | css=.bg-success | Data calculated on the client side.
    assertThat(driver.findElement(By.cssSelector(".bg-success")).getText(), is("Data calculated on the client side."));
    // 7 | verifyText | css=.bg-success | Data calculated on the client side.
    assertThat(driver.findElement(By.cssSelector(".bg-success")).getText(), is("Data calculated on the client side."));
  }
  @Test
  public void 7Click() {
    // Test name: 7. Click
    // Step # | name | target | value
    // 1 | open | http://uitestingplayground.com/ | 
    driver.get("http://uitestingplayground.com/");
    // 2 | setWindowSize | 1068x1030 | 
    driver.manage().window().setSize(new Dimension(1068, 1030));
    // 3 | click | linkText=Click | 
    driver.findElement(By.linkText("Click")).click();
    // 4 | click | id=badButton | 
    driver.findElement(By.id("badButton")).click();
    // 5 | verifyElementPresent | id=badButton | 
    {
      List<WebElement> elements = driver.findElements(By.id("badButton"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void 8TextInput() {
    // Test name: 8. Text Input
    // Step # | name | target | value
    // 1 | open | http://uitestingplayground.com/ | 
    driver.get("http://uitestingplayground.com/");
    // 2 | setWindowSize | 1068x1030 | 
    driver.manage().window().setSize(new Dimension(1068, 1030));
    // 3 | click | linkText=Text Input | 
    driver.findElement(By.linkText("Text Input")).click();
    // 4 | click | id=newButtonName | 
    driver.findElement(By.id("newButtonName")).click();
    // 5 | type | id=newButtonName | Button 2
    driver.findElement(By.id("newButtonName")).sendKeys("Button 2");
    // 6 | click | id=updatingButton | 
    driver.findElement(By.id("updatingButton")).click();
    // 7 | click | css=html | 
    driver.findElement(By.cssSelector("html")).click();
    // 8 | type | id=newButtonName | Button 3
    driver.findElement(By.id("newButtonName")).sendKeys("Button 3");
    // 9 | click | id=updatingButton | 
    driver.findElement(By.id("updatingButton")).click();
    // 10 | click | css=html | 
    driver.findElement(By.cssSelector("html")).click();
    // 11 | type | id=newButtonName | Boton 6
    driver.findElement(By.id("newButtonName")).sendKeys("Boton 6");
    // 12 | click | id=updatingButton | 
    driver.findElement(By.id("updatingButton")).click();
  }
  @Test
  public void 9Scrollbars() {
    // Test name: 9. Scrollbars
    // Step # | name | target | value
    // 1 | open | http://uitestingplayground.com/ | 
    driver.get("http://uitestingplayground.com/");
    // 2 | setWindowSize | 1068x1030 | 
    driver.manage().window().setSize(new Dimension(1068, 1030));
    // 3 | click | linkText=Scrollbars | 
    driver.findElement(By.linkText("Scrollbars")).click();
    // 4 | mouseDownAt | css=div:nth-child(6) | 292,147.8125
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(6)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    // 5 | mouseMoveAt | css=div:nth-child(6) | 292,147.8125
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(6)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 6 | mouseUpAt | css=div:nth-child(6) | 292,147.8125
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(6)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    // 7 | mouseDownAt | css=div:nth-child(6) | 167,144.8125
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(6)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    // 8 | mouseMoveAt | css=div:nth-child(6) | 167,144.8125
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(6)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 9 | mouseUpAt | css=div:nth-child(6) | 167,144.8125
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(6)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    // 10 | click | id=hidingButton | 
    driver.findElement(By.id("hidingButton")).click();
    // 11 | mouseDownAt | css=div:nth-child(6) | 292,72.8125
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(6)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    // 12 | mouseMoveAt | css=div:nth-child(6) | 292,72.8125
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(6)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 13 | mouseUpAt | css=div:nth-child(6) | 292,72.8125
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(6)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    // 14 | click | id=hidingButton | 
    driver.findElement(By.id("hidingButton")).click();
  }
  @Test
  public void 10DynamicTable() {
    // Test name: 10. Dynamic Table
    // Step # | name | target | value
    // 1 | open | http://uitestingplayground.com/ | 
    driver.get("http://uitestingplayground.com/");
    // 2 | setWindowSize | 1068x1030 | 
    driver.manage().window().setSize(new Dimension(1068, 1030));
    // 3 | click | linkText=Dynamic Table | 
    driver.findElement(By.linkText("Dynamic Table")).click();
    // 4 | open | http://uitestingplayground.com/dynamictable | 
    driver.get("http://uitestingplayground.com/dynamictable");
    // 5 | open | http://uitestingplayground.com/dynamictable | 
    driver.get("http://uitestingplayground.com/dynamictable");
    // 6 | open | http://uitestingplayground.com/dynamictable | 
    driver.get("http://uitestingplayground.com/dynamictable");
    // 7 | open | http://uitestingplayground.com/dynamictable | 
    driver.get("http://uitestingplayground.com/dynamictable");
    // 8 | open | http://uitestingplayground.com/dynamictable | 
    driver.get("http://uitestingplayground.com/dynamictable");
    // 9 | open | http://uitestingplayground.com/dynamictable | 
    driver.get("http://uitestingplayground.com/dynamictable");
  }
  @Test
  public void 11VerifyText() {
    // Test name: 11. Verify Text
    // Step # | name | target | value
    // 1 | open | http://uitestingplayground.com/ | 
    driver.get("http://uitestingplayground.com/");
    // 2 | setWindowSize | 1068x1030 | 
    driver.manage().window().setSize(new Dimension(1068, 1030));
    // 3 | click | linkText=Verify Text | 
    driver.findElement(By.linkText("Verify Text")).click();
    // 4 | storeText | css=div:nth-child(3) .badge-secondary | UserName     
    vars.put("UserName     ", driver.findElement(By.cssSelector("div:nth-child(3) .badge-secondary")).getText());
    // 5 | storeText | css=.bg-warning > .badge-secondary | Name!
    vars.put("Name!", driver.findElement(By.cssSelector(".bg-warning > .badge-secondary")).getText());
    // 6 | storeText | css=.bg-primary > .badge-secondary | Welcome
    vars.put("Welcome", driver.findElement(By.cssSelector(".bg-primary > .badge-secondary")).getText());
  }
  @Test
  public void 12ProgressBar() {
    // Test name: 12. Progress Bar
    // Step # | name | target | value
    // 1 | open | http://uitestingplayground.com/ | 
    driver.get("http://uitestingplayground.com/");
    // 2 | setWindowSize | 1068x1030 | 
    driver.manage().window().setSize(new Dimension(1068, 1030));
    // 3 | click | linkText=Progress Bar | 
    driver.findElement(By.linkText("Progress Bar")).click();
    // 4 | click | id=startButton | 
    driver.findElement(By.id("startButton")).click();
    // 5 | pause | 10000 | 
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    // 6 | click | id=stopButton | 
    driver.findElement(By.id("stopButton")).click();
    // 7 | click | id=startButton | 
    driver.findElement(By.id("startButton")).click();
    // 8 | click | id=stopButton | 
    driver.findElement(By.id("stopButton")).click();
  }
  @Test
  public void 13Visibility() {
    // Test name: 13. Visibility
    // Step # | name | target | value
    // 1 | open | http://uitestingplayground.com/ | 
    driver.get("http://uitestingplayground.com/");
    // 2 | setWindowSize | 1068x1030 | 
    driver.manage().window().setSize(new Dimension(1068, 1030));
    // 3 | click | linkText=Visibility | 
    driver.findElement(By.linkText("Visibility")).click();
    // 4 | verifyElementPresent | id=offscreenButton | 
    {
      List<WebElement> elements = driver.findElements(By.id("offscreenButton"));
      assert(elements.size() > 0);
    }
    // 5 | verifyElementPresent | id=overlappedButton | 
    {
      List<WebElement> elements = driver.findElements(By.id("overlappedButton"));
      assert(elements.size() > 0);
    }
    // 6 | verifyElementPresent | id=notdisplayedButton | 
    {
      List<WebElement> elements = driver.findElements(By.id("notdisplayedButton"));
      assert(elements.size() > 0);
    }
    // 7 | verifyElementPresent | id=zeroWidthButton | 
    {
      List<WebElement> elements = driver.findElements(By.id("zeroWidthButton"));
      assert(elements.size() > 0);
    }
    // 8 | verifyElementPresent | id=invisibleButton | 
    {
      List<WebElement> elements = driver.findElements(By.id("invisibleButton"));
      assert(elements.size() > 0);
    }
    // 9 | verifyElementPresent | id=removedButton | 
    {
      List<WebElement> elements = driver.findElements(By.id("removedButton"));
      assert(elements.size() > 0);
    }
    // 10 | verifyElementPresent | id=transparentButton | 
    {
      List<WebElement> elements = driver.findElements(By.id("transparentButton"));
      assert(elements.size() > 0);
    }
    // 11 | verifyElementPresent | id=hideButton | 
    {
      List<WebElement> elements = driver.findElements(By.id("hideButton"));
      assert(elements.size() > 0);
    }
    // 12 | click | id=hideButton | 
    driver.findElement(By.id("hideButton")).click();
    // 13 | click | css=tr:nth-child(1) > td:nth-child(2) | 
    driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(2)")).click();
    // 14 | verifyElementPresent | css=tr:nth-child(1) > td:nth-child(2) | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("tr:nth-child(1) > td:nth-child(2)"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void 14SampleApp() {
    // Test name: 14. Sample App
    // Step # | name | target | value
    // 1 | open | http://uitestingplayground.com/ | 
    driver.get("http://uitestingplayground.com/");
    // 2 | setWindowSize | 1068x1030 | 
    driver.manage().window().setSize(new Dimension(1068, 1030));
    // 3 | click | linkText=Sample App | 
    driver.findElement(By.linkText("Sample App")).click();
    // 4 | click | xpath=//input | 
    driver.findElement(By.xpath("//input")).click();
    // 5 | type | xpath=//input | Usuario123
    driver.findElement(By.xpath("//input")).sendKeys("Usuario123");
    // 6 | click | xpath=//div[3]/div/input | 
    driver.findElement(By.xpath("//div[3]/div/input")).click();
    // 7 | type | xpath=//div[3]/div/input | pwd
    driver.findElement(By.xpath("//div[3]/div/input")).sendKeys("pwd");
    // 8 | click | id=login | 
    driver.findElement(By.id("login")).click();
    // 9 | click | id=login | 
    driver.findElement(By.id("login")).click();
    // 10 | close |  | 
    driver.close();
  }
  @Test
  public void 15MouseOver() {
    // Test name: 15. Mouse Over
    // Step # | name | target | value
    // 1 | open | http://uitestingplayground.com/ | 
    driver.get("http://uitestingplayground.com/");
    // 2 | setWindowSize | 1068x1030 | 
    driver.manage().window().setSize(new Dimension(1068, 1030));
    // 3 | click | linkText=Mouse Over | 
    driver.findElement(By.linkText("Mouse Over")).click();
    // 4 | mouseOver | linkText=Click me | 
    {
      WebElement element = driver.findElement(By.linkText("Click me"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 5 | click | linkText=Click me | 
    driver.findElement(By.linkText("Click me")).click();
    // 6 | doubleClick | linkText=Click me | 
    {
      WebElement element = driver.findElement(By.linkText("Click me"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    // 7 | doubleClick | linkText=Click me | 
    {
      WebElement element = driver.findElement(By.linkText("Click me"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    // 8 | click | linkText=Click me | 
    driver.findElement(By.linkText("Click me")).click();
  }
  @Test
  public void 16NonBreakingSpace() {
    // Test name: 16. Non-Breaking Space
    // Step # | name | target | value
    // 1 | open | http://uitestingplayground.com/ | 
    driver.get("http://uitestingplayground.com/");
    // 2 | setWindowSize | 1068x1030 | 
    driver.manage().window().setSize(new Dimension(1068, 1030));
    // 3 | click | linkText=Non-Breaking Space | 
    driver.findElement(By.linkText("Non-Breaking Space")).click();
    // 4 | click | xpath=(//button[@type='button'])[2] | 
    driver.findElement(By.xpath("(//button[@type=\'button\'])[2]")).click();
    // 5 | verifyElementPresent | css=.btn | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".btn"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void 17OverlappedElement() {
    // Test name: 17. Overlapped Element
    // Step # | name | target | value
    // 1 | open | http://uitestingplayground.com/ | 
    driver.get("http://uitestingplayground.com/");
    // 2 | setWindowSize | 1068x1030 | 
    driver.manage().window().setSize(new Dimension(1068, 1030));
    // 3 | click | linkText=Overlapped Element | 
    driver.findElement(By.linkText("Overlapped Element")).click();
    // 4 | click | id=id | 
    driver.findElement(By.id("id")).click();
    // 5 | mouseDownAt | xpath=//div/div/div | 929,103.8125
    {
      WebElement element = driver.findElement(By.xpath("//div/div/div"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    // 6 | mouseMoveAt | xpath=//div/div/div | 929,103.8125
    {
      WebElement element = driver.findElement(By.xpath("//div/div/div"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 7 | mouseUpAt | xpath=//div/div/div | 929,103.8125
    {
      WebElement element = driver.findElement(By.xpath("//div/div/div"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    // 8 | type | id=id | 1552210
    driver.findElement(By.id("id")).sendKeys("1552210");
    // 9 | click | id=name | 
    driver.findElement(By.id("name")).click();
    // 10 | type | id=name | Sogamoso
    driver.findElement(By.id("name")).sendKeys("Sogamoso");
    // 11 | click | css=div:nth-child(6) > div:nth-child(1) | 
    driver.findElement(By.cssSelector("div:nth-child(6) > div:nth-child(1)")).click();
  }
}
