package test3sep2025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test3sep2025 {


		// TODO Auto-generated method stub
		
		
		@Test
		void test1() {
 // تحديد مسار ChromeDriver
        System.setProperty("webdriver.chrome.driver",
                "/Users/ranahamdan/.cache/selenium/chromedriver/mac-arm64/139.0.7258.154/chromedriver");

        // تفعيل الـ headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // بدون GUI
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        // فتح صفحة
        driver.get("https://www.youtube.com/watch?v=IVqNY-DCzAo");

        // طباعة عنوان الصفحة
        System.out.println("THE TITLE IS: " + driver.getTitle());

        driver.quit();

}
}
