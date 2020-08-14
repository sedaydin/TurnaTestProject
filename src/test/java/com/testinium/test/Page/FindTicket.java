package com.testinium.test.Page;

import com.testinium.test.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static com.testinium.test.Constants.IndexConstants.*;

public class FindTicket extends BasePage {
    public FindTicket(WebDriver driver) {
        super (driver);
    }
     public FindTicket choose(String company) throws InterruptedException {


         new Actions(driver)
                 .moveToElement(findElement(By.id("airline-" + company)))
                 .moveToElement(findElement(By.cssSelector("#airline-" + company + " a.filter-only")))
                 .click()
                 .build()
                 .perform();


         TimeUnit.SECONDS.sleep (2);
        return new FindTicket (driver);
     }
    public FindTicket chooseTicket() throws InterruptedException {

        click(ticketFrom);

        TimeUnit.SECONDS.sleep (2);

        return new FindTicket(driver);
    }

    public FindTicket chooseTicketTo() throws InterruptedException {

        click(to);



        return new FindTicket(driver);
    }

    public FindTicket search() {

        click(search);

        return new FindTicket(driver);
    }
}
