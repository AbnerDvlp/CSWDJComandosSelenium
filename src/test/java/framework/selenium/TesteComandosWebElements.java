package framework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteComandosWebElements {
	static WebDriver driver;

	public static void main(String[] args) {

		comandoWebElements();

	}

	public static void comandoWebElements() {

		String pathDriver = "C:\\Users\\55519\\eclipse-workspace\\SeleniumAulaComandos\\chromedriver.exe ";
		System.setProperty("webdriver.chrome.driver", pathDriver);

		driver = new ChromeDriver();

		// Comando para maximizar janela
		driver.manage().window().maximize();

		// Abre a pagina url passada no parametro
		driver.get("https://www.facebook.com");

		// procura o elemento na pagina parametros de classe e da propria pagina
		driver.findElement(By.id("email")).sendKeys("erick@email.com");

		// limpa o campo ou elemento
		driver.findElement(By.id("email")).clear();

		// retona um boolean se o elemento estiver visivel
		boolean apear;
		apear = driver.findElement(By.id("email")).isDisplayed();
		System.out.println(apear);

		// retona um boolean se o elemento estiver habilitado
		boolean habilited;
		habilited = driver.findElement(By.id("email")).isEnabled();
		System.out.println(habilited);

		// retona um boolean se o elemento estiver habilitado
		boolean selected;
		selected = driver.findElement(By.id("email")).isSelected();
		System.out.println(selected);

		// retorna o texto do link parametro
		String linkText = driver.findElement(By.linkText("Esqueceu a conta?")).getText();
		System.out.println(linkText);

		// Clicka no botao submit
		driver.findElement(By.id("loginbutton")).submit();

	}

}
