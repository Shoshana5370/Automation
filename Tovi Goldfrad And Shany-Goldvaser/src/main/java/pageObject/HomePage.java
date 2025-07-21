package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BtlBasePage{

    @FindBy(id="TopQuestions")
    WebElement search;
    @FindBy(id="ctl00_Topmneu_BranchesHyperLink")
    WebElement search2;

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
