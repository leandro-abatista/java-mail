package envioemail.email;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

import org.junit.Test;

public class AppTest {
	
	private String userName = "leandroamorimst@gmail.com";
	private String userPassword = "Leandro#1989";

	@Test
	public void testeEmail() throws Exception {
		
		/*Olhe antes as configurações smtp do seu e-mail, cada tipo de e-mail de uma config*/
		
		
		try {
			
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
			
			
			Session session = Session.getInstance(properties, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(userName, userPassword); 
				}
			});
			
			System.out.println(session);
			
		}catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
		
		
		
		
	}
}
