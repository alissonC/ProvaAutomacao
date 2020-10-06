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

WebUI.click(findTestObject('Object Repository/Page_Americanas - Tudo. A toda hora. Em qua_38da14/div_ol, faa seu login'))

WebUI.setText(findTestObject('Object Repository/Page_Americanas.com - A Maior Loja da Inter_5cd4ca/input_E-mail_email'), 
    'teste59569596@hotmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Americanas.com - A Maior Loja da Inter_5cd4ca/input_Senha na americanas.com_password'), 
    'SaLzXmhNQh8cK2GnEg/iaw==')

WebUI.click(findTestObject('Object Repository/Page_Americanas.com - A Maior Loja da Inter_5cd4ca/button_Continuar'))

WebUI.setText(findTestObject('Page_Americanas.com - A Maior Loja da Inter_5cd4ca/buscarproduto'), 'Moto G6')

WebUI.click(findTestObject('Page_Americanas.com - A Maior Loja da Inter_5cd4ca/buscarprodutoBotao'))

WebUI.click(findTestObject('Page_Americanas.com - A Maior Loja da Inter_5cd4ca/Celular'))

WebUI.click(findTestObject('Page_Americanas.com - A Maior Loja da Inter_5cd4ca/btncomprar'))

WebUI.click(findTestObject('Page_Americanas.com - A Maior Loja da Inter_5cd4ca/btnContinuar'))

// Segundo produto
WebUI.setText(findTestObject('Page_Americanas.com - A Maior Loja da Inter_5cd4ca/buscarproduto'), 'samsung j2')

WebUI.click(findTestObject('Page_Americanas.com - A Maior Loja da Inter_5cd4ca/buscarprodutoBotao'))

WebUI.click(findTestObject('Page_Americanas.com - A Maior Loja da Inter_5cd4ca/Celular'))

WebUI.click(findTestObject('Page_Americanas.com - A Maior Loja da Inter_5cd4ca/btncomprar'))

WebUI.click(findTestObject('Page_Americanas.com - A Maior Loja da Inter_5cd4ca/btnContinuar'))

// Terceiro produto
WebUI.setText(findTestObject('Page_Americanas.com - A Maior Loja da Inter_5cd4ca/buscarproduto'), 'moto g8 plus')

WebUI.click(findTestObject('Page_Americanas.com - A Maior Loja da Inter_5cd4ca/buscarprodutoBotao'))

WebUI.click(findTestObject('Page_Americanas.com - A Maior Loja da Inter_5cd4ca/Celular'))

WebUI.click(findTestObject('Page_Americanas.com - A Maior Loja da Inter_5cd4ca/btncomprar'))

WebUI.click(findTestObject('Page_Americanas.com - A Maior Loja da Inter_5cd4ca/btnContinuar'))

WebUI.click(findTestObject('Page_Americanas.com - A Maior Loja da Inter_5cd4ca/btncontinuarComprando'))

WebUI.verifyLessThan(findTestObject('Page_Americanas.com - A Maior Loja da Inter_5cd4ca/ValorTotal'), 5.000)
 
def mes = WebUI.getText(findTestObject('DayDuyet/Page_SWIFT EDITOR 2.4/div_Gi duyt thnh cng s RM 9902'))

if (!(mes.toString().contains('10'))) {
	KeywordUtil.markFailed('Não é possivel comprar em parcelas de 10x sem juros')
}
