/**
 * @Author Gladson Antony
 * @Date Mar 27, 2017
 */
package pageObjects.modules.techSpec;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import pageObjects.initializePageObjects.PageFactoryInitializer;
import ru.yandex.qatools.allure.annotations.Step;

public class TechSpec_HomePageObjects extends PageFactoryInitializer
{
    @FindBy(id = "3_@100_@94_@0_@0_@0_@_srch_@desc")
    @CacheLookup
    private WebElement associateProductManager;

    @FindBy(id = "0_@100_@20_@0_@0_@0_@_srch_@desc")
    @CacheLookup
    private WebElement brand;

    @FindBy(id = "0_@100_@81_@0_@0_@0_@_srch")
    @CacheLookup
    private WebElement business;

    @FindBy(id = "0_@100_@157_@0_@0_@0_@_srch_@desc")
    @CacheLookup
    private WebElement buyProgram;

    @FindBy(id = "0_@100100_@4_@0_@0_@0_@_srch_@desc")
    @CacheLookup
    private WebElement categoryElements1;

    @FindBy(id = "0_@100100_@5_@0_@0_@0_@_srch_@desc")
    @CacheLookup
    private WebElement categoryElements2;

    @FindBy(id = "chgTrkWithin")
    @CacheLookup
    private WebElement changesSince;

    @FindBy(id = "3_@100_@121_@0_@0_@0_@_srch_@desc")
    @CacheLookup
    private WebElement classificationContact;

    @FindBy(css = "a[title='Color']")
    @CacheLookup
    private WebElement color;

    @FindBy(id = "0_@100_@24_@0_@0_@0_@_srch")
    @CacheLookup
    private WebElement commodity;

    @FindBy(css = "a[title='Competencies']")
    @CacheLookup
    private WebElement competencies;

    @FindBy(id = "0_@100_@139_@0_@0_@0_@_srch")
    @CacheLookup
    private WebElement customer;

    @FindBy(css = "#null0nav a.clsDashAnchor")
    @CacheLookup
    private WebElement dashboard1;

    @FindBy(css = "#null1nav a.clsDashAnchor")
    @CacheLookup
    private WebElement dashboard2;

    @FindBy(css = "#null2nav a.clsDashAnchor")
    @CacheLookup
    private WebElement dashboard3;

    @FindBy(css = "#null3nav a.clsDashAnchor")
    @CacheLookup
    private WebElement dashboard4;

    @FindBy(id = "0_@100_@21_@0_@0_@0_@_srch")
    @CacheLookup
    private WebElement dept;

    @FindBy(id = "0_@100_@5_@0_@0_@0_@_srch")
    @CacheLookup
    private WebElement description;

    @FindBy(css = "#searchSection0 a.navSubTitle")
    @CacheLookup
    private WebElement designCenterDashboard;

    @FindBy(id = "3_@100100_@8_@0_@0_@0_@_srch_@desc")
    @CacheLookup
    private WebElement designer;

    @FindBy(id = "0_@100_@136_@0_@0_@0_@_srch_@desc")
    @CacheLookup
    private WebElement developmentSeason;

    @FindBy(id = "0_@100_@116_@0_@0_@0_@_srch_@desc")
    @CacheLookup
    private WebElement developmentStage;

    @FindBy(id = "0_@100_@57_@0_@0_@0_@_srch_@desc")
    @CacheLookup
    private WebElement division;

    @FindBy(css = "a[title='Factory Capacity']")
    @CacheLookup
    private WebElement factoryCapacity;

    @FindBy(css = "a[title='Factory Capacity Summary']")
    @CacheLookup
    private WebElement factoryCapacitySummary;

    @FindBy(id = "0_@100_@62_@0_@0_@0_@_srch")
    @CacheLookup
    private WebElement fiscalSeason;

    @FindBy(css = "#userCtrlDrop li:nth-of-type(2) a")
    @CacheLookup
    private WebElement help;

    @FindBy(css = "a[title='Home']")
    @CacheLookup
    private WebElement kohls;

    @FindBy(id = "Libraries_Btn")
    @CacheLookup
    private WebElement libraries;

    @FindBy(css = "#userCtrlDrop li:nth-of-type(3) a")
    @CacheLookup
    private WebElement logout;

    @FindBy(css = "a[title='Material']")
    @CacheLookup
    private WebElement material;

    @FindBy(css = "a[title='Material Projections']")
    @CacheLookup
    private WebElement materialProjections;

    @FindBy(css = "a[title='Material Projections Summary']")
    @CacheLookup
    private WebElement materialProjectionsSummary;

    @FindBy(css = "a[title='Material Quote']")
    @CacheLookup
    private WebElement materialQuote;

    @FindBy(id = "MyStuff_Btn")
    @CacheLookup
    private WebElement myStuff;

