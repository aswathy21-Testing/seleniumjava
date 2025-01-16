package browser_initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitializeBrowser {

	public void initializeBrowser() {//launching different browsers
		// WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		WebDriver driver = new FirefoxDriver();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitializeBrowser browser = new InitializeBrowser();
		browser.initializeBrowser();

	}

}
