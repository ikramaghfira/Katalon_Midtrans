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

WebUI.scrollToElement(findTestObject('FeaturesOnBT/BCA'), 0)

WebUI.click(findTestObject('FeaturesOnBT/BCA'))

WebUI.click(findTestObject('FeaturesOnBT/BCA_Copy'))

WebUI.verifyTextPresent(GlobalVariable.Copied, false)

WebUI.click(findTestObject('FeaturesOnBT/BCA_HowToPay'))

WebUI.scrollToElement(findTestObject('FeaturesOnBT/BCA_ATMBCA'), 0)

WebUI.click(findTestObject('FeaturesOnBT/BCA_ATMBCA'))

for (def index : (1..5)) {
    WebUI.verifyTextPresent(findTestData('ATMBCA_Desc').getValue(2, index), false)
}

WebUI.click(findTestObject('FeaturesOnBT/BCA_ATMBCA'))

WebUI.scrollToElement(findTestObject('FeaturesOnBT/BCA_KlikBCA'), 0)

WebUI.click(findTestObject('FeaturesOnBT/BCA_KlikBCA'))

for (def index : (1..5)) {
    WebUI.verifyTextPresent(findTestData('KlikBCA_Desc').getValue(2, index), false)
}

WebUI.click(findTestObject('FeaturesOnBT/BCA_KlikBCA'))

WebUI.scrollToElement(findTestObject('FeaturesOnBT/BCA_mBCA'), 0)

WebUI.click(findTestObject('FeaturesOnBT/BCA_mBCA'))

for (def index : (1..5)) {
    WebUI.verifyTextPresent(findTestData('mBCA_desc').getValue(2, index), false)
}

WebUI.click(findTestObject('FeaturesOnBT/BCA_mBCA'))

WebUI.scrollToElement(findTestObject('FeaturesOnBT/BCA_IHavePaid'), 0)

WebUI.click(findTestObject('FeaturesOnBT/BCA_IHavePaid'))

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

