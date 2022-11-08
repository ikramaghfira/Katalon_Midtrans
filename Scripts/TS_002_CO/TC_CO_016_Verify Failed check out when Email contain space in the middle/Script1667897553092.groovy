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

WebUI.clearText(findTestObject('FieldOnCO/InputAmount'))

WebUI.setText(findTestObject('FieldOnCO/InputAmount'), '100000')

WebUI.scrollToElement(findTestObject('FieldOnCO/Name'), 0)

WebUI.clearText(findTestObject('FieldOnCO/Name'))

WebUI.setText(findTestObject('FieldOnCO/Name'), 'Fira')

WebUI.clearText(findTestObject('FieldOnCO/Email'))

WebUI.setText(findTestObject('FieldOnCO/Email'), 'fira @gmail.com')

WebUI.clearText(findTestObject('FieldOnCO/Phone'))

WebUI.setText(findTestObject('FieldOnCO/Phone'), '082341531211')

WebUI.clearText(findTestObject('FieldOnCO/City'))

WebUI.setText(findTestObject('FieldOnCO/City'), 'Malang')

WebUI.clearText(findTestObject('FieldOnCO/Address'))

WebUI.setText(findTestObject('FieldOnCO/Address'), 'Bandara Palmerah 17')

WebUI.clearText(findTestObject('FieldOnCO/Postal'))

WebUI.setText(findTestObject('FieldOnCO/Postal'), '65138')

WebUI.click(findTestObject('Button/CheckOut'))

WebUI.switchToDefaultContent()

WebUI.verifyTextPresent(GlobalVariable.ErrorMsg1, false)

WebUI.verifyTextPresent(GlobalVariable.ErrorMsg2, false)

WebUI.closeBrowser()

