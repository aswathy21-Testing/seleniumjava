package browser_initialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

	public void idLocator() {
		WebElement messageField = driver.findElement(By.id("single-input-field"));// to store the located web element
		WebElement showmessage = driver.findElement(By.id("button-one"));
		WebElement valueA = driver.findElement(By.id("value-a"));
		WebElement valueB = driver.findElement(By.id("value-b"));
		WebElement getTotal = driver.findElement(By.id("button-two"));
		WebElement enterDate = driver.findElement(By.id("single-input-field"));

	}

	public void nameLocator() {
		WebElement name = driver.findElement(By.name("viewport"));
		WebElement name1 = driver.findElement(By.name("keywords"));
		WebElement name2 = driver.findElement(By.name("description"));
	}

	public void classLocator() {
		WebElement nav = driver.findElement(By.className("navbar navbar-expand-md navbar-dark"));
		WebElement div = driver.findElement(By.className("container page"));
		WebElement divMenu = driver.findElement(By.className("col-lg-3 col-md-3 col-sm-12 col-xs-12")); 
		//my-2 - check box demo
	}

	public void linkTextLocator() {
		WebElement checkBoxLink = driver.findElement(By.linkText("check-box-demo.php"));
		WebElement table = driver.findElement(By.linkText("table-pagination.php"));
	}

	public void partialLinkText() {
		WebElement radioButtonsDemo = driver.findElement(By.partialLinkText("radio-button-"));
		WebElement selectInput = driver.findElement(By.partialLinkText("select-input"));
	}
	
	public void cssSelector() {
		WebElement message = driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement showmessage = driver.findElement(By.cssSelector("button#button-one"));
		
		WebElement nav = driver.findElement(By.cssSelector("ul.navbar-nav"));
		WebElement greenNav = driver.findElement(By.cssSelector("div.mb-sec"));
		
		WebElement message1 = driver.findElement(By.cssSelector("input[id=single-input-field]"));
		WebElement getTotal = driver.findElement(By.cssSelector("button[id=button-two]"));
		
		WebElement message2 = driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
		WebElement valueA = driver.findElement(By.cssSelector("input.form-control[id=value-a]"));
	}
	
	public void absoluteXpath() {
		WebElement mesage = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
	}
	
	public void relativeXpath() {
		WebElement message = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement showMessage2  = driver.findElement(By.xpath("//button[@id='button-one']"));
		
		WebElement showMessage = driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
		WebElement getTotal = driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
		
		WebElement showMessage1 = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement enterValueA = driver.findElement(By.xpath("//label[text()='Enter value A']"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
