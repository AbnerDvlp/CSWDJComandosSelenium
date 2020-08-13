package framework.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesteWaits {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		testaWaitExplicito();
		// testaWaitImplicito();
	}

	public static void testaWaitImplicito() {

		String pathDriver = "C:\\Users\\55519\\eclipse-workspace\\SeleniumAulaComandos\\chromedriver.exe ";
		System.setProperty("webdriver.chrome.driver", pathDriver);

		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/dynamic_loading");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// define o wait com parametros de tempo e
																		// unidade de tempo

		driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
		driver.findElement(By.xpath("//button")).click();
		String text = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/h4")).getText();
		System.out.println(text);

	}

	public static void testaWaitExplicito() throws InterruptedException {

		String pathDriver = "C:\\Users\\55519\\eclipse-workspace\\SeleniumAulaComandos\\chromedriver.exe ";
		System.setProperty("webdriver.chrome.driver", pathDriver);

		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/dynamic_loading");

		driver.manage().window().maximize();

		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.xpath("//button")).click();
		
		WebElement textoHelloWord = (new WebDriverWait(driver, 20))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[3]/h4")));

		textoHelloWord.click();
		
		
		System.out.println(textoHelloWord.getAttribute("innerText").toString());

	}

}
