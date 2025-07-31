import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
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

"Step 2: Click on span goToCart -> Navigate to page '/cart'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_home/span_goToCart'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on span goToCart - Navigate to page cart.png')

"Step 3: Click on button proceedToCheckout -> Navigate to page '/checkout/shipping-address'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_cart/button_proceedToCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on button proceedToCheckout - Navigate to page checkoutshipping-address.png')

"Step 4: Click on input firstName"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_firstName'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on input firstName.png')

"Step 5: Enter input value in input firstName"

WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_firstName'), input_firstName)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Enter input value in input firstName.png')

"Step 6: Press key Tab on input firstName"

WebUI.sendKeys(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_firstName'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Press key Tab on input firstName.png')

"Step 7: Enter input value in input lastName"

WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_lastName'), input_lastName)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Enter input value in input lastName.png')

"Step 8: Press key Tab on input lastName"

WebUI.sendKeys(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_lastName'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Press key Tab on input lastName.png')

"Step 9: Enter input value in input address"

WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_address'), input_address)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Enter input value in input address.png')

"Step 10: Press key Tab on input address"

WebUI.sendKeys(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_address'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Press key Tab on input address.png')

"Step 11: Enter input value in input zipCode"

WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_zipCode'), input_zipCode)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Enter input value in input zipCode.png')

"Step 12: Press key Tab on input zipCode"

WebUI.sendKeys(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_zipCode'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Press key Tab on input zipCode.png')

"Step 13: Enter input value in input city"

WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_city'), input_city)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Enter input value in input city.png')

"Step 14: Press key Tab on input city"

WebUI.sendKeys(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_city'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Press key Tab on input city.png')

"Step 15: Enter input value in input state"

WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_state'), input_state)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Enter input value in input state.png')

"Step 16: Press key Tab on input state"

WebUI.sendKeys(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_state'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Press key Tab on input state.png')

"Step 17: Enter input value in input phone"

WebUI.setText(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/input_phone'), input_phone)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Enter input value in input phone.png')

"Step 18: Click on button continueToPayment -> Navigate to page '/checkout/payment'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_shipping_address/button_continueToPayment'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Click on button continueToPayment - Navigate to page checkoutpayment.png')

"Step 19: Click on button completeOrder -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_checkout_payment/button_completeOrder'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Click on button completeOrder - Navigate to page .png')

"Step 20: Hover over link phone"

WebUI.mouseOver(findTestObject('AI-Generated/Production/Page_home/link_phone'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 20-Hover over link phone.png')

"Step 21: Click on link brandNames (apple) -> Navigate to page '/category/*'"

// Bind values to the variables in the locators of "AI-Generated/Production/Dynamic Objects/Page_home/link_brandNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Production/Dynamic Objects/Page_home/link_brandNames', ['link_brandNames_internalHasText': link_brandNames_internalHasText, 'link_brandNames_liNthOfType': link_brandNames_liNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 21-Click on link brandNames apple - Navigate to page category.png')

"Step 22: Click on link iPhone15ClearCase -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Production/Page_category/link_iPhone15ClearCase'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 22-Click on link iPhone15ClearCase - Navigate to page .png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Complete Checkout Process with Shipping Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}