    @FindBy(css = "a[title='Party']")
    @CacheLookup
    private WebElement party;

    @FindBy(css = "#userCtrlDrop li:nth-of-type(1) a")
    @CacheLookup
    private WebElement preferences;

    @FindBy(css = "a[title='Product']")
    @CacheLookup
    private WebElement product;

    @FindBy(id = "0_@100100_@3_@0_@0_@0_@_srch_@desc")
    @CacheLookup
    private WebElement productCategory;

    @FindBy(id = "0_@100_@164_@0_@0_@0_@_srch_@desc")
    @CacheLookup
    private WebElement productClassification;

    @FindBy(id = "3_@100100_@6_@0_@0_@0_@_srch_@desc")
    @CacheLookup
    private WebElement productCoordinator;

    @FindBy(id = "3_@100_@6_@0_@0_@0_@_srch_@desc")
    @CacheLookup
    private WebElement productManager;

    @FindBy(id = "3_@100100_@10_@0_@0_@0_@_srch_@desc")
    @CacheLookup
    private WebElement productSpecialist;

    @FindBy(id = "0_@100_@165_@0_@0_@0_@_srch")
    @CacheLookup
    private WebElement productType;

    @FindBy(css = "#searchSection1 a.navSubTitle")
    @CacheLookup
    private WebElement productionSourcingDashboard;

    @FindBy(id = "0_@100_@43_@0_@0_@0_@_srch_@desc")
    @CacheLookup
    private WebElement quoteStatus;

    @FindBy(id = "0_@100_@2_@0_@0_@0_@_srch")
    @CacheLookup
    private WebElement requestNo;

    @FindBy(css = "a[title='Reverse Costing']")
    @CacheLookup
    private WebElement reverseCosting;

    @FindBy(css = "#searchSection3 a.navSubTitle")
    @CacheLookup
    private WebElement reverseCostingDashboard;

    @FindBy(id = "_SRCH_TEXT")
    @CacheLookup
    private WebElement saveSearchAs;

    @FindBy(id = "Gbl_Search_Btn")
    @CacheLookup
    private WebElement search;

    @FindBy(css = "#searchSection4 a.navSubTitle")
    @CacheLookup
    private WebElement searchDashboard;

    @FindBy(id = "0_@100_@4_@0_@0_@0_@_srch")
    @CacheLookup
    private WebElement styleNo;

    @FindBy(css = "#searchSection2 a.navSubTitle")
    @CacheLookup
    private WebElement supplierManagementDashboard;

    @FindBy(css = "a[title='Tech Spec']")
    @CacheLookup
    private WebElement techSpec;

    @FindBy(id = "3_@100100_@9_@0_@0_@0_@_srch_@desc")
    @CacheLookup
    private WebElement technicalDesigner;

    @FindBy(css = "a.drop-dwn-ctrl")
    @CacheLookup
    private WebElement testPmId;

    @FindBy(id = "adv_srch_flds_0")
    @CacheLookup
    private WebElement value1;

    @FindBy(id = "adv_srch_opr_0")
    @CacheLookup
    private WebElement value2;

    @FindBy(id = "adv_srch_val_0")
    @CacheLookup
    private WebElement value3;

    @FindBy(id = "adv_srch_flds_1")
    @CacheLookup
    private WebElement value4;

    @FindBy(id = "adv_srch_opr_1")
    @CacheLookup
    private WebElement value5;

    @FindBy(id = "adv_srch_val_1")
    @CacheLookup
    private WebElement value6;

    @FindBy(id = "adv_srch_flds_2")
    @CacheLookup
    private WebElement value7;

    @FindBy(id = "adv_srch_opr_2")
    @CacheLookup
    private WebElement value8;

    @FindBy(id = "adv_srch_val_2")
    @CacheLookup
    private WebElement value9;

    @FindBy(css = "a[title='Vendor Projections']")
    @CacheLookup
    private WebElement vendorProjections;

    @FindBy(css = "a[title='Vendor Projections Summary']")
    @CacheLookup
    private WebElement vendorProjectionsSummary;

    @FindBy(css = "#_tableHeaderBarMainSection tbody tr td:nth-of-type(4) table tbody tr td:nth-of-type(3) a")
    @CacheLookup
    private WebElement workareagridview;

    @FindBy(css = "#_tableHeaderBarMainSection tbody tr td:nth-of-type(4) table tbody tr td:nth-of-type(2) a")
    @CacheLookup
    private WebElement workareamediumview;

    @FindBy(xpath="//label[contains(text(),'Create Tech Spec')]")
    private WebElement createTechSpecLocator;
    
    @Step("click on Create Tech Spec")
    public TechSpec_HomePageObjects clickOnCreateTechSpech() throws Exception
    {
    	Thread.sleep(4000);
    	JSclick(createTechSpecLocator);
    	return this;
    }
    
}
