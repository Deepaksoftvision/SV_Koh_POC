/**
 * @Author Gladson Antony
 * @Date Mar 27, 2017
 */
package pageObjects.modules.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import pageObjects.initializePageObjects.PageFactoryInitializer;
import ru.yandex.qatools.allure.annotations.Step;
import utils.FluentWaiting;

public class DesignCenterpageObjects extends PageFactoryInitializer
{
	@FindBy(xpath="//div[contains(text(),'DESIGN CENTER')]")
	private WebElement designCenterLocator;
	
	@FindBy(xpath="//ul[@class='ts-inline-list']/descendant::a[@class='drop-dwn-ctrl']")
	private WebElement userNameLocator;
	
	@FindBy(xpath="//a[@class='clsDashAnchor' and contains(text(),'Tech Spec')]")
	private WebElement techSpecLocator;
	
	@Step("Verify Login Success")
	public DesignCenterpageObjects verifySuccessLogin() throws Exception
	{
		FluentWaiting.waitUntillElementToBeVisible(30, 500, userNameLocator);
		Assert.assertTrue(userNameLocator.isDisplayed());
		return this;
	}
	
	@Step("Click on Tech Spec")
	public DesignCenterpageObjects clickOnTechSpec() throws Exception
	{
		FluentWaiting.waitUntillElementToBeVisible(30, 500, techSpecLocator);
		techSpecLocator.click();
		return this;
	}

}
