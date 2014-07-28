import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;


public class SuarezEmail {
    public static void main(String[] args) throws EmailException {

        final EmailAttachment attachment = new EmailAttachment();
        attachment.setPath("Resources/azbW3zq_460sa_v1.gif");
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Suarez bitting");
        attachment.setName("Milen");

        final MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("milenhristov411", "somepassword"));
        email.setSSLOnConnect(true);
        email.setFrom("milenhristov411@gmail.com");
        email.setSubject("Suarez");
        email.setMsg("hacker4e.com");
        email.addTo("pete93@abv.bg");

        email.attach(attachment);
        email.send();

    }
}
