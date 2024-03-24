package adactinproject.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties pro;
	
	
	public ConfigurationReader() throws IOException
	{
		File f = new File("C:\\Users\\Deepan\\eclipse-workspace\\adactin\\src\\main\\java\\adactinproject\\pom\\myfile.properties");
		FileInputStream fis = new FileInputStream(f);
		pro = new Properties();
		pro.load(fis);
	}
public String getBrowser() {
	
	String browser = pro.getProperty("browser");
	return browser;
	
}
public String getUrl() {
	
	String Url = pro.getProperty("Url");
	return Url;
	
}
public String getusername() {
	
	String username = pro.getProperty("username");
	return username;
	
}	
public String getpassword() {
	
	String password = pro.getProperty("password");
	return password;
	
}

public String getsubmit() {

     String submit=pro.getProperty("submit");
     return submit;
}
public String getclick() {

    String click=pro.getProperty("click");
    return click;
}

public String SearchDirectoryname() {

    String SearchDirectoryname=pro.getProperty("SearchDirectoryname");
    return SearchDirectoryname;
}

public String SearchDirectoryjob() {

    String SearchDirectoryjob=pro.getProperty("SearchDirectoryjob");
    return SearchDirectoryjob;
}

public String SearchDirectorylocation() {

    String SearchDirectorylocation=pro.getProperty("SearchDirectorylocation");
    return SearchDirectorylocation;
}
public String clicking() {

    String clicking=pro.getProperty("clicking");
    return clicking;
}
public String timename() {

    String timename=pro.getProperty("timename");
    return timename;
}
public String view() {

    String view=pro.getProperty("view");
    return view;
}












}
