package compasso.livelo.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import compasso.livelo.pages.HomePage;
import compasso.livelo.pages.ResultSearchPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class StepDefitions {

	WebDriver driver;
	HomePage homePage;
	ResultSearchPage resultSearchPage;
	
	@Dado("que estou na home site da Livelo")
	public void que_estou_na_home_site_da_Livelo() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		this.driver = new ChromeDriver();
	
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		this.driver.get("https://www.livelo.com.br/");
	}
	
	@Dado("pesquiso pelo produto {string}")
	public void pesquiso_pelo_produto(String produto) {
		homePage = new HomePage(driver);
		homePage.autorizarCokkie();
		homePage.pesquisarProduto(produto);
	}

	@Quando("eu selecionar o primeiro produto da lista")
	public void eu_selecionar_o_primeiro_produto_da_lista() {
	    resultSearchPage = new ResultSearchPage(driver);
	    resultSearchPage.clicarNoPrimeiroProduto();
	}
	
	@Entao("devo estar na pagina de detalhe do produto")
	public void devo_estar_na_pagina_de_detalhe_do_produto() {

	}
	
	@Quando("clicar no botao {string}")
	public void clicar_no_botao(String string) {
	    
	}

	@Entao("deve ser direcionado para a pagina do carrinho")
	public void deve_ser_direcionado_para_a_pagina_do_carrinho() {
	    
	}
	
	@Entao("o valor do pedido deve estar correto")
	public void o_valor_do_pedido_deve_estar_correto() {
	 
	}
	
	@Entao("a quantidade deve ser {int}")
	public void a_quantidade_deve_ser(Integer int1) {
	    
	}

}
