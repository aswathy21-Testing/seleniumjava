package browser_initialization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {

	public void fullDataTable() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());

	}

	public void rowTable() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]"));// first row
		System.out.println(row.getText());
	}

	public void cellTable() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement cell = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[1]"));
		System.out.println(cell.getText());
	}
	
	public void columnTable() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement element:column) {
			System.out.println(element.getText());
		}

	}
	
	public void searchData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input = "Software Engineer";
		List<WebElement> column2 = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for(WebElement element:column2) {
			if(element.getText().equals(input)) {
				System.out.println(element.getText());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling tableHandling = new TableHandling();
		tableHandling.initializeBrowser();
		/*tableHandling.fullDataTable();
		System.out.println("**********************************************************************");
		tableHandling.rowTable();
		System.out.println("**********************************************************************");
		tableHandling.cellTable();
		System.out.println("**********************************************************************");
		tableHandling.columnTable();*/
		tableHandling.searchData();

	}

}
