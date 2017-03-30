/**
 * @author Gladson Antony
 * @date 27-Mar-2017
 */
package tests;

import org.testng.annotations.Test;

import pageObjects.initializePageObjects.PageFactoryInitializer;
import propertyFilesReader.ApplicationConfigReader;

public class LoginPageTests extends PageFactoryInitializer
{
	ApplicationConfigReader appData = new ApplicationConfigReader();
	
	public void LoginAsProjectMgr(String username, String Password) throws Exception
	{
		loginPage()
		.verifyLoginPage()
		.enterUsername(username)
		.enterPassword(Password)
		.clickSubmitButton();	
	}
	
	@Test
	public void Login_Positive() throws Exception
	{
		LoginAsProjectMgr(appData.getUsername_ProjectMgr(), appData.getPasword_ProjectMgr());
		designCenterDashboardPage()
		.verifySuccessLogin();
	}

}
