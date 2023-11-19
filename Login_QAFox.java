package com.Lecture7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_QAFox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//*[@id='input-email']")).sendKeys("example123@example.com");
		driver.findElement(By.xpath("//*[@id='input-password']")).sendKeys("S@rthik12345");
		driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/form/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.linkText("Show AllDesktops")).click();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Continue")).click();
	}

}
