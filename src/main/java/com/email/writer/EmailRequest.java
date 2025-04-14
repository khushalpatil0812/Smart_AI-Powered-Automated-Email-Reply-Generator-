package com.email.writer;
import lombok.Data;
@Data
public class EmailRequest {
    private String emailContent;
    private String tone;

    public CharSequence getTone() {
        return tone;
    }

    public void setTone(CharSequence tone) {

    }

    public char[] getEmailContent() {
        return emailContent.toCharArray();
    }
}
