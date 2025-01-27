package browser_initialization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxDemo extends Base {

	public void checkboxDemo() {//check single checkbox
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkBox1.click();// to check the checkbox
		System.out.println(checkBox1.isSelected());// to check whether the checkbox is checked or not

	}

	public void multipleCheckboxDemo() {//check multiple checkboxes
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for (WebElement box : checkBoxes) {
			box.click();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckboxDemo checkBox = new CheckboxDemo();
		checkBox.initializeBrowser();
		checkBox.checkboxDemo();
		checkBox.multipleCheckboxDemo();

	}

}
