package com.recruit.common.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
/**
 * @author jmx
 */
public class MailSender {
    private static Logger logger = LoggerFactory.getLogger(MailSender.class);

    private String host;
    private int port;
    private String userName;
    private String password;
    private String from;

    MailSender(Builder builder) {
        this(builder.host, builder.port, builder.userName, builder.password, builder.from);
    }

    private MailSender(String host, int port, String userName, String password, String from) {
        this.host = host;
        this.port = port;
        this.userName = userName;
        this.password = password;
        this.from = from;
    }

    void sendHtmlMail(MailContract mailContract, String subject, String content) {
        HtmlEmail email = new HtmlEmail();
        try {
            configEmail(email);
            email.addTo(mailContract.getTo());
            if (null != mailContract.getCc() && mailContract.getCc().length > 0) {
                email.addCc(mailContract.getCc());
            }
            email.setSubject(subject);
            email.setHtmlMsg(content);
            email.send();
        } catch (Exception e) {
            logger.error("send mail error!", e);
        }
    }

    private void configEmail(Email email) throws EmailException, IOException {
        email.setHostName(host);
        email.setSmtpPort(port);
        email.setFrom(from);
        email.setAuthentication(userName, PassWordDecoder.decode(password));
        email.setCharset(StandardCharsets.UTF_8.name());
    }

   public static class Builder {
        private final static int DEFAULT_PORT = 25;
        private String host;
        private int port = DEFAULT_PORT;
        private String userName;
        private String password;
        private String from;

        Builder host(String host) {
            this.host = host;
            return this;
        }

        void port(int port) {
            this.port = port;
        }

        Builder user(String userName) {
            this.userName = userName;
            return this;
        }

        Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder from(String from) {
            this.from = from;
            return this;
        }

        MailSender build() {
            return new MailSender(this);
        }

    }
}
