package envioemail.email;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.Test;

public class AppTest {
	
	private String userName = "leandroamorimst@gmail.com";
	private String userPassword = "isnwccicumbjmvxg";

	@Test
	public void testeEmail() throws Exception {
		
		ObjetoEnviaeEmail objetoEnviaeEmail = 
				new ObjetoEnviaeEmail(
						"leandroamorimst@gmail.com", 
						"Leandro AMorim - ArfaxTechSoft", 
						"Testando o E-mail com Java", 
						"Esse texto é a descrição do meu e-mail de teste."
						);
		
		objetoEnviaeEmail.enviarEmail();
		
		/*Caso o email não esteja sendo enviado então,
		 * coloque um tempo de espera, mas, isso só pode
		 * ser usado para testes.*/
		Thread.sleep(5000);//Isso é igual a 5 segundos
		
		
		
		
	}
}
