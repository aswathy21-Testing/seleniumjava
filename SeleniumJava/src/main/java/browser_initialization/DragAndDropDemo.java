package browser_initialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo extends Base{
	
	public void dragDrop() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragAndDropDemo dragDrop = new DragAndDropDemo();
		dragDrop.initializeBrowser();
		dragDrop.dragDrop();

	}

}
