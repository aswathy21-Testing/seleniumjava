package browser_initialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling extends Base {

	public void handleDropdown() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectColor = driver.findElement(By.id("single-input-field"));
		Select select = new Select(selectColor);
		select.selectByIndex(2);
		select.selectByVisibleText("Green");
		select.selectByValue("Red");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DropdownHandling dropdownHandling = new DropdownHandling();
		dropdownHandling.initializeBrowser();
		dropdownHandling.handleDropdown();

	}

}
