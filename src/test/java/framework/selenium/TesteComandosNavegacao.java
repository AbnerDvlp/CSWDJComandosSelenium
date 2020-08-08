package framework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TesteComandosNavegacao {
	static WebDriver driver;

	public static void main(String[] args) {

		comandoNavegacao();
		
	}
	
	public static void comandoNavegacao() {
		String pathDriver = "C:\\Users\\55519\\eclipse-workspace\\selenium\\chromedriver.exe ";
		System.setProperty("webdriaver.chrome.driver", pathDriver);

		driver = new ChromeDriver();
		
		// Comando para maximizar janela
		driver.manage().window().maximize();

		// Abre a pagina url passada no parametro
		driver.get("https://www.facebook.com");
		
		// Navega ate a url passada no parametro
		driver.navigate().to("https://www.google.com");

		// Abre a pagina url passada no parametro
		driver.get("https://www.facebook.com");
		// Navega ate a url passada no parametro
		driver.navigate().to("https://www.google.com");
		
		// procura o elemento na pagina parametros de classe e da propria pagina
		driver.findElement(By.name("q")).sendKeys("celular");
		
		// instancia a biblioteca de ações do selenium 
		Actions act = new Actions(driver);
		
		// Faz a acao de digitar enter
		act.sendKeys(Keys.ENTER).build().perform();
		
		// Procura um elemento e clica
		driver.findElement(By.linkText("Shopping")).click();
		
		// Comandos de navegacao de pagina
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
	}

}
