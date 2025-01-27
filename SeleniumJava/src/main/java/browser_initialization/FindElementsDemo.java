package browser_initialization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsDemo extends Base{
	
	public void findElementsTest() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> textFields = driver.findElements(By.xpath("//input[@type='text']"));//store multiple web elements in list
		for(WebElement element: textFields) {
				element.sendKeys("Hello");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElementsDemo findElementsObj = new FindElementsDemo();
		findElementsObj.initializeBrowser();
		findElementsObj.findElementsTest();

	}

}
