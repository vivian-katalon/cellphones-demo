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

"Step 2: Hover over link phone2"

WebUI.mouseOver(findTestObject('AI-Generated/Production/Page_home/link_phone2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Hover over link phone2.png')

"Step 3: Click on link brandNames (samsung) -> Navigate to page '/category/*'"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_home/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_home/link_brandNames', ['link_brandNames_internalHasText': link_brandNames_internalHasText, 'link_brandNames_liNthOfType': link_brandNames_liNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link brandNames samsung - Navigate to page category.png')

"Step 4: Click on button addToCart"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_category/button_addToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button addToCart.png')

"Step 5: Click on label storageColor ( 512Gb)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_category/label_storageColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_category/label_storageColor', ['label_storageColor_for': label_storageColor_for, 'label_storageColor_internalText': label_storageColor_internalText]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on label storageColor  512Gb.png')

"Step 6: Click on label storageColor (blue)"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_category/label_storageColor"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_category/label_storageColor', ['label_storageColor_for': label_storageColor_for_1, 'label_storageColor_internalText': label_storageColor_internalText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on label storageColor blue.png')

"Step 7: Click on button buy"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_category/button_buy'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on button buy.png')

"Step 8: Click on link goToCart -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_category/link_goToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on link goToCart - Navigate to page cart.png')

"Step 9: Click on button proceedToCheckout -> Navigate to page '/checkout/info'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_cart/button_proceedToCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button proceedToCheckout - Navigate to page checkoutinfo.png')

"Step 10: Click on input email"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_info/input_email'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on input email.png')

"Step 11: Enter input value in input email"

WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_info/input_email'), input_email)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Enter input value in input email.png')

"Step 12: Click on button continueToShipping -> Navigate to page '/checkout/shipping-address'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_info/button_continueToShipping'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on button continueToShipping - Navigate to page checkoutshipping-address.png')

"Step 13: Click on input firstName2"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_firstName2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on input firstName2.png')

"Step 14: Enter input value in input firstName2"

WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_firstName2'), input_firstName2)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Enter input value in input firstName2.png')

"Step 15: Click on input lastName2"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_lastName2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on input lastName2.png')

"Step 16: Enter input value in input lastName2"

WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_lastName2'), input_lastName2)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Enter input value in input lastName2.png')

"Step 17: Click on input address2"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_address2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on input address2.png')

"Step 18: Enter input value in input address2"

WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_address2'), input_address2)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Enter input value in input address2.png')

"Step 19: Click on input zipCode2"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_zipCode2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on input zipCode2.png')

"Step 20: Enter input value in input zipCode2"

WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_zipCode2'), input_zipCode2)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Enter input value in input zipCode2.png')

"Step 21: Click on input city2"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_city2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on input city2.png')

"Step 22: Enter input value in input city2"

WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_city2'), input_city2)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Enter input value in input city2.png')

"Step 23: Click on input state2"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_state2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Click on input state2.png')

"Step 24: Enter input value in input state2"

WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_state2'), input_state2)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Enter input value in input state2.png')

"Step 25: Click on input phone2"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_phone2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Click on input phone2.png')

"Step 26: Enter input value in input phone2"

WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_phone2'), input_phone2)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Enter input value in input phone2.png')

"Step 27: Click on button continueToPayment -> Navigate to page '/checkout/payment'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/button_continueToPayment'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Click on button continueToPayment - Navigate to page checkoutpayment.png')

"Step 28: Click on button completeOrder2 -> Navigate to page '/thank-you/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_payment/button_completeOrder2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Click on button completeOrder2 - Navigate to page thank-you.png')

"Step 29: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Checkout Process with Detailed Shipping Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}