import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Excel extends BaseClass{

	public static void main(String[] args) {
		
		BaseClass.browserOpen("chrome");
		BaseClass.launchUrl("https://adactinhotelapp.com/index.php");
		BaseClass.maximizeScreen();
		
		WebElement user = driver.findElement(By.xpath("//*[@id='username']"));
		String username = BaseClass.excelread(0, 0);
		BaseClass.sendValue(user, username);
		
		WebElement pw = driver.findElement(By.xpath("//*[@id='password']"));
		String pass = BaseClass.excelread(1, 0);
		BaseClass.sendValue(pw, pass);
		
		WebElement click = driver.findElement(By.xpath("//*[@id='login']"));
		BaseClass.clickElement(click);
		
		WebElement firstoption = driver.findElement(By.xpath("//*[@name='location']"));
		BaseClass.selectIndex(firstoption, 5);
		
		WebElement secondvalue = driver.findElement(By.xpath("//*[@id='hotels']"));
		BaseClass.selectVisible(secondvalue, "Hotel Creek");
		
		WebElement thirdvalue = driver.findElement(By.xpath("//*[@name='room_type']"));

		BaseClass.selectVisible(thirdvalue, "Super Deluxe");
		
		WebElement fourth = driver.findElement(By.xpath("//*[@id='room_nos']"));
		BaseClass.selectIndex(fourth, 2);
		
		WebElement datecheck = driver.findElement(By.xpath("(//*[@type='text'])[2]"));
		BaseClass.clear(datecheck);
		String stdate = BaseClass.excelread(4, 0);
		BaseClass.sendValue(datecheck, stdate);
		
		WebElement dateout = driver.findElement(By.xpath("(//*[@type='text'])[3]"));
		BaseClass.clear(dateout);
		String enddate = BaseClass.excelread(5, 0);
		BaseClass.sendValue(dateout, enddate);
		
		WebElement adult = driver.findElement(By.xpath("//*[@name='adult_room']"));
		BaseClass.selectIndex(adult, 2);

		WebElement child = driver.findElement(By.xpath("//*[@name='child_room']"));
		BaseClass.selectIndex(child, 1);

		WebElement search = driver.findElement(By.xpath("//*[@name='Submit']"));
		BaseClass.clickElement(search);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement radio = driver.findElement(By.xpath("//*[@type='radio']"));
		BaseClass.clickElement(radio);

		WebElement cont = driver.findElement(By.xpath("//*[@name='continue']"));

		BaseClass.clickElement(cont);
		
		WebElement firstname = driver.findElement(By.xpath("//*[@name='first_name'] "));
		String fname = BaseClass.excelread(2, 0);
		BaseClass.sendValue(firstname, fname);
		

		WebElement lastname = driver.findElement(By.xpath("//*[@name='last_name']"));
		String lname = BaseClass.excelread(3, 0);
		BaseClass.sendValue(lastname, lname);
		
		WebElement add = driver.findElement(By.xpath("//*[@name='address']"));
		String address = BaseClass.excelread(6, 0);
		BaseClass.sendValue(add, address);
		

		WebElement card = driver.findElement(By.xpath("//*[@name='cc_num']"));
		String cdno = BaseClass.excelread(7, 0);
		BaseClass.sendValue(card, cdno);
		
		WebElement id = driver.findElement(By.xpath("//*[@name='cc_type']"));
		BaseClass.selectVisible(id, "American Express");

		WebElement exp = driver.findElement(By.xpath("//*[@name='cc_exp_month']"));
		BaseClass.selectIndex(exp, 7);

		WebElement year = driver.findElement(By.xpath("//*[@name='cc_exp_year']"));
		BaseClass.selectIndex(year, 8);
		
		WebElement cvv = driver.findElement(By.xpath("//*[@name='cc_cvv']"));
		String cvno = BaseClass.excelread(8, 0);
		BaseClass.sendValue(cvv, cvno);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement book = driver.findElement(By.xpath("(//*[@type=\"button\"])[1]"));
		BaseClass.clickElement(book);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement orderno = driver.findElement(By.xpath("//*[@name='order_no']"));
		BaseClass.getAttribute(orderno, "value");
		
		
	}
}
