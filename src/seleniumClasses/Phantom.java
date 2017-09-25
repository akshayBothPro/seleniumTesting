package seleniumClasses;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Phantom {

	public static void main(String[] args) throws IOException {

		System.setProperty("phantomjs.binary.path",
				"C:/Users/surga/Downloads/phantomjs-2.1.1-windows/phantomjs-2.1.1-windows/bin/phantomjs.exe");
		DesiredCapabilities caps = new DesiredCapabilities();
		/*caps.setJavascriptEnabled(true);
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
				"C:/Users/surga/Downloads/phantomjs-2.1.1-windows/phantomjs-2.1.1-windows/bin/phantomjs.exe");*/
		WebDriver driver = new PhantomJSDriver();
		driver.get("http://www.google.com");
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("C://sample6.jpg"), true);
		driver.get(
				"https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogins");
		System.out.println("gmail");
		driver.findElement(By
				.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[1]/div[1]/div/div[1]/div/div[1]/input"))
				.sendKeys("techintern3@istarindia.com");
		System.out.println("gmail");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/div/content"))
				.click();
		System.out.println("gmail");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By
				.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/input"))
				.sendKeys("istar@india");
		System.out.println("gmail");

		driver.findElement(
				By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/div[2]/div[1]/div/content"))
				.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Page title is: " + driver.getTitle());
	}

}

/*
 * public class phantom { public static void main(String[] args) throws
 * InterruptedException, IOException { File file = new File(
 * "C:/Users/surga/Downloads/phantomjs-2.1.1-windows/phantomjs-2.1.1-windows/bin/phantomjs.exe"
 * ); System.setProperty("phantomjs.binary.path",
 * "C:/Users/surga/Downloads/phantomjs-2.1.1-windows/phantomjs-2.1.1-windows/bin/phantomjs.exe"
 * ); System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
 * WebDriver driver = new PhantomJSDriver(); driver.get("http://www.gmail.com");
 * Thread.sleep(3000); driver.findElement(By.id("identifierId")).clear();
 * driver.findElement(By.id("identifierId")).sendKeys(
 * "techintern4@istarindia.com");
 * driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
 * driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 * driver.get("http://www.google.com"); File srcfile = ((TakesScreenshot)
 * driver).getScreenshotAs(OutputType.FILE); FileUtils.copyFile(srcfile, new
 * File("C://sample7.jpg"), true); driver.manage().timeouts().implicitlyWait(30,
 * TimeUnit.SECONDS);
 * driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))
 * .sendKeys("istar@india"); File srcfile1 = ((TakesScreenshot)
 * driver).getScreenshotAs(OutputType.FILE); FileUtils.copyFile(srcfile1, new
 * File("C://sample8.jpg"), true);
 * 
 * driver.findElement(By.xpath("//*[@id=\"passwordNext\"]")).click();
 * 
 * System.out.println("unSuccessfull"); System.out.println("Page title is: " +
 * driver.getTitle()); driver.quit(); } }
 */