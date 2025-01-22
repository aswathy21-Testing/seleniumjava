package browser_initialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxAndRadioButton extends Base {

	public void checkboxDemo() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkBox1.click();//to check the checkbox
		Boolean clicked = checkBox1.isSelected();//to check whether the checkbox is checked or not
		System.out.println(clicked);//true
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckboxAndRadioButton checkRadio = new CheckboxAndRadioButton();
		checkRadio.initializeBrowser();
		checkRadio.checkboxDemo();

	}

}
