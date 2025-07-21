import com.fasterxml.jackson.annotation.JsonTypeInfo;
import enums.TopMenuEnum;
import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject.BranchPage;
import pageObject.BtlBasePage;
import pageObject.ResultsSearchPage;

import java.util.List;

public class BtlTest extends baseTest {

    @Test
    @Description("מבצע חיפוש ובודק את תוצאתו")
    public  void search_and_check() throws InterruptedException {
       BtlBasePage btl=new BtlBasePage(driver);
       btl.enterAndSearch("חישוב סכום דמי לידה ליום");
       Thread.sleep(3000);
       ResultsSearchPage rsp = new ResultsSearchPage(driver);
       Assertions.assertEquals( "תוצאות חיפוש עבור חישוב סכום דמי לידה ליום",rsp.equal_title("//div[@id='results']/h2"),"failed");
    }

    @Test
    @Description("נכנס ל סניפים – בדקי שדף סניפים וערוצי שירות עלה")
    public  void enter_to_branch_and_check()  {
        BtlBasePage btlBasePage = new BtlBasePage(driver);
        btlBasePage.navigateSub("סניפים");
        BranchPage branchPage = btlBasePage.clickBranch();
        branchPage.click_on_branch();
        List<String> s = branchPage.searchText();
        System.out.println(s);
        Assertions.assertTrue(s.contains("כתובת"),"not fount address");
        Assertions.assertTrue(s.contains("קבלת קהל"),"not fount address");
        Assertions.assertTrue(s.contains("מענה טלפוני"),"not fount address");
    }

}
