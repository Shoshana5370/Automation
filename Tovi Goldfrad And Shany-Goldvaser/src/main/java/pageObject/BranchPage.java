package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class BranchPage extends BtlBasePage{

    @FindBy(xpath="(//*[@class='SnifName'])[1]")
    WebElement branches;

    public BranchPage(WebDriver driver) {
        super(driver);
    }

    public void click_on_branch()
    {
     branches.click();
    }

    public List<String> searchText()
    {
        return driver.findElements(By.xpath("//div/label")).stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
}
