package browser_initialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FrameDemo extends Base{
	
	public void frameMethod() {
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(frame1);
		WebElement frame = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		frame.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameDemo frameDemo = new FrameDemo();
		frameDemo.initializeBrowser();
		frameDemo.frameMethod();

	}

}
