package com.testinium.test.Base;

import com.testinium.test.Page.FindTicket;
import com.testinium.test.Page.IndexPage;
import com.testinium.test.Page.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;



    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);

    }


    public IndexPage index() {
        driver.get ("https://www.turna.com/");
        return new IndexPage (driver);

    } public FindTicket findTicket() {

        return new FindTicket (driver);

    }
    public LoginPage buy() {

        return new LoginPage (driver);

    }



    public void select(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    public void actionsID(String id) {
        Actions actionss = new Actions (driver);
        actionss.moveToElement (driver.findElement (By.id (id)));


    }

        public WebElement findElement(By by) {
            untilElementAppear(by);
            return driver.findElement(by);
        }

        public List<WebElement> findElements(By by) {
            return driver.findElements(by);
        }




        public void click(By key) {

            driver.findElement(key).click();
        }

        public void sendKeys(By by, String key) {

            WebElement element = findElement(by);

            element.clear();
            element.sendKeys(key);

        }

        public void assertInput(By by, String expectedText) {
            WebElement element = findElement(by);
            Assert.assertEquals(element.getText(),expectedText);
        }

        public String getText(By by) {
            return findElement(by).getText();
        }

        public String getAttribute(By by, String name) {
            return findElement(by).getAttribute(name);
        }



        public void clickWithAction(By by) {
            Actions actions = new Actions(driver);

            actions
                    .moveToElement(findElement(by))
                    .click()
                    .build()
                    .perform();
        }

        public void hoverElements(By by) {
            Actions actions = new Actions(driver);
            actions.moveToElement(findElement(by)).build().perform();
        }
    public void selectOptionByValue(By by, String value) {
        Select select = new Select(findElement(by));
        select.selectByValue(value);
    }
    public boolean isElementDisplayed(By by) {
        return findElement(by).isDisplayed();
    }

    public void untilElementAppear(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void untilElementClickable(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public WebDriver getDriver() {
        return driver;
    }
}
