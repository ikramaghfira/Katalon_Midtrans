import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Button/BuyNow'))

WebUI.click(findTestObject('Button/CheckOut'))

WebUI.switchToFrame(findTestObject('Overlay/iFrame_Payment'), 30)

WebUI.verifyElementText(findTestObject('Overlay/MerchantName'), GlobalVariable.Header)

WebUI.click(findTestObject('PaymentMethod/CC'))

WebUI.verifyElementPresent(findTestObject('FeaturesOnCC/Logo'), 0)

WebUI.setText(findTestObject('FeaturesOnCC/CardNumber'), GlobalVariable.CardNumber)

WebUI.setText(findTestObject('FeaturesOnCC/CVV'), GlobalVariable.CVV)

WebUI.setText(findTestObject('FeaturesOnCC/Expiry'), GlobalVariable.Expiry)

WebUI.scrollToElement(findTestObject('FeaturesOnCC/Radio_PromoInstallment'), 0)

WebUI.click(findTestObject('FeaturesOnCC/Radio_PromoInstallment'))

WebUI.verifyElementText(findTestObject('FeaturesOnCC/Header_Total'), 'Rp15.000')

WebUI.click(findTestObject('Button/CC_PayNow'))

WebUI.switchToFrame(findTestObject('Overlay/iFrame_IssuingBank'), 30)

WebUI.setText(findTestObject('FeaturesOnCC/Password'), GlobalVariable.OTP)

WebUI.click(findTestObject('FeaturesOnCC/Button_Ok'))

WebUI.delay(5)

WebUI.switchToDefaultContent()

WebUI.verifyTextPresent('Thank you for your purchase.', false)

WebUI.verifyTextPresent('Get a nice sleep.', false)

WebUI.closeBrowser()

