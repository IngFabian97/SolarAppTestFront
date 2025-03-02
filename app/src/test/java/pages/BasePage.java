package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Keys;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    private static Actions actions;

    static {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        driver = new FirefoxDriver(firefoxOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public BasePage() {
        // constructor implementation
    }

    public BasePage(WebDriver driver) {

    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    public void goToLinkText(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public static void closeBrowser() {
        driver.quit();
    }

    private WebElement customFind(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator) {
        customFind(locator).click();
    }

    public void write(String locator, String textToWrite) {
        customFind(locator).clear();
        customFind(locator).sendKeys(textToWrite);
    }

    public void sendKeysEnter(String locator) {
        customFind(locator).sendKeys(Keys.ENTER);
    }

    public void hoverOverElement(String locator) {
        actions.moveToElement(customFind(locator));
    }

    public void doubleClick(String locator) {
        actions.doubleClick(customFind(locator));
    }

    public void rightClick(String locatoString) {
        actions.contextClick(customFind(locatoString));
    }

    public String getValueFromTable(String locator, int row, int colum) {
        String cellINeed = locator + "/table/tbody/tr[" + row + "]/td[" + colum + "]";

        return customFind(cellINeed).getText();
    }

    public void setValueOnTable(String locator, int row, int colum, String stringToSend) {
        String cellToFill = locator + "/table/tbody/tr[" + row + "]/td[" + colum + "]";
        customFind(cellToFill).sendKeys(stringToSend);
    }

    public void switchToiFrame(int iFrameIndex) {
        driver.switchTo().frame(iFrameIndex);
    }

    public void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }

    public void dismissAlert() {
        try {
            driver.switchTo().alert().dismiss();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }
    }

    public String textFromElement(String locator) {
        return customFind(locator).getText();
    }

    public boolean elementIsDisplayed(String locator) {
        return customFind(locator).isDisplayed();
    }

    public boolean elementEnabled(String locator) {
        return customFind(locator).isEnabled();
    }

    public boolean elementIsSelected(String locator) {
        return customFind(locator).isSelected();
    }

    public List<WebElement> bringMeAllElements(String locator) {
        return driver.findElements(By.xpath(locator));
    }

    public int dropDownSize(String locator) {
        Select dropdown = new Select(customFind(locator));
        List<WebElement> dropDownOptions = dropdown.getOptions();
        return dropDownOptions.size();
    }

}
