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

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Home Page/button_Sign in'))

WebUI.setText(findTestObject('User Account Pages/Login Page/Registration Section/input_Email address'), 'alertsibooks1@gmail.com')

WebUI.click(findTestObject('User Account Pages/Login Page/Registration Section/button_Create an account'))

WebUI.click(findTestObject('User Account Pages/Registration Page/Personal Info Section/radio_Gender_Mr'))

WebUI.setText(findTestObject('User Account Pages/Registration Page/Personal Info Section/input_First name'), 'Jorge Uriel')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Personal Info Section/input_Last name'), 'Carballo Hernandez')

WebUI.setEncryptedText(findTestObject('User Account Pages/Login Page/Login Section/input_Password'), '+gfzGSlicnkbGCqZjZIqig==')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Section/input_Address Line 1'), 'Bo. Santa Rosa')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Section/input_City'), 'London')

WebUI.selectOptionByValue(findTestObject('User Account Pages/Registration Page/Address Section/select_State'), '14', true)

WebUI.setText(findTestObject('User Account Pages/Registration Page/Address Section/input_Postcode'), '98765')

WebUI.setText(findTestObject('User Account Pages/Registration Page/Personal Info Section/input_Phone Mobile'), '00505 8192 3645')

WebUI.click(findTestObject('User Account Pages/Registration Page/button_Register'))

WebUI.closeBrowser()

