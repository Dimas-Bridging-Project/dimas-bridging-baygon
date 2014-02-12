/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.email;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import sun.java2d.pipe.SpanShapeRenderer;

/**
 *
 * @author Bagus Winarno
 */
public class SendEmailAttachment {
    
    public int sendGmailMessageWithAttachment(final String emailFrom, final String emailPass, String arrayEmailTo, 
            String emailSubject, String emailBodyText, String sourceFilePath, Date tanggalEmail) {
	          Properties props = new Properties();
	          props.put("mail.smtp.host", "smtp.gmail.com");
	          props.put("mail.smtp.auth", "true");
	          props.put("mail.debug", "true");
	          //props.put("mail.smtp.port", "465" );
                  props.put("mail.smtp.socketFactory.port", "465");
                  props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
                  
                  Session session = Session.getInstance(props,new javax.mail.Authenticator(){
                      public javax.mail.PasswordAuthentication getPasswordAuthentication() {
                                    return new javax.mail.PasswordAuthentication(emailFrom.toLowerCase() ,emailPass);
                      }});
                  
	          try{
                        MimeMessage message=new MimeMessage(session);
                        message.setFrom(new InternetAddress(emailFrom.toLowerCase()));
                        //message.setRecipient(RecipientType.TO, new InternetAddress("bagus_download@yahoo.co.id"));
                       
                        List<String> listTo= new ArrayList<>();
                        String [] strAddress = arrayEmailTo.split(";");
                        for (int i=0; i<strAddress.length; i++) {
                            if (! strAddress[i].toString().trim().equalsIgnoreCase("")) {
                                listTo.add(strAddress[i].toString().trim().toLowerCase());
                            }
                        }
                        InternetAddress[] internetAddress = new InternetAddress[listTo.size()];
                        int i=0;
                        for(String address:listTo){
                            internetAddress[i++] = new InternetAddress(address);
                        }
                        message.setRecipients(RecipientType.TO, internetAddress);
                        //Tambahkan Subject 
                        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");                       
                        message.setSubject(emailSubject + sdf.format(tanggalEmail));
                        
                        //message.setText("Testing....");
                        
                        //Jika tanpa attacment maka JANGAN PERNAH MENGGUNAKAN BODY PART
                        //This is the text
                        BodyPart messageBodyPart1 = new MimeBodyPart();
                        messageBodyPart1.setText(emailBodyText + sdf.format(tanggalEmail));

                        //Collect message to multipart to send 
                        Multipart multipart = new MimeMultipart();
                        multipart.addBodyPart(messageBodyPart1);

                        //This is an attactment PERTAMA
                        MimeBodyPart messageBodyPartAttachment = new MimeBodyPart();
                        String strFilePath = sourceFilePath + "Client_ID.CSV" ;
                        String strFileName = "Client_ID.CSV";
                        DataSource ds = new FileDataSource(strFilePath);
                        messageBodyPartAttachment.setDataHandler(new DataHandler(ds));
                        messageBodyPartAttachment.setFileName(strFileName);                        
                        multipart.addBodyPart(messageBodyPartAttachment);

                        //This is an attactment KEDUA
                        messageBodyPartAttachment = new MimeBodyPart();
                        strFilePath = sourceFilePath + "Stock_ID.CSV";
                        strFileName = "Stock_ID.CSV";
                        ds = new FileDataSource(strFilePath);
                        messageBodyPartAttachment.setDataHandler(new DataHandler(ds));
                        messageBodyPartAttachment.setFileName(strFileName);                        
                        multipart.addBodyPart(messageBodyPartAttachment);

                        //This is an attactment KETIGA
                        messageBodyPartAttachment = new MimeBodyPart();
                        strFilePath = sourceFilePath + "Sales_ID.CSV";
                        strFileName = "Sales_ID.CSV";
                        ds = new FileDataSource(strFilePath);
                        messageBodyPartAttachment.setDataHandler(new DataHandler(ds));
                        messageBodyPartAttachment.setFileName(strFileName);                        
                        multipart.addBodyPart(messageBodyPartAttachment);

                        //This is an attactment KEEMPAT
                        messageBodyPartAttachment = new MimeBodyPart();
                        strFilePath = sourceFilePath + "So_ID.CSV";
                        strFileName = "So_ID.CSV";
                        ds = new FileDataSource(strFilePath);
                        messageBodyPartAttachment.setDataHandler(new DataHandler(ds));
                        messageBodyPartAttachment.setFileName(strFileName);                        
                        multipart.addBodyPart(messageBodyPartAttachment);
                        
                        message.setContent(multipart);
                        
                        Transport.send(message);
                       
                        System.out.println("success....................................");
	          }
	          catch(MessagingException ex){
	              throw  new RuntimeException(ex);
	          }                  
        return 0;
        
    }
            
   
     public static void main(String[] args) {
   	    
         SendEmailAttachment f = new SendEmailAttachment();
         f.sendGmailMessageWithAttachment("bagus.stimata@gmail.com", "Welcome1#", "bagus.stimata@gmail.com;bagus_download@yahoo.co.id;", 
                "Data Dimas Tanggal:", "Kiriman Data Dimas",  "E:/", new java.util.Date());

    }
 

}
    
    
