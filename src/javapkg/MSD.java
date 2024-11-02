package javapkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MSD {
public static void main(String[] args) throws IOException
{
	System.out.println(return_method("browser"));
	System.out.println(return_method("user_name"));
}

public static String return_method(String name)throws IOException
{
	String project_path =System.getProperty("user.dir");
	System.out.println(project_path);
	FileInputStream obj=new FileInputStream(project_path +"\\ObjectRepo\\Demo1.properties ");
	Properties prop_obj=new Properties();
	prop_obj.load(obj);
	String propertyfileValue=prop_obj.getProperty(name);
	return propertyfileValue;	
}
}
