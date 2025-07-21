package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BtlBYPage extends BasePage{

    @FindBy(xpath="//*[@id=\"ctl00_Topmneu_Insurance\"]/ul/li[1]/a")
    WebElement DMCal;
    @FindBy(xpath="//*[@id=\"mainContent\"]/div[1]/div[2]/span/div[2]/p[3]/a")
    WebElement Cal;
    @FindBy(xpath="//*[@id=\"ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_rdb_employeType_2_lbl\"]")
    WebElement By;
    @FindBy(xpath="//*[@id=\"ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_rdb_Gender_0_lbl\"]")
    WebElement Male;
    @FindBy(xpath="//*[@id=\"ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_DynDatePicker_BirthDate_Date\"]")
    WebElement Date;
    @FindBy(xpath="//*[@id=\"ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_rdb_GetNechut_1_lbl\"]")
    WebElement No;
    @FindBy(xpath="//*[@id=\"ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_StepNavigationTemplateContainerID_StepNextButton\"]")
    WebElement Con;

    public BtlBYPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnDM()
    {
        DMCal.click();
    }
    public void clickOnCal()
    {
        Cal.click();
    }
    public void clickOnMale()
    {
        Male.click();
    }
    public void clickOnby()
    {
        By.click();
    }
    public void clickOnNo()
    {
        No.click();
    }
    public void clickOnCon()
    {
        Con.click();
    }
    public void enterValue()
    {
        Date.sendKeys("1/11/2006");
        Date.sendKeys(Keys.ENTER);
    }


}
