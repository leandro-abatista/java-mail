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
		
		StringBuilder stringBuilderTextoEmail = new StringBuilder();
		stringBuilderTextoEmail.append("<h2>Olá, tudo bem programador Java?</h2>, <br/>");
		stringBuilderTextoEmail.append("<h3>Você está recebendo acesso ao portfólio do github de lheanndroaluno.</h3><br/>");
		stringBuilderTextoEmail.append("<h3>Para ter acesso, clique no botão abaixo:</h3><br/>");
		stringBuilderTextoEmail.append("<a target=\"_blank\" href=\"https://github.com/\""
				+ " style=\"color:#2525a7; padding: 15px; text-align: center; text-decoration: none;"
				+ " display: inline-block; border-radius: 30px; background-color: #00FF00;"
				+ " font-size: 20px; font-family: 'ubuntu'; font-wight: bold;"
				+ " box-shadow: 10px 5px 5px black; border: 3px solid #B8860B;"
				+ " \""
				+ " title=\"Acesso ao GitHub\">Acessar GitHub Leandro Amorim</a></br>");
		
		stringBuilderTextoEmail.append("<br/><br/>");
		
		stringBuilderTextoEmail.append("<br/><span style=\"font-size: 15px; font-wight: bold;"
				+ " color: DarkSlateGray\">Ass.: Leandro Amorim - ArfaxTechSoft</span>");
		
		ObjetoEnviaeEmail objetoEnviaeEmail = 
				new ObjetoEnviaeEmail(
						"leandroamorimst@gmail.com, leandroamorimpb@gmail.com, leandrobatista@si.fiponline.edu.br", 
						"Leandro AMorim - ArfaxTechSoft", 
						"Testando o E-mail com Java", 
						stringBuilderTextoEmail.toString()
						);
		
		objetoEnviaeEmail.enviarEmail(true);
		
		/*Caso o email não esteja sendo enviado então,
		 * coloque um tempo de espera, mas, isso só pode
		 * ser usado para testes.*/
		Thread.sleep(5000);//Isso é igual a 5 segundos
		
		
		
		
	}
}
