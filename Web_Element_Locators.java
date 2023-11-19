package com.Lecture7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element_Locators {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	WebElement MyAccount = driver.findElement(By.linkText("My Account"));
	MyAccount.click();
	Thread.sleep(1200);
	MyAccount.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id='input-firstname']")).sendKeys("learning java");
	driver.findElement(By.xpath("//*[@id='input-lastname']")).sendKeys("from sarthik");
	driver.findElement(By.xpath("//*[@id='input-email']")).sendKeys("example123@example.com");
	driver.findElement(By.xpath("//*[@id='input-telephone']")).sendKeys("1234567390");
	driver.findElement(By.xpath("//*[@id='input-password']")).sendKeys("S@rthik12345");
	driver.findElement(By.xpath("//*[@id='input-confirm']")).sendKeys("S@rthik12345");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[1]/input")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]")).click();
	Thread.sleep(5000);


	}

}
