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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Menu Slidebar/a_Home'))

WebUI.click(findTestObject('Menu Slidebar/a_Merchants'))

WebUI.click(findTestObject('Menu Slidebar/a_Add New Company'))

WebUI.click(findTestObject('Menu Slidebar/a_Add New Merchant'))

WebUI.click(findTestObject('Menu Slidebar/a_Company List'))

WebUI.click(findTestObject('Menu Slidebar/a_Merchant List'))

WebUI.click(findTestObject('Menu Slidebar/a_Generate QR Static'))

WebUI.click(findTestObject('Menu Slidebar/a_Merchants'))

WebUI.click(findTestObject('Menu Slidebar/a_Channels'))

WebUI.click(findTestObject('Menu Slidebar/a_Channel List'))

WebUI.click(findTestObject('Menu Slidebar/a_Channels'))

WebUI.click(findTestObject('Menu Slidebar/a_Report'))

WebUI.click(findTestObject('Menu Slidebar/a_Transaction Report'))

WebUI.click(findTestObject('Menu Slidebar/a_Report'))

WebUI.click(findTestObject('Menu Slidebar/a_Administration'))

WebUI.click(findTestObject('Menu Slidebar/a_Activity Log'))

WebUI.click(findTestObject('Menu Slidebar/a_Manage Account'))

WebUI.click(findTestObject('Menu Slidebar/a_User Role'))

WebUI.click(findTestObject('Menu Slidebar/a_Files'))

WebUI.click(findTestObject('Menu Slidebar/a_PKS'))

WebUI.click(findTestObject('Menu Slidebar/a_NDA'))

WebUI.click(findTestObject('Menu Slidebar/a_Addendum'))

WebUI.click(findTestObject('Menu Slidebar/a_Payment Channel Registration Form'))

