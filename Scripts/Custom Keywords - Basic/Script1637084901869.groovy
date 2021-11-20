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

WebUI.navigateToUrl('automationpractice.com')

WebUI.click(findTestObject('Home Page/button_Sign in'))

WebUI.delay(2)

CustomKeywords.'common.Utilities.refreshBrowser'()

WebUI.delay(2)

CustomKeywords.'common.Utilities.refreshBrowser'()

WebUI.delay(2)

WebUI.setText(findTestObject('User Account Pages/Login Page/Login Section/input_Email address'), 'jorge.carballoh@gmail.com')

WebUI.setText(findTestObject('User Account Pages/Login Page/Login Section/input_Password'), 'Root123#')

WebUI.verifyElementVisible(findTestObject('User Account Pages/My Account Page/h1_My account'))

WebUI.delay(3)

WebUI.closeBrowser()
