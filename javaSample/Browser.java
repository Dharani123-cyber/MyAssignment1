package javaSample;

public class Browser {
	public void launchBrowser() {
		System.out.println("Browser launched successfully");
	}
	
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {
		Browser obj=new Browser();
		obj.launchBrowser();
		obj.loadUrl();
	}
	
	

}
