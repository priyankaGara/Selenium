package One;

import org.openqa.selenium.chrome.ChromeDriver;

public class One1 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.close();
	}
}
