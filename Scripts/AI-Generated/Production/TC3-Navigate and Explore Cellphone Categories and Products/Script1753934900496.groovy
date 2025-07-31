import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Production.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over span object"

WebUI.mouseOver(findTestObject('AI-Generated/Production/Page_home/span_object'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Hover over span object.png')

"Step 3: Click on link brandNames (apple) -> Navigate to page '/category/*'"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_home/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_home/link_brandNames', ['link_brandNames_internalHasText': link_brandNames_internalHasText, 'link_brandNames_liNthOfType': link_brandNames_liNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on link brandNames apple - Navigate to page category.png')

"Step 4: Click on link iPhone15ClearCase -> Navigate to page '/product/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_category/link_iPhone15ClearCase'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on link iPhone15ClearCase - Navigate to page product.png')

"Step 5: Click on link kCellphoneShop -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_product/link_kCellphoneShop'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on link kCellphoneShop - Navigate to page .png')

"Step 6: Click on link selectiPhone15Case -> Navigate to page '/product/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/link_selectiPhone15Case'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on link selectiPhone15Case - Navigate to page product.png')

"Step 7: Click on link apple -> Navigate to page '/category/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_product/link_apple'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on link apple - Navigate to page category.png')

"Step 8: Hover over span object"

WebUI.mouseOver(findTestObject('AI-Generated/Production/Page_category/span_object'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Hover over span object.png')

"Step 9: Click on link apple"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_category/link_apple'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on link apple.png')

"Step 10: Click on link iPhone16PlusNewSale -> Navigate to page '/product/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_category/link_iPhone16PlusNewSale'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on link iPhone16PlusNewSale - Navigate to page product.png')

"Step 11: Click on link kCellphoneShop -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_product/link_kCellphoneShop'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on link kCellphoneShop - Navigate to page .png')

"Step 12: Click on link productSale -> Navigate to page '/product/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/link_productSale'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on link productSale - Navigate to page product.png')

"Step 13: Hover over link phone"

WebUI.mouseOver(findTestObject('AI-Generated/Production/Page_product/link_phone'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Hover over link phone.png')

"Step 14: Click on link selectApple -> Navigate to page '/category/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_product/link_selectApple'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Click on link selectApple - Navigate to page category.png')

"Step 15: Click on link samsung"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_category/link_samsung'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 15-Click on link samsung.png')

"Step 16: Click on div categoryContent -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_category/div_categoryContent'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 16-Click on div categoryContent - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Navigate and Explore Cellphone Categories and Products_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}