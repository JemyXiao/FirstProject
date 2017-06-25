package com.recruit.common.mail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
/**
 * @author jmx
 */
@Component
public class MailSenderHelper implements InitializingBean {
    private static Logger logger = LoggerFactory.getLogger(MailSenderHelper.class);


    private MailSender mailSender;

    @Value("${email.host}")
    private String emailHost;

    @Value("${email.username}")
    private String emailUsername;

    @Value("${email.password}")
    private String emailPassword;

    @Value("${email.from}")
    private String emailFrom;

    @Value("${email.port}")
    private int emailPort;

    public void init() throws IOException {
        mailSender = getMailSender();
    }

    private MailSender getMailSender() {
        MailSender.Builder builder = new MailSender.Builder();
        builder.host(emailHost)
                .user(emailUsername)
                .password(emailPassword)
                .from(emailFrom);
        builder.port(emailPort);
        return builder.build();
    }

    public void sendMail(MailContract mailContract, String subject) {
        logger.info("sending mail:{}", subject);
        String content = "error";
        mailSender.sendHtmlMail(mailContract, subject, content);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        init();
    }
}
