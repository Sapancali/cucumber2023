package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {
    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id="L2AGLb")
    public WebElement cerezOnayi;


    @FindBy (name = "q")
    public WebElement googleSearchBox;
}
