package envioemail.email;

import java.util.Properties;

import org.junit.Test;

public class AppTest {

	@Test
	public void testeEmail() {
		
		/*Olhe antes as configurações smtp do seu e-mail, cada tipo de e-mail de uma config*/
		
		/**
		 * Configuração das propriedades
		 */
		Properties properties = new Properties();
				 //put(chave, valor)
		properties.put("mail.smtp.auth", "true");/*Autorização*/
		properties.put("mail.smtp.starttls.enable", "true");/*Autenticação*/
		properties.put("mail.smtp.host", "smtp.gmail.com");/*Servidor do gamil - Google*/
		properties.put("mail.smtp.port", "587");/*Porta smtp do servidor*/
		properties.put("mail.smtp.socketFactory.port", "465");/*Especifica a porta a ser utilizada para conexão pelo socket*/
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");/*Classe Socket de conexão ao SMTP*/
		
		
		
		
		
		
	}
}
