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

String errorMessage = 'Login failed! Please ensure the username and password are valid.'

//Go To Login Page
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service Login/btnMakeAppointment'))

//Input data	
WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service Login/txfUsername'), Username)

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service Login/txfPassword'), Password)

//Click on Login button
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service Login/btnLogin'))

//Assertion
WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service Login/txvLoginError'), errorMessage, 
    FailureHandling.STOP_ON_FAILURE)

