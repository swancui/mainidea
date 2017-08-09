package com.store.utils;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailUtil {
	public static void sendMail(String fromMail,String user,String password,
			String toMail,String mailTitle,String mailContent) throws Exception{
		Properties properties = new Properties();
		
		//ʹ��smtp:���ʼ�����Э��
		
		//�洢�����ʼ�����������Ϣ  
		properties.put("mail.smtp.host", "smtp.163.com");
		//ͬʱͨ����֤
		properties.put("mail.smtp.auth", "true");
		
		properties.setProperty("mail.debug", "true");
		properties.setProperty("mail.transport.protocol", "smtp");
		
		//���������½�һ���ʼ��Ự  
		Session session = Session.getInstance(properties);
		session.setDebug(true); //�������ӡһЩ������Ϣ��  
		
		//���ʼ��Ự�½�һ����Ϣ����  
		MimeMessage message = new MimeMessage(session);
		
		//���÷����˵ĵ�ַ  
		message.setFrom(new InternetAddress(fromMail));
		
		//�����ռ���,���������������ΪTO  
		message.setRecipient(Message.RecipientType.TO, new InternetAddress(toMail));
		
		//���ñ���  
		message.setSubject(mailTitle);
		
		//�����ż�����  
		//message.setText(mailContent); //���� ���ı� �ʼ� todo  
		
		//����HTML�ʼ���������ʽ�ȽϷḻ  
		message.setContent(mailContent, "text/html;charset=gbk"); 
		message.setSentDate(new Date());//���÷���ʱ��  
		message.saveChanges();//�洢�ʼ���Ϣ  
		
		//�����ʼ�  
		Transport transport = session.getTransport("smtp");  
		//Transport transport = session.getTransport();  
		transport.connect(user, password);  
		transport.sendMessage(message, message.getAllRecipients());//�����ʼ�,���еڶ�����������������õ��ռ��˵�ַ  
		transport.close();  
		
	}
	
	public static void main(String[] args) throws Exception {
		sendMail("swancuikqq635@163.com",
				"swancuikqq635", "a19881023", "694740885@qq.com", "�����ʼ�", "<a href='http://localhost/Store/index'>http://localhost/Store/index</a>");
	}
}
