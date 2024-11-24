package ua.ucu.edu.ua.task2;

public class MailSender {
    public void sendMail(MailInfo mailInfo) {
        String message = mailInfo.generate(); 
        System.out.println("Sending mail to " 
        + mailInfo.getClient().getName() 
        + " (ID: " + mailInfo.getClient().getId() + "): " + message);
    }
}
