/**
 * 
 */
package pageObjects.initializePageObjects;

import org.openqa.selenium.support.PageFactory;

import controllers.BaseMethod;
import pageObjects.modules.dashboard.DesignCenterpageObjects;
import pageObjects.modules.login.KholsLoginPageObjects;
import pageObjects.modules.techSpec.TechSpec_CreatePageObjects;
import pageObjects.modules.techSpec.TechSpec_HomePageObjects;

/**
 * @author ${Gladson Antony}
 * @date Sep 17, 2016
 * 
 */
public class PageFactoryInitializer extends BaseMethod
{
	public KholsLoginPageObjects loginPage()
	{
		return PageFactory.initElements(getWebDriver(), KholsLoginPageObjects.class);
	}
	
	public DesignCenterpageObjects designCenterDashboardPage()
	{
		return PageFactory.initElements(getWebDriver(), DesignCenterpageObjects.class);
	}
	
	public TechSpec_HomePageObjects techSpecHomePage()
	{
		return PageFactory.initElements(getWebDriver(), TechSpec_HomePageObjects.class);
	}
	
	public TechSpec_CreatePageObjects techSpecCreatePage()
	{
		return PageFactory.initElements(getWebDriver(), TechSpec_CreatePageObjects.class);
	}
}
