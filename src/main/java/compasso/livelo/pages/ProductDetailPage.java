package compasso.livelo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductDetailPage {

	WebDriver driver;
	
	public ProductDetailPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By adicionarCarrinhoButton = By.cssSelector("#cc-prodDetails-addToCart");
	private By voltagemSelect = By.cssSelector("#CC-prodDetails-sku-type_other_v_voltage");
	
	public CartPage adicionarProdutoAoCarrinho() {
		
		driver.findElement(adicionarCarrinhoButton).click();
		
		return new CartPage(driver);
	}
	
	public void selecionarVoltagem(String voltagem) {
		Select voltagemList = new Select(driver.findElement(voltagemSelect));
		
		voltagemList.selectByVisibleText(voltagem);
	}
}
