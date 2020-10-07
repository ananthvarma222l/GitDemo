package com.Library;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;
import com.pageFactory.OIPA_PF;

import xls.ShineXlsReader;

public class OIPA_Library extends OIPA_PF {

	public static WebDriver driver1;
	public static String Browser;
	public XSSFWorkbook wb;
	public XSSFSheet sheet1;
	Properties p;
	Connection con;
	public static ShineXlsReader xls = new ShineXlsReader(".\\src\\com\\Utilities\\TestData.xlsx");

	public void openBrowser() throws Throwable {

		System.out.println("Launching browser..");
		Browser = "chrome";
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver1 = new ChromeDriver();
		driver1.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver1.manage().deleteAllCookies();
		driver1.manage().window().maximize();

	}

	public WebDriver login(WebDriver driver) throws IOException {

		driver1.get(xls.getCellData("Config", "URL", 2));
		wait(5);
		driver1.findElement(oipa_username).sendKeys(xls.getCellData("Config", "UserName", 2));
		wait(5);
		driver1.findElement(oipa_password).sendKeys(xls.getCellData("Config", "Password", 2));
		wait(5);
		driver1.findElement(oipa_login).click();
		wait(5);
		return driver1;

	}

	public void wait(int seconds) {
		int ms = seconds * 1000;
		try {
			Thread.sleep(ms);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void closeBrowser(WebDriver driver) {
		driver1.quit();
	}

	public void selectItemInDropdown(WebDriver driver, String item) {

		String xpath = "//li[contains(.,'" + item + "')]";
		driver1.findElement(By.xpath(xpath)).click();
	}

	public Properties LoadPropertiesFile() throws IOException {

		FileReader reader = new FileReader(".\\src\\com\\Utilities\\config.properties");
		Properties p = new Properties();
		p.load(reader);
		return p;
	}

	public void connectToDB() throws ClassNotFoundException, SQLException, Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String connectionString = "jdbc:oracle:thin:@" + xls.getCellData("Config", "Host", 2) + ":"
				+ xls.getCellData("Config", "Port", 2) + ":" + xls.getCellData("Config", "Schema", 2); // When
																										// SID
																										// is
																										// used

		con = DriverManager.getConnection(connectionString, xls.getCellData("Config", "Db_UserName", 2),
				xls.getCellData("Config", "Db_Password", 2));

		System.out.println("Connection SuccessFull");
	}

	public String RunQuery(String query) throws SQLException {

		String Value = null;

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {

			Value = "PolicyName: " + rs.getString(3);

		}
		con.close();

		return Value;
	}

	public void takeScreenShot(WebDriver driver, String screenshotName) throws IOException {

		TakesScreenshot srcshot = ((TakesScreenshot) driver1);

		File srcFile = srcshot.getScreenshotAs(OutputType.FILE);

		Files.copy(srcFile,
				new File(".\\src\\com\\Utilities\\Screenshots\\"+ screenshotName + ".png"));

	}

	// Checks if element passed in function is exists in screen

	public boolean exists(By by) {

		try {
			driver1.findElement(by);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// Highlights the element passed in function

	public static WebDriver HighlightElement(WebDriver driver, By by) {
		WebElement Celement = driver.findElement(by);
		if (driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3pxsolid red'", Celement);
		}
		return driver;
	}

	// Unhighlights the element passed in function

	public static WebDriver UnhighlightElement(WebDriver driver, By by) {
		WebElement Celement = driver.findElement(by);
		if (driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver).executeScript("arguments[0].style.border=''", Celement);
		}
		return driver;
	}

	// Navigates to the element passed in function in screen

	public void NavigateToElement(WebDriver driver, By by) {
		WebElement Celement = driver.findElement(by);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (driver instanceof JavascriptExecutor) {
			js.executeScript("arguments[0].scrollIntoView();", Celement);
		}
		Actions actions = new Actions(driver);
		actions.moveToElement(Celement);
		actions.perform();
	}

}
