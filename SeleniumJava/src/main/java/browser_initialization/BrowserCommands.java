package browser_initialization;

public class BrowserCommands extends Base {
	
	public void browserCommands() {
		String title = driver.getTitle();//to get the title of webpage
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browserCommands = new BrowserCommands();
		browserCommands.initializeBrowser();
		browserCommands.browserCommands();
		browserCommands.quitAndClose();

	}

}
