package pageObject;

import enums.TopMenuEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BtlBasePage extends BasePage{

    @FindBy(id="TopQuestions")
    WebElement search;

    @FindBy(id="ctl00_Topmneu_BranchesHyperLink")
    WebElement branch;

    public BtlBasePage(WebDriver driver) {
        super(driver);
    }

    public void navigate(TopMenuEnum mainNavigate)
    {
        driver.findElement(By.linkText (mainNavigate.getTopMenuEnum())).click();
    }

    public void navigateSub(String sub)
    {
        driver.findElement(By.linkText(sub)).click();
    }

    public void enterAndSearch(String s)
    {
        search.sendKeys(s);
        search.sendKeys(Keys.ENTER);
    }

    public BranchPage clickBranch()
    {
        branch.click();
        return new BranchPage(super.driver);
    }
}
