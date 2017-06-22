package com.recruit.common.mail;
/**
 * @author jmx
 */
public class MailContract {
    private String[] to;
    private String[] cc;
    public String[] getTo() {
        return to;
    }
    public MailContract setTo(String[] to) {
        this.to = to;
        return this;
    }
    public String[] getCc() {
        return cc;
    }
    public MailContract setCc(String[] cc) {
        this.cc = cc;
        return this;
    }
}
