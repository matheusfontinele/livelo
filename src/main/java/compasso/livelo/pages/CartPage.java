package compasso.livelo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

	WebDriver driver;
	WebDriverWait wait;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		
		//Os elementos dessa página estão demorando mais para carregar
		//Por isso foi necessário um wait explicito
		wait = new WebDriverWait(this.driver,20);
	}
	
	private By seuCarrinhoLabel = By.xpath("//div[@id='CC-cart-list']//h1[@class='h2']");
	private By descricaoProduto = By.xpath("//div[@id='cc-cart-item-0']/div[@class='cart-list__prodinfo']/a");
	private By quantidadeProduto = By.xpath("//div[@id='cc-cart-item-0']/div[@class='cart-list__prodquantity']//span[@class='cart-list__value-qnt']");
	
	public String getTituloPagina() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(seuCarrinhoLabel));
		
		return driver.findElement(seuCarrinhoLabel).getText();
	}
	
	public String getDescricaoProduto() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(descricaoProduto));
		
		return driver.findElement(descricaoProduto).getText();
	}
	
	public int getQuantidadeProduto() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(descricaoProduto));
		
		//Retorna o texto ja convertido para Inteiro
		return Integer.parseInt(driver.findElement(quantidadeProduto).getText());
	}
}
