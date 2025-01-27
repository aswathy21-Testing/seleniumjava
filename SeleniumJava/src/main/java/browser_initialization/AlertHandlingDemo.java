package browser_initialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandlingDemo extends Base {

	public void alertHandling() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickMe = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickMe.click();
		driver.switchTo().alert().accept();
	}

	public void alertHandlingSec() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickMeYellow = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickMeYellow.click();
		driver.switchTo().alert().dismiss();
	}

	public void promptAlertDemo() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement promptAlert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		promptAlert.click();
		driver.switchTo().alert().sendKeys("Aswathy");
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandlingDemo alertDemo = new AlertHandlingDemo();
		alertDemo.initializeBrowser();
		// alertDemo.alertHandling();
		// alertDemo.alertHandlingSec();
		alertDemo.promptAlertDemo();

	}

}
