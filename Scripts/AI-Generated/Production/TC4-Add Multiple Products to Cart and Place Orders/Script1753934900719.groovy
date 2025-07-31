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

"Step 2: Click on button addToCart"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_addToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on button addToCart.png')

"Step 3: Click on button buy"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_buy'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on button buy.png')

"Step 4: Click on label pink"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/label_pink'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on label pink.png')

"Step 5: Click on button buy"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_buy'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on button buy.png')

"Step 6: Hover over link iPhone15ClearCase"

WebUI.mouseOver(findTestObject('AI-Generated/Production/Page_home/link_iPhone15ClearCase'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Hover over link iPhone15ClearCase.png')

"Step 7: Click on link placeOrder"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/link_placeOrder'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on link placeOrder.png')

"Step 8: Click on button addToCart2"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/button_addToCart2'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on button addToCart2.png')

"Step 9: Hover over link iPhone15ClearCase"

WebUI.mouseOver(findTestObject('AI-Generated/Production/Page_home/link_iPhone15ClearCase'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Hover over link iPhone15ClearCase.png')

"Step 10: Click on link placeOrder -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/link_placeOrder'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Click on link placeOrder - Navigate to page cart.png')

"Step 11: Click on link kCellphoneShop -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_cart/link_kCellphoneShop'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Click on link kCellphoneShop - Navigate to page .png')

"Step 12: Click on link goToCart -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/link_goToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 12-Click on link goToCart - Navigate to page cart.png')

"Step 13: Click on link kCellphoneShop -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_cart/link_kCellphoneShop'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 13-Click on link kCellphoneShop - Navigate to page .png')

"Step 14: Click on link selectiPhone15Case -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/link_selectiPhone15Case'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 14-Click on link selectiPhone15Case - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Add Multiple Products to Cart and Place Orders_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}