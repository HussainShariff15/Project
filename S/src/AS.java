import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://shop.demoqa.com");
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div/h3/a")).click();
		driver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[4]/div/div[1]/div/div/div/div[2]/div[2]/div[3]/div/h3/a")).click();
		Select in=new Select(driver.findElement(By.xpath("//*[@id=\"pa_color\"]")));
		in.selectByVisibleText("Red");
		Select ins=new Select(driver.findElement(By.xpath("//*[@id=\"pa_size\"]")));
		ins.selectByVisibleText("Small");
		
		driver.findElement(By.xpath("//*[@id=\"product-1184\"]/div[1]/div[2]/form/div/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div/div/div[1]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"post-6\"]/div/div/div[2]/div[2]/div/a")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"billing_first_name\"]")).sendKeys("hussain");
		driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys("shariff");
			driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).sendKeys("17,laks");
			driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("eluru");
			
			
	//	Select bm=new Select(driver.findElement(By.xpath("//*[@id=\"billing_state_field\"]/span/span/span[1]/span/span[2]")));	
		//	bm.selectByVisibleText("Andhra Pradesh");

	driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).sendKeys("12345");
	driver.findElement(By.xpath("//*[@id=\"billing_phone\"]")).sendKeys("987654");
	driver.findElement(By.xpath("//*[@id=\"billing_email\"]")).sendKeys("hussainshar@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"place_order\"]")).click();
	
			
		
			
	}
	
	
	}

	
