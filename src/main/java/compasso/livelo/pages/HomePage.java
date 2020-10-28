package compasso.livelo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By search = By.cssSelector("#input-search");
	private By searchIcon = By.cssSelector("#span-searchIcon");
	private By autorizeCookiesButton = By.cssSelector("#btn-authorizeCoookies");
	
	/*Realiza a pesquisa de um produto e retorna como objeto a página
	 * dos resultados da pesquisa.
	 */
	
	public void autorizarCokkie() {
		driver.findElement(autorizeCookiesButton).click();
	}
	
	public ResultSearchPage pesquisarProduto(String produto) {
		
		driver.findElement(search).clear();
		
		driver.findElement(search).sendKeys(produto);
		
		driver.findElement(searchIcon).click();
		
		return new ResultSearchPage(this.driver);
	}
	
}
