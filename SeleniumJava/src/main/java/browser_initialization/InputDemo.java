package browser_initialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputDemo extends Base{
	
	public void inutRead() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");//or create webelement for inputform, then use click()
		WebElement message = driver.findElement(By.id("single-input-field"));// created web element for message textbox
		System.out.println(message.isEnabled());// check whether it is enabled or not for entering value
		message.sendKeys("Hello");
		WebElement showMessage = driver.findElement(By.id("button-one"));
		showMessage.click();
		System.out.println(showMessage);
		
	}
	
	public void inputValues() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement valueA = driver.findElement(By.id("value-a"));
		valueA.sendKeys("10");
		WebElement valueB = driver.findElement(By.id("value-b"));
		valueB.sendKeys("20");
		WebElement getTotal = driver.findElement(By.id("button-two"));
		getTotal.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputDemo inputDemo = new InputDemo();
		inputDemo.initializeBrowser();
		inputDemo.inutRead();
		inputDemo.inputValues();

	}

}
