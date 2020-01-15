package abstractClass;

public abstract class WebDriver {
	public abstract void click();
	
	public abstract void sendKeys();
	
	public abstract void getTitle();
	
	public void captureScreenshot() {
		
	}
	/*
	 * Interview Question:
	 * 1. abstract class vs interface
	 * abstract class can contain both abstract method and concrete method
	 * but Interface is ONLY contained abstract methods
	 * 2. how to call concrete method from an abstract class
	 * Inheritance from the parent class
	 *
	 */
}
