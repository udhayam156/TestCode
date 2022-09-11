import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static void browserOpen(String Browsers) {

		try {

			switch (Browsers) {

			case "firefox":

				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\udhay\\eclipse-workspace\\BaseClass\\Drivers\\geckodriver.exe");

				driver = new FirefoxDriver();

				break;

			case "edge":
				System.setProperty("webdriver.edge.driver",
						"C:\\Users\\udhay\\eclipse-workspace\\BaseClass\\Drivers\\msedgedriver.exe");

				driver = new EdgeDriver();

				break;

			case "chrome":
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\udhay\\eclipse-workspace\\BaseClass\\Drivers\\chromedriver.exe");

				driver = new ChromeDriver();

				break;

			default:

				System.out.println("This browser is not valid");

				break;

			}

		} catch (Exception e) {

		}
	}

	public static void launchUrl(String url) {

		try {

			driver.get(url);
		} catch (Exception e) {

		}

	}

	public static void maximizeScreen() {

		try {

			driver.manage().window().maximize();
		}

		catch (Exception e) {

		}
	}

	public static void sendValue(WebElement element, String data) {
		try {
			element.sendKeys(data);
		} catch (Exception e) {
		}
	}

	public static void clickElement(WebElement element) {

		try {

			element.click();
		} catch (Exception e) {

		}
	}

	public static void close() {

		try {

			driver.close();
		} catch (Exception e) {

		}
	}

	public static void navigate(String url) {

		try {
			driver.navigate().to(url);
		} catch (Exception e) {

		}
	}

	public static void getAttribute(WebElement element, String name) {

		try {
			String name1 = element.getAttribute(name);

			System.out.println(name1);
		} catch (Exception e) {

		}
	}

	public static void getTitle() {

		try {
			String title = driver.getTitle();
			System.out.println(title);
		} catch (Exception e) {

		}
	}

	public static void getCurrentUrl() {
		try {

			String currentUrl = driver.getCurrentUrl();

			System.out.println(currentUrl);
		} catch (Exception e) {

		}
	}

	public static void findElement(String location) {

		try {

			driver.findElement(By.xpath(location));

		} catch (Exception e) {

		}
	}

	public static void findElement1(String name) {

		try {

			driver.findElement(By.id(name));

		} catch (Exception e) {

		}
	}

	public static void clear(WebElement element) {

		try {

			element.clear();

		} catch (Exception e) {

		}
	}

	public static void getPageSource() {

		try {

			String pageSource = driver.getPageSource();

			System.out.println(pageSource);
		} catch (Exception e) {

		}
	}

	public static void alert() {

		try {

			driver.switchTo().alert().accept();
		} catch (Exception e) {

		}
	}

	public static void selectIndex(WebElement element, int a) {

		try {

			Select se = new Select(element);

			se.selectByIndex(a);

		} catch (Exception e) {
		}
	}

	public static void selectVisible(WebElement element, String name) {

		try {

			Select se = new Select(element);

			se.selectByVisibleText(name);

		} catch (Exception e) {
		}
	}

	public static void actions(String location) {

		try {

			WebElement action = driver.findElement(By.xpath(location));

			Actions ac = new Actions(driver);

			ac.moveToElement(action);
		} catch (Exception e) {

		}
	}

	public static String excelread(int rowdata, int celldata) {

		String value = null;
		try {
			// locate
			File f = new File(
					"C:\\Users\\udhay\\eclipse-workspace\\maven\\MavenTesting\\src\\test\\resources\\Test\\values.xlsx");
			// read
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(rowdata);
			Cell cell = row.getCell(celldata);
			int cellType = cell.getCellType();
			// 1 string
			if (cellType == 1) {
				value = cell.getStringCellValue();

				// 0 number and date
			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat sc = new SimpleDateFormat("dd/MM/yyyy");
					value = sc.format(dateCellValue);

				} else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					value = String.valueOf(l);

				}
			}

		} catch (Exception e) {

		}
		return value;
	}
	
	//driver findElement
		public static WebElement findElementbyId(String id) {
			return driver.findElement(By.id(id));	
		}
		
		public static WebElement findElementbyname(String name) {
			return driver.findElement(By.name(name));	
		}
		
		public static WebElement findElementbyxpath(String xpath) {
			return driver.findElement(By.xpath(xpath));	
		}
		
		// Abstract method
		public static WebElement findbyAbstarct(By by) {
			return driver.findElement(by);

}
}
