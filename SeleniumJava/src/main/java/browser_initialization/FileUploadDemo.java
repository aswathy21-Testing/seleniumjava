package browser_initialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadDemo extends Base{
	
	public void fileUploading() {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement chooseFile = driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		chooseFile.click();
		//chooseFile.sendKeys("G:\\Aswathy_UGCNET\\Paper-I_English.pdf");
	}
	
	public void fileUploadingRobot() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUploadDemo fileUpload = new FileUploadDemo();
		fileUpload.initializeBrowser();
		fileUpload.fileUploading();

	}

}
