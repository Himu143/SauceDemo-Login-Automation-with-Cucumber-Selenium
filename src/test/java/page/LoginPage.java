package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(name = "user-name")
    WebElement fieldUserName;
    @FindBy(name = "password")
    WebElement fieldPass;

    @FindBy(name = "login-button")
    WebElement BtnLogin;
@FindBy(className = "title")
    WebElement lvlTitle;
    @FindBy(tagName = "h3")
    public WebElement lvlError;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doLogin(String username, String password){
        fieldUserName.sendKeys(username);
        fieldPass.sendKeys(password);
        BtnLogin.click();
    }
    public void errorTitle(){
        Assert.assertEquals(lvlError.getText(),"Epic sadface: Username and password do not match any user in this service");
    }
    public void assertTitle(){
        Assert.assertEquals(lvlTitle.getText(),"Products");
    }

}
