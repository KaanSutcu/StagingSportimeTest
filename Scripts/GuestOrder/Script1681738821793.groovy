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

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('ProductDetail_Page/select_size'))

WebUI.click(findTestObject('span_Sepete Ekle'))

WebUI.click(findTestObject('ProductDetail_Page/button_Sepete Git'))

WebUI.scrollToPosition(0, 400)

WebUI.click(findTestObject('GuestOrder/button_Siparii Tamamla'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('GuestOrder/a_Misafir Olarak Devam Et'))

WebUI.scrollToPosition(0, 400)

def firstname = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(6)

WebUI.setText(findTestObject('GuestOrder/input_Faturam farkl bir adrese gnder_ShippingNewAddress.FirstName'), firstname)

def lastname = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(6)

WebUI.setText(findTestObject('GuestOrder/input_Ad_ShippingNewAddress.LastName'), lastname)

WebUI.setText(findTestObject('GuestOrder/input_Soyad_ShippingNewAddress.Title'), 'address')

WebUI.setText(findTestObject('GuestOrder/textarea_Adres Ad_ShippingNewAddress.Address1'), 'address')

WebUI.scrollToPosition(0, 300)

int x

x = ((Math.random() * 1000000) as int)

WebUI.setText(findTestObject('GuestOrder/input_Adres_ShippingNewAddress.Email'), ('test' + x) + '@testmail.com')

WebUI.scrollToPosition(0, 400)

phonenumber = ((Math.random() * 10000000) as int)

WebUI.setText(findTestObject('GuestOrder/input_E-Posta_ShippingNewAddress.PhoneNumber'), '599' + phonenumber)

String value = '1eff22a8-df5c-47d7-8309-a3ac985ccffa'

WebUI.selectOptionByValue(findTestObject('GuestOrder/select_lke SeTrkiye'), value, false)

String city = 'c440e499-8132-47e2-8a7c-dbb81bf2be99'

WebUI.selectOptionByValue(findTestObject('GuestOrder/select_city'), city, false)

String ilce = '3d452c83-888b-4af1-a012-cb00bea9524b'

WebUI.selectOptionByValue(findTestObject('GuestOrder/select_ilce'), ilce, false)

String mahalle = 'f588c722-c5a8-4fd7-9c22-c726882fe3fb'

WebUI.selectOptionByValue(findTestObject('GuestOrder/select_mahalle'), mahalle, false)

WebUI.scrollToPosition(0, 400)

WebUI.click(findTestObject('button_Kaydet'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('GuestOrder/Odeme_adm'))

WebUI.setText(findTestObject('GuestOrder/input_CardholderName'), 'Test')

WebUI.setText(findTestObject('GuestOrder/input_CardNumber'), '5400360000000003')

String month = '12'

WebUI.selectOptionByValue(findTestObject('GuestOrder/select_month'), month, false)

String year = '2023'

WebUI.selectOptionByValue(findTestObject('GuestOrder/select_year'), year, false)

WebUI.setText(findTestObject('GuestOrder/input_Cvc'), '000')

WebUI.click(findTestObject('GuestOrder/span_contract'))

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('GuestOrder/input_siparis_tamamla_button'))

WebUI.setText(findTestObject('GuestOrder/input_Sms Code_smsCode'), '283126')

WebUI.click(findTestObject('GuestOrder/button_Submit_sms'))

