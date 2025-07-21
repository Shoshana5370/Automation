package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsSearchPage extends BasePage{

    public ResultsSearchPage(WebDriver driver) {
        super(driver);
    }

    public String equal_title(String xpath){
       return driver.findElement( By.xpath(xpath)).getText();
    }
}
