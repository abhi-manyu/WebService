package org.MessengerApp.example.mailservice;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ProfileSignUpMail implements Runnable{

	private String senderName;
	
	public ProfileSignUpMail(String senderName)
	{
		this.senderName=senderName;
	}
	
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getSenderName() {
		return senderName;
	}
	
	
	public void run()
	{
		System.out.println("the new thread name is : "+Thread.currentThread().getName());
		try {
			sendMail(senderName);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void sendMail(String rcvr) throws AddressException, MessagingException
    {
    	System.out.println("preparing ur mail");
    	
    	Properties prop = new Properties();
    	
    	prop.put("mail.smtp.auth", "true");
    	prop.put("mail.smtp.starttls.enable","true");
        prop.put("mail.smtp.host","smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        
        
        final String myAccountEmail="abhim.moharana@gmail.com";
        final String password = "cezrznurjetflwdp";
        
        Session ms = Session.getInstance(prop, new Authenticator() {
			protected PasswordAuthentication gePasswordAuthentication()
        	{
        		return new PasswordAuthentication(myAccountEmail,"cezrznurjetflwdp");
        	}
        	
		});
        	
        
       Message msg = prepareMessage(ms,myAccountEmail,rcvr);
       
       Transport.send(msg, myAccountEmail,"cezrznurjetflwdp");
       //Transport.send(msg, myAccountEmail,"Reset123");
       
       System.out.println("mail sent successfully");
    }
	
	
	
	private static Message prepareMessage(Session ms,String myAccountEmail,String rcvr) throws AddressException, MessagingException
	{
		Message msg = new MimeMessage(ms);
		msg.setRecipient(Message.RecipientType.TO, new InternetAddress(rcvr));
		msg.setSubject("Thanks for Registering in Messenger");
		msg.setText("hello there , how are you ? thank you for registering in messenger application."
				+ "U are added as the valuable user of this messenger application , so hope u will use "
				+ "it in a constructive way around."
				+ "\n\n\n"
				+ "Thanks & Regards \n"
				+ "Team Messenger :)");
		
		msg.setFrom(new InternetAddress(myAccountEmail));
		return msg;
	}

}
