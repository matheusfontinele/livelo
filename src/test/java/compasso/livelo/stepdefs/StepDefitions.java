package compasso.livelo.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import compasso.livelo.pages.CartPage;
import compasso.livelo.pages.HomePage;
import compasso.livelo.pages.ProductDetailPage;
import compasso.livelo.pages.ResultSearchPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class StepDefitions {

	WebDriver driver;
	HomePage homePage;
	ResultSearchPage resultSearchPage;
	ProductDetailPage productDetailPage;
	CartPage cartPage;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
		this.driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void finishExection() {
		this.driver.quit();
	}

	@Dado("que um navegador esta na home page da Livelo")
	public void que_um_navegador_esta_na_home_page_da_livelo() {
		this.driver.get("https://www.livelo.com.br/");
	}

	@Quando("pesquisar por {string} na barra de pesquisa")
	public void pesquisar_por_na_barra_de_pesquisa(String produto) {
		homePage = new HomePage(driver);
		homePage.autorizarCokkie();
		homePage.pesquisarProduto(produto);
	}

	@Quando("selecionar o primeiro produto do resultado da pesquisa")
	public void selecionar_o_primeiro_produto_do_resultado_da_pesquisa() {
		resultSearchPage = new ResultSearchPage(driver);
		resultSearchPage.clicarNoPrimeiroProduto();
	}

	@Quando("adicionar o produto ao carrinho")
	public void adicionar_o_produto_ao_carrinho() {
		productDetailPage = new ProductDetailPage(this.driver);
		productDetailPage.adicionarProdutoAoCarrinho();
	}

	@Entao("o navegador e direcionado para a pagina do carrinho")
	public void o_navegador_e_direcionado_para_a_pagina_do_carrinho() {
		cartPage = new CartPage(this.driver);
		
		//Verificao 
		assert (cartPage.getTituloPagina().equals("Seu carrinho")); 
		
		assert (driver.getCurrentUrl().equals("https://www.livelo.com.br/cart"));
	}

	@Entao("na descricao do produto deve conter {string}")
	public void na_descricao_do_produto_deve_conter(String produto) {
		
		assert (cartPage.getDescricaoProduto().contains(produto));
	}

	@Entao("a quantidade deve ser {int}")
	public void a_quantidade_deve_ser(Integer quantidade) {
		assert (cartPage.getQuantidadeProduto() == quantidade);
	}

}
