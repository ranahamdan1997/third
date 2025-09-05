package test3sep2025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test3sep2025 {


		// TODO Auto-generated method stub
		
		
		@Test
		void test1() {
System.setProperty("webdriver.chrome.driver",
	    "/Users/ranahamdan/.cache/selenium/chromedriver/mac-arm64/139.0.7258.154/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/watch?v=IVqNY-DCzAo");
System.out.println("THE TITLE IS    "+driver.getTitle());

}
}
