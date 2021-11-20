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

WebUI.openBrowser('automationpractice.com')

'login page'
WebUI.click(findTestObject('Home Page/button_Sign in'))

WebUI.setText(findTestObject('Registration Section/input_Email address'), 'jorge.carballoh@test.com')

WebUI.click(findTestObject('User Account Pages/Login Page/Registration Section/button_Create an account'))

'registration page'
WebUI.delay(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ARROW_DOWN))

WebUI.delay(2)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ARROW_DOWN))

WebUI.delay(2)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('User Account Pages/Registration Page/Personal Info Section/input_First name'), Keys.chord(
        Keys.ENTER, 'Jorge Uriel'))

WebUI.delay(3)

WebUI.closeBrowser()

