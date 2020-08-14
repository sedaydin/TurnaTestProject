package com.testinium.test.Page;

import com.testinium.test.Base.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static com.testinium.test.Constants.IndexConstants.*;


public class IndexPage extends BasePage {


    public IndexPage(WebDriver driver) {
        super (driver);
    }

    public IndexPage clicks() throws InterruptedException {

        click (click1);
        click (click2);
        click (clickCssButton);
         click (clickCheckbox);

        TimeUnit.SECONDS.sleep (2);
        return new IndexPage (driver);
    }
    public IndexPage selectCity(String name, String name2) throws InterruptedException {
        sendKeys (selectCity1,name);
        TimeUnit.SECONDS.sleep (2);
        click (clickCity1);
        TimeUnit.SECONDS.sleep (2);
        sendKeys (selectCity2,name2);
        TimeUnit.SECONDS.sleep (2);
        click (clickCssCity2);
        TimeUnit.SECONDS.sleep (2);
        return  new IndexPage (driver);

    }

    public  IndexPage selectDate()  {
        click (clickCssDate);
        click (clickCssDate2);
        click (clickCssDate3);
        click (clickCssDate4);
        click (clickDateButtonSeaerch);
        return  new IndexPage (driver);
    }

    public IndexPage pageBuy(){

        return new IndexPage (driver);
    }
}
