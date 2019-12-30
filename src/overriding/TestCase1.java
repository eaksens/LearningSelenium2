package overriding;

public class TestCase1 {
	
	public static void main(String[] args) {
		//want to automate website using firefox
		
		FirefoxDriver driver = new FirefoxDriver();
		//driver.clickOnChrome(); -this is the issue of overriding
		//common method -we need to put them all in parent class
		driver.click();
		driver.sendKeys();
		driver.getTitle();
	}

}
