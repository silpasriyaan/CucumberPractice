package javapkg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Screenshot {
	@Test
	public void ScreenShotCase() throws IOException
	{
		String projectpath=System.getProperty("user.dir");
		System.out.println(projectpath);
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.gmail.com/");
		File filepath=new File("C:\\Users\\LENOVO\\workspace\\CucumberPractice\\Screenshots");
		TakesScreenshot tss=(TakesScreenshot)driver;//casting
		File source=tss.getScreenshotAs(OutputType.FILE);
		File destination=new File(filepath+"\\silpa.png");
		FileUtils.copyFile(source, destination);
	}
}
