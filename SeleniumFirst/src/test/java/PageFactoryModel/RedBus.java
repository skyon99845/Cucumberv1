package PageFactoryModel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBus {
    WebDriver driver;

    public RedBus(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    String Homepage= "https://www.redbus.in/";

    @FindBy(xpath =" //input[@title=\"Search\"]")
    WebElement searchButton;

    public void visit()
    {
        driver.get(Homepage);
    }

    public String getTitle()
    {
        return driver.getTitle();
    }

    public void closeBrowser()
    {
        driver.quit();
    }


}
