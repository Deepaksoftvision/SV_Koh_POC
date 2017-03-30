/**
 * @Author Gladson Antony
 * @Date Mar 27, 2017
 */
package pageObjects.modules.techSpec;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import pageObjects.initializePageObjects.PageFactoryInitializer;
import ru.yandex.qatools.allure.annotations.Step;
import utils.FluentWaiting;

public class TechSpec_CreatePageObjects extends PageFactoryInitializer 
{	
	@FindBy(xpath="//div[@id='Tabs']/descendant::label[contains(text(),'Overview')]")
	private WebElement tabs_Overview;
	
	@FindBy(xpath="//div[@id='Tabs']/descendant::label[contains(text(),'BOM')]")
	private WebElement tabs_BOM;
	
	@FindBy(xpath="//div[@id='Tabs']/descendant::label[contains(text(),'Instructions')]")
	private WebElement tabs_Instructions;
	
	@FindBy(xpath="//div[@id='Tabs']/descendant::label[contains(text(),'Samples')]")
	private WebElement tabs_Samples;
	
	@FindBy(xpath="//div[@id='Tabs']/descendant::label[contains(text(),'Attachments')]")
	private WebElement tabs_Attachments;
	
	@FindBy(xpath="//div[@id='Tabs']/descendant::label[contains(text(),'Design')]")
	private WebElement tabs_DesignIntent;
	
	@FindBy(xpath="//div[@id='Tabs']/descendant::label[contains(text(),'Constructions')]")
	private WebElement tabs_Constructions;
	
	@FindBy(xpath="//div[@id='Tabs']/descendant::label[contains(text(),'Standards')]")
	private WebElement tabs_Standards;
	
	@FindBy(xpath="//div[@id='Tabs']/descendant::label[contains(text(),'POM')]")
	private WebElement tabs_POM;
	
	@FindBy(xpath="//div[@id='Tabs']/descendant::label[contains(text(),'Change Tracking')]")
	private WebElement tabs_ChangeTracking;
	
	@FindBy(xpath="//label[contains(text(),'Style No')]/following-sibling::input")
	private WebElement styleNoLocator;
	
	@FindBy(xpath="//label[contains(text(),'Style Description')]/following-sibling::input")
	private WebElement styleDescriptionLocator;
	
	@FindBy(xpath="//label[contains(text(),'Fiscal Season')]/following-sibling::input")
	private WebElement fiscalSeasonLocator;
	
	@FindBy(xpath="//label[contains(text(),'Development Season')]/following-sibling::input")
	private WebElement developmentSeasonLocator;
	
	@FindBy(xpath="//label[contains(text(),'Commodity')]/following-sibling::input[1]")
	private WebElement commodityLocator;
	
	@FindBy(xpath="//label[contains(text(),'Brand')]/following-sibling::input[1]")
	private WebElement brandLocator;
	
	@FindBy(xpath="//label[contains(text(),'Division')]/following-sibling::input[1]")
	private WebElement divisonLocator;
	
	@FindBy(xpath="//label[contains(text(),'Customer')]/following-sibling::input[1]")
	private WebElement customerLocator;
	
	@FindBy(xpath="//label[contains(text(),'Business')]/following-sibling::input[1]")
	private WebElement businessLocator;
	
	@FindBy(xpath="//label[contains(text(),'Size Indicator')]/following-sibling::input[1]")
	private WebElement sizeIndicatorLocator;
	
	@FindBy(xpath="//label[contains(text(),'Fashion Pyramid')]/following-sibling::input[1]")
	private WebElement fashionPyramidLocator;
	
	@FindBy(xpath="//label[contains(text(),'In DC Date')]/following-sibling::input[1]")
	private WebElement inDCDateLocator;
	
	@FindBy(xpath="//b[contains(text(),'Actors')]/following::label[text()='Product Manager']/following-sibling::input[1]")
	private WebElement productManagerLocator;
	
	@FindBy(xpath="(//label[contains(text(),'Size Range')])[2]/following::input[contains(@style,'background')][1]")
	private WebElement sizeRangeLocator;
	
	@Step("Verify Create Tech Spec Page Objects")
	public TechSpec_CreatePageObjects verifyCreateTechSpecPage() throws Exception
	{
		FluentWaiting.waitUntillElementToBeVisible(30, 500, tabs_Overview);
		Assert.assertTrue(tabs_Overview.isDisplayed(), "Overview Tab is not Displayed");
		Assert.assertTrue(tabs_BOM.isDisplayed(), "BOM Tab is not Displayed");
		return this;
	}

	public TechSpec_CreatePageObjects enterStyleNo(String styleNo) 
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, styleNoLocator);
		styleNoLocator.sendKeys(styleNo);
		return this;
	}

	public TechSpec_CreatePageObjects enterFiscalSeason(String fiscalSeason) 
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, fiscalSeasonLocator);
		fiscalSeasonLocator.sendKeys(fiscalSeason);
		return this;
	}

	public TechSpec_CreatePageObjects enterDevelopmentSeason(String developmentSeason) 
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, developmentSeasonLocator);
		developmentSeasonLocator.sendKeys(developmentSeason);
		return this;
	}

	public TechSpec_CreatePageObjects enterCommodity(String commodity) 
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, commodityLocator);
		commodityLocator.sendKeys(commodity);
		return this;
	}

	public TechSpec_CreatePageObjects enterBrand(String brand) 
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, brandLocator);
		brandLocator.sendKeys(brand);
		return this;
	}

	public TechSpec_CreatePageObjects enterCustomer(String customer) 
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, customerLocator);
		customerLocator.sendKeys(customer);
		return this;
	}

	public TechSpec_CreatePageObjects enterBusiness(String business) 
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, businessLocator);
		businessLocator.sendKeys(business);
		return this;
	}

	public TechSpec_CreatePageObjects enterFashionPyramid(String fashionPyramid) 
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, fashionPyramidLocator);
		fashionPyramidLocator.sendKeys(fashionPyramid);
		return this;
	}

	public TechSpec_CreatePageObjects enterInDCDate(String inDCDate) 
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, inDCDateLocator);
		inDCDateLocator.sendKeys(inDCDate);
		return this;
	}

	public TechSpec_CreatePageObjects enterProductManger(String productManger)
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, productManagerLocator);
		productManagerLocator.sendKeys(productManger);
		return this;
	}

	public TechSpec_CreatePageObjects enterSizeRange(String sizeRange) 
	{
		FluentWaiting.waitUntillElementToBeClickable(30, 500, sizeRangeLocator);
		sizeRangeLocator.sendKeys(sizeRange);
		return this;
	}
	
	
}
