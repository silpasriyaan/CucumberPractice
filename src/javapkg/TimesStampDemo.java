package javapkg;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class TimesStampDemo {
@Test

	public void TestCase1()
	{
	Date d1=new Date();
	System.out.println(d1);
	SimpleDateFormat d2= new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
	String timestamp= d2.format(d1);
	
	System.out.println(timestamp);
}
}
