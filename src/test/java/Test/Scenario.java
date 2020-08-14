package Test;

import com.testinium.test.Base.BaseTest;
import com.testinium.test.Model.PaymentInformation;
import com.testinium.test.Page.IndexPage;
import org.junit.Test;

public class Scenario extends BaseTest {
    @Test
    public void scenario() throws InterruptedException {
        new IndexPage (driver)
                .index ()
                .clicks ()
                .selectCity ("İstanbul", "Ankara")
                .selectDate()
                .findTicket ()
                .choose ("TK")
                .chooseTicket ()
                .chooseTicketTo ()
                .search ()
                .buy ().
                buyToTicket (getPaymentInformation())
                .buyToTicket (getPaymentInformation2())
                .buy ();
    }

    public PaymentInformation getPaymentInformation() {
        PaymentInformation UserInformation = new PaymentInformation();
        UserInformation.Name = "Seda";
        UserInformation.Surname = "Aydın";
        UserInformation.Gender = PaymentInformation.Female;
        UserInformation.BirthDay = "19";
        UserInformation.BirthMonth = "12";
        UserInformation.BirthYear = "1994";
        UserInformation.Nationality = "TR";
        UserInformation.CitizenNo = "132567890802";
        UserInformation.NumberPhone = "0552912654";
        UserInformation.HesNo = "2202FM2020";
        UserInformation.Email = "seda.aydin@testinium.com";
        UserInformation.ShouldInsurance = false;
        return UserInformation;
     }
    public PaymentInformation getPaymentInformation2() {
        PaymentInformation UserInformation = new PaymentInformation();
        UserInformation.Name = "Meral";
        UserInformation.Surname = "Aydın";
        UserInformation.Gender = PaymentInformation.Female;
        UserInformation.BirthDay = "12";
        UserInformation.BirthMonth = "11";
        UserInformation.BirthYear = "1964";
        UserInformation.Nationality = "TR";
        UserInformation.CitizenNo = "132567890802";
        UserInformation.NumberPhone = "0552912654";
        UserInformation.HesNo = "2202FM2020";
        UserInformation.Email = "meral.aydin@gmail.com";
        UserInformation.ShouldInsurance = false;
        return UserInformation;
    }
}