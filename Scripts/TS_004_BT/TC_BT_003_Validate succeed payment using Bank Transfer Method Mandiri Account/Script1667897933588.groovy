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

WebUI.scrollToElement(findTestObject('FeaturesOnBT/Method_BankTransfer'), 0)

WebUI.click(findTestObject('FeaturesOnBT/Method_BankTransfer'))

WebUI.scrollToElement(findTestObject('FeaturesOnBT/Mandiri'), 0)

WebUI.click(findTestObject('FeaturesOnBT/Mandiri'))

WebUI.click(findTestObject('FeaturesOnBT/Copy_CompanyCOde'))

WebUI.verifyTextPresent(GlobalVariable.Copied, false)

WebUI.click(findTestObject('FeaturesOnBT/Copy_BillingNumber'))

WebUI.verifyTextPresent(GlobalVariable.Copied, false)

WebUI.click(findTestObject('FeaturesOnBT/Mandiri_HowToPay'))

WebUI.scrollToElement(findTestObject('FeaturesOnBT/Mandiri_ATMMandiri'), 0)

WebUI.click(findTestObject('FeaturesOnBT/Mandiri_ATMMandiri'))

for (def index : (1..6)) {
    WebUI.verifyTextPresent(findTestData('Mandiri-ATMMandiri').getValue(1, index), false)
}

WebUI.click(findTestObject('FeaturesOnBT/Mandiri_ATMMandiri'))

WebUI.scrollToElement(findTestObject('FeaturesOnBT/Mandiri_IBanking'), 0)

WebUI.click(findTestObject('FeaturesOnBT/Mandiri_IBanking'))

for (def index : (1..6)) {
    WebUI.verifyTextPresent(findTestData('Mandiri_IBanking').getValue(1, index), false)
}

WebUI.click(findTestObject('FeaturesOnBT/Mandiri_IBanking'))

WebUI.scrollToElement(findTestObject('FeaturesOnBT/Mandiri_IHavePaid'), 0)

WebUI.click(findTestObject('FeaturesOnBT/Mandiri_IHavePaid'))

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Overlay/iFrame_Payment'), 30)

WebUI.verifyTextPresent(GlobalVariable.Note_Transaction, false)

WebUI.click(findTestObject('FeaturesOnBT/BackToMerchantWeb'))

WebUI.delay(5)

WebUI.switchToDefaultContent()

WebUI.verifyTextPresent(GlobalVariable.BlueMsg1, false)

WebUI.verifyTextPresent(GlobalVariable.BlueMsg2, false)

WebUI.closeBrowser()

