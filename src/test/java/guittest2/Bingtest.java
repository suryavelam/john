package guittest2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Bingtest {

	@Test
	public void  browser() throws IOException, InterruptedException {
		WebDriver wd= new EdgeDriver();
		
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		wd.findElement(By.name("q")).sendKeys("chennai");
		wd.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		File src=	((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File ("C:\\Users\\pcx\\API\\guit\\ssstore\\chrome.png"));
		Thread.sleep(5000);
		
	}
}
