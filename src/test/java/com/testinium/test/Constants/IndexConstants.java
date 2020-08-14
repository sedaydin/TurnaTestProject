package com.testinium.test.Constants;

import org.openqa.selenium.By;
public class IndexConstants {

    public static final By  click1= By.id("lb-way");
    public static final By  click2= By.id("reSearchPassenger");
    public static final By clickCssButton= By.cssSelector ("button[data-dir='up']");
    public static final By clickCheckbox= By.className ("checkbox-icon");
    public static final By select1= By.className ("clickCssButton");
    public static final By clickDirect= By.xpath ("//*[@class='options transfer']/label/input");


    public static final By selectCity1=By.cssSelector ("input[name='flight_origin']");
    public static final By clickCity1=By.xpath ("//*[@id='ui-id-1']/li");
    public static final By selectCity2=By.cssSelector ("input[name='flight_destination']");
    public static final By clickCssCity2=By.cssSelector ("ul[id='ui-id-2']>li");

    public static final By clickCssDate=By.cssSelector ("div[class='panel-right']>div");
    public static final By clickCssDate2=By.cssSelector ("td[data-month='8']>a");
    public static final By clickCssDate3=By.cssSelector ("div[class='panel-right']>div[class='search-form-item calendar return  datepicker-wrapper dtp-wrap-to']");
    public static final By clickCssDate4=By.cssSelector ("td[data-month='9']>a");
    public static final By  clickDateButtonSeaerch= By.id("btnSearch");

    public static final By ticketFrom = By.cssSelector(".div-search-list-items > .rt-domestic:nth-child(2) .rt-domestic-item:nth-child(2) input[type=\"button\"]");
    public static final By to = By.cssSelector(".div-search-list-items > .rt-domestic:nth-child(3) .rt-domestic-item:nth-child(2) input[type=\"button\"]");
    public static final By search = By.className("bt-choose");

    public static final By name = By.xpath ("//*[@class='mandatory alpha firstname invalid']");
    public static final By surname = By.xpath ("//*[@class='mandatory alpha lastname']");
    public static final By birthDay = By.className("day-of-birth");
    public static final By birthOfMoth = By.className("month-of-birth");
    public static final By birthOfYear = By.className("year-of-birth");
    public static final By nationality = By.id("passenger-nationality");
    public static final By citizenno = By.cssSelector ("input[class='citizenno ']");
    public static final By hesCode = By.cssSelector ("input[class='hesCode']");
    public static final By mail = By.id("txtEmail");
    public static final By phone = By.id("txtPhone");
    public static final By buy = By.cssSelector ("button[class='btn-lg btn-payment pull-right to-booking']");
}
