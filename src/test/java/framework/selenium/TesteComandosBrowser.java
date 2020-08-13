package framework.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteComandosBrowser {

	static WebDriver driver;

	public static void main(String[] args) {
		comandosBrowser();
	}

	public static void comandosBrowser() {
		// seta o driver a ser usado parametros driver e caminho do driver

		String pathDriver = "C:\\Users\\55519\\eclipse-workspace\\SeleniumAulaComandos\\chromedriver.exe ";
		System.setProperty("webdriaver.chrome.driver", pathDriver);

		driver = new ChromeDriver();
		// Comando para maximizar janela
		driver.manage().window().maximize();

		// Abre a pagina url passada no parametro
		driver.get("https://www.facebook.com");

		// Retorna o titulo da pagina
		String titulo = driver.getTitle();
		System.out.println(titulo);

		// Retorna a url atual
		String url = driver.getCurrentUrl();
		System.out.println(url);

		// Retorna o codigo da pagina
		// String codigoFonte = driver.getPageSource();
		// System.out.println(codigoFonte);

		// Fecha a janela atual
		driver.close();

		// Fecha toda a aplicacao
		// driver.quit();;

	}
}
