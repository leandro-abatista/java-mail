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
		
		/*Olhe antes as configurações smtp do seu e-mail, cada tipo de e-mail de uma config*/
		
		
		try {
			
			/**
			 * Configuração das propriedades
			 */
			Properties properties = new Properties();
					 //put(chave, valor)
			properties.put("mail.smtp.ssl.trust", "*");
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
			
			/*Estabelecemos para quem iremos enviar*/
			Address[] toUser = 
					InternetAddress.parse("leandroamorimst@gmail,leandroamorimpb@gmail.com,leandrobatista@si.fiponline.edu.br");
			
			
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(userName, "Leandro Amorim - ArfaxTechSoft"));/*Quem está enviando*/
			message.setRecipients(Message.RecipientType.TO, toUser);/*Email de destino, pode ser um email, ou uma lista de emails*/
			message.setSubject("Chegou email enviado com Java");
			message.setDescription("Novo teste de envio de e-mail com java");
			message.setText("Olá programador, você acaba de receber mais um e-mail enviado com Java do curso Formação Web do Alex");
			
			
			Transport.send(message);
			
			
			/*Caso o email não esteja sendo enviado então,
			 * coloque um tempo de espera, mas, isso só pode
			 * ser usado para testes.*/
			Thread.sleep(5000);//Isso é igual a 5 segundos
			
			
		}catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
		
		
		
		
	}
}
