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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://automationpractice.com/index.php')

'home page'
WebUI.click(findTestObject('Home Page/button_Sign in'))

'login page'
WebUI.setText(findTestObject('User Account Pages/Login Page/Registration Section/input_Email address'), 'test1990@hotmail.com')

WebUI.click(findTestObject('User Account Pages/Login Page/Registration Section/button_Create an account'))

'registration page'
WebUI.delay(3)

WebUI.click(findTestObject('User Account Pages/Registration Page/Personal Info Section/radio_Gender_Mr'))

WebUI.click(findTestObject('User Account Pages/Registration Page/Personal Info Section/check_Sign up for Newsletter'))

WebUI.selectOptionByValue(findTestObject('User Account Pages/Registration Page/Personal Info Section/select_DoB_Day'), '14', 
    true)

WebUI.selectOptionByValue(findTestObject('User Account Pages/Registration Page/Personal Info Section/select_DoB_Month'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('User Account Pages/Registration Page/Personal Info Section/select_DoB_Year'), 
    '1990', true)

WebUI.click(findTestObject('User Account Pages/Registration Page/button_Register'))

'my account page'
WebUI.verifyElementVisible(findTestObject('User Account Pages/My Account Page/h1_My account'))

WebUI.closeBrowser()

