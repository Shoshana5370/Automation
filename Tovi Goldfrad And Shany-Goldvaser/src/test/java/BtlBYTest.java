import enums.TopMenuEnum;
import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObject.BtlBYPage;
import pageObject.BtlBasePage;
import pageObject.ResultsSearchPage;

public class BtlBYTest extends BaseTest{

    @Test
    @Description("חישוב דמי ביטוח לאומי לבחור ישיבה")
    public void DMCalTest() throws InterruptedException {
        BtlBasePage basePage = new BtlBasePage(driver);
        basePage.navigate(TopMenuEnum.DM);
        BtlBYPage BY = new BtlBYPage(driver);
        BY.clickOnDM();
        ResultsSearchPage resultsSearchPage = new ResultsSearchPage(driver);
        String res = resultsSearchPage.equal_title("//*[@id=\"lbl_title\"]");
        Assertions.assertEquals("דמי ביטוח לאומי" ,res,"not success title") ;
        BY.clickOnCal();
        res = resultsSearchPage.equal_title("//*[@id=\"mainContent\"]/div[1]/h1");
        Assertions.assertEquals("חישוב דמי ביטוח עבור עצמאי, תלמיד, שוהה בחוץ לארץ ומי שלא עובד" ,res,"not success title2") ;
        BY.clickOnby();
        BY.clickOnMale();
        BY.enterValue();
        Thread.sleep(5000);
        res = resultsSearchPage.equal_title("//*[@id=\"header\"]");
        Assertions.assertTrue(res.contains("צעד שני"),"not success title3");
        BY.clickOnNo();
        BY.clickOnCon();
        Thread.sleep(5000);
        res = resultsSearchPage.equal_title("//*[@id=\"header\"]");
        Assertions.assertTrue(res.contains("סיום"),"not success title4");
        res = resultsSearchPage.equal_title("//*[@id=\"ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_div_Result\"]/ul/li[3]");
        Assertions.assertTrue(res.contains("163"),"not success title4"); ;

    }
    
}
