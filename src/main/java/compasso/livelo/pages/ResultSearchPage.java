package compasso.livelo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultSearchPage {

	private WebDriver driver;
	
	public ResultSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	 private By image = By.xpath("//div[@id='CC-productListing']//img");
	 
	 public ProductDetailPage clicarNoPrimeiroProduto() {
		 driver.findElement(image).click();
		 
		 return new ProductDetailPage(driver);
	 }
	
}
