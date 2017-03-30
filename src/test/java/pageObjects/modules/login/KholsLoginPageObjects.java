/**
 * @author Gladson Antony
 * @date 27-Mar-2017
 */
package pageObjects.modules.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import ru.yandex.qatools.allure.annotations.Step;
import utils.FluentWaiting;

public class KholsLoginPageObjects 
{

    @FindBy(css = "a[href='passwordreset.do']")
    @CacheLookup
    private WebElement forgot_your_password;

    @FindBy(id = "pswd")
    @CacheLookup
    private WebElement passwordLocator;

    @FindBy(id = "formsubmit")
    @CacheLookup
    private WebElement submit;

    @FindBy(id = "user_id")
    @CacheLookup
    private WebElement user_id;


    @Step("Verify the Login Page Objects")
	public KholsLoginPageObjects verifyLoginPage() 
	{
		FluentWaiting.waitUntillElementToBeVisible(500, 10, user_id);
		Assert.assertTrue(user_id.isDisplayed(), "Username Field is not being displayed");
		Assert.assertTrue(passwordLocator.isDisplayed(), "Password Field is not being displayed");
		Assert.assertTrue(submit.isDisplayed(), "Submit Button is not being displated");
		return this;
	}

    @Step("enter username: {0} ")
	public KholsLoginPageObjects enterUsername(String username) 
	{
    	user_id.sendKeys(username);
		return this;
	}

    @Step("enter password: {0} ")
	public KholsLoginPageObjects enterPassword(String password) 
    {
    	passwordLocator.sendKeys(password);
    	return this;
	}
    
    @Step("click on Forgot Password")
    public KholsLoginPageObjects clickForgotYourPasswordLink() 
    {
        forgot_your_password.click();
        return this;
    }

    @Step("Click on Submit Button")
    public KholsLoginPageObjects clickSubmitButton()
    {
        submit.click();
        return this;
    }


}
