package javapkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShotDemo2 {
@Test
public void screenshotdemo2() throws IOException, InterruptedException
{
	String path=System.getProperty("user.dir");
	System.out.println(path);
    WebDriver driver=new ChromeDriver();
    Thread.sleep(5000);
    driver.get("https://www.joyalukkas.in/");
    driver.manage().window().maximize();
   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    TakesScreenshot ts=(TakesScreenshot) driver;
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    File src=ts.getScreenshotAs(OutputType.FILE);
    File trg=new File(".\\ScreenShots\\joyalukkas1.png");
    FileUtils.copyFile(src, trg);
    System.out.println("Done");

}
}
