package br.ufc.qxd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChamadaApplication {

	private static final String cpf = "";
	private static final String senha = "";
	
	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(ChamadaApplication.class, args).close();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://sistemas.quixada.ufc.br/gestao-pessoas/login");
		driver.findElement(By.id("cpf")).sendKeys(cpf);
		driver.findElement(By.id("senha")).sendKeys(senha);
		driver.findElement(By.name("submit")).click();
		driver.get("https://sistemas.quixada.ufc.br/gestao-pessoas/estagiario/minha-frequencia/turma/6");
		driver.findElement(By.id("senha")).sendKeys(senha);
		driver.findElement(By.xpath("//button[@type='submit']")).click();;
		driver.close();
	}
}
