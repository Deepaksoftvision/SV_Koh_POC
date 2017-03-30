/**
 * @Author Gladson Antony
 * @Date Mar 27, 2017
 */
package tests;

import org.testng.annotations.Test;

import controllers.ExcelDataProvider;
import pageObjects.initializePageObjects.PageFactoryInitializer;
import utils.DateAndTime;

public class TechSpecPageTests extends PageFactoryInitializer
{
	LoginPageTests login = new LoginPageTests();
	
	@Test(dataProvider="excelSheetNameAsMethodName", dataProviderClass=ExcelDataProvider.class)
	public void createTechSpec_Positive(String testCaseID, String styleNo, String fiscalSeason, String developmentSeason, String commodity,
			String brand, String customer, String business, String fashionPyramid, String inDCDate, String productManger, String sizeRange)
					throws Exception
	{
		login.Login_Positive();
		designCenterDashboardPage()
		.clickOnTechSpec()
		.techSpecHomePage()
		.clickOnCreateTechSpech()
		.techSpecCreatePage()
		.verifyCreateTechSpecPage()
		.enterStyleNo(styleNo)
		.enterFiscalSeason(fiscalSeason)
		.enterDevelopmentSeason(developmentSeason)
		.enterCommodity(commodity)
		.enterBrand(brand)
		.enterCustomer(customer)
		.enterBusiness(business)
		.enterFashionPyramid(fashionPyramid)
		.enterInDCDate(DateAndTime.getDate_InUSFormat())
		.enterProductManger(productManger)
		.enterSizeRange(sizeRange);
		Thread.sleep(10000);
	}

}
