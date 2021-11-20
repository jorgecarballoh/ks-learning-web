package automationpractice
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Login {
	/**
	 * The step definitions for testing login functionality
	 */
	@Given("I navigate  to the  login page")
	def I_navigate_to_the_login_page() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('automationpractice.com')
		WebUI.click(findTestObject('Home Page/button_Sign in'))
	}

	@When('I login with email "(.*)" and password "(.*)"')
	def I_login_with_email_and_password(String emailAddress, String password) {
		WebUI.setText(findTestObject('User Account Pages/Login Page/Login Section/input_Email address'), emailAddress)
		WebUI.setText(findTestObject('User Account Pages/Login Page/Login Section/input_Password'), password)
		WebUI.click(findTestObject('User Account Pages/Login Page/Login Section/button_Sign in'))
	}

	@Then("I should arrive at the my Account Page")
	def I_should_arrive_at_the_my_Account_Page() {
		WebUI.verifyElementVisible(findTestObject('User Account Pages/My Account Page/h1_My account'))
		WebUI.delay(3)
		WebUI.closeBrowser()
	}
}