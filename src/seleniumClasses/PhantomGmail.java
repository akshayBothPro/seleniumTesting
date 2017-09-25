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

public class PhantomGmail {
	
	String[] cli_args = new String[]{ "--ignore-ssl-errors=true" };
	DesiredCapabilities caps = DesiredCapabilities.phantomjs();
	caps.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS,cli_args );
	caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
			"C:\Userssurga\Downloads\phantomjs-2.1.1-windows\phantomjs-2.1.1-windows\bin\phantomjs.exe");
	driver =  new PhantomJSDriver( caps );
}
