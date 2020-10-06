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

WebUI.navigateToUrl('https://www.americanas.com.br/')

WebUI.click(findTestObject('Object Repository/Page_Americanas - Tudo. A toda hora. Em qua_38da14/span_ou cadastre-se'))

WebUI.click(findTestObject('Object Repository/Page_Americanas - Tudo. A toda hora. Em qua_38da14/a_Cliente novo Cadastrar'))

WebUI.setText(findTestObject('Object Repository/Page_Americanas.com - A Maior Loja da Inter_5cd4ca/input_E-mail_email'), 
    'teste@hotmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Americanas.com - A Maior Loja da Inter_5cd4ca/input_Senha_password'), 
    'AnCgFLbkLMU=')

WebUI.setText(findTestObject('Object Repository/Page_Americanas.com - A Maior Loja da Inter_5cd4ca/input_CPF_cpf'), '655.403.090-57')

WebUI.setText(findTestObject('Object Repository/Page_Americanas.com - A Maior Loja da Inter_5cd4ca/input_Seu nome e sobrenome_name'), 
    'Nome de teste')

WebUI.setText(findTestObject('Object Repository/Page_Americanas.com - A Maior Loja da Inter_5cd4ca/input_Data de nascimento_birthday'), 
    '01/01/1990')

WebUI.click(findTestObject('Object Repository/Page_Americanas.com - A Maior Loja da Inter_5cd4ca/label_Masculino'))

WebUI.setText(findTestObject('Object Repository/Page_Americanas.com - A Maior Loja da Inter_5cd4ca/input_Telefone_phone'), 
    '(71) 99999-9999')

WebUI.click(findTestObject('Object Repository/Page_Americanas.com - A Maior Loja da Inter_5cd4ca/button_Criar seu cadastro'))

WebUI.click(findTestObject('Object Repository/Page_Americanas.com - A Maior Loja da Inter_5cd4ca/button_Verificar'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Americanas.com - A Maior Loja da Inter_5cd4ca/div_E-mail j cadastrado'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Americanas.com - A Maior Loja da Inter_5cd4ca/div_E-mail j cadastrado'), 
    'Senha precisa ter entre 6 a 50 caracteres.')

