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

WebUI.openBrowser('staging.sportime.com.tr')

WebUI.maximizeWindow()

WebUI.click(findTestObject('HomePage_Sportime/svg_Logo_d-none d-sm-block'))

WebUI.click(findTestObject('HomePage_Sportime/a_Ayakkab'))

WebUI.click(findTestObject('HomePage_Sportime/a_Sneaker'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('ProductDetail_Page/a_selected_second_product'))

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('ProductDetail_Page/select_size'))

WebUI.click(findTestObject('span_Sepete Ekle'))

WebUI.scrollToPosition(0, 400)

WebUI.click(findTestObject('ProductDetail_Page/button_Sepete Git'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('ProductDetail_Page/cart_quantity_control'))

WebUI.closeBrowser()

