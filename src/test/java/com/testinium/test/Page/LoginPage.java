package com.testinium.test.Page;

import com.testinium.test.Base.BasePage;
import com.testinium.test.Model.PaymentInformation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static com.testinium.test.Constants.IndexConstants.*;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super (driver);
    }


  public LoginPage buyToTicket(PaymentInformation UserInformation) throws InterruptedException {

          clickWithAction(By.id("lb-" + UserInformation.Gender));
          sendKeys(name, UserInformation.Name);
          TimeUnit.SECONDS.sleep (1);
          sendKeys(surname, UserInformation.Surname);
          selectOptionByValue(birthDay, UserInformation.BirthDay);
          selectOptionByValue(birthOfMoth, UserInformation.BirthMonth);
          selectOptionByValue(birthOfYear, UserInformation.BirthYear);
          selectOptionByValue(nationality, UserInformation.Nationality);
          sendKeys(citizenno, UserInformation.CitizenNo);
          sendKeys(hesCode, UserInformation.HesNo);
          sendKeys(mail, UserInformation.Email);
          sendKeys(phone, UserInformation.NumberPhone);
          return new LoginPage(driver);
      }

      public LoginPage buy() {
          click(buy);
          return new LoginPage(driver);
      }


 }

