package radzik.michal.domain;

import java.util.Date;

/**
 * Created by Michal on 2016-12-08.
 */
public class MessageDto {

    private String message;

    private Date messageDate;

    public MessageDto() {
    }

    public MessageDto(String message, Date messageDate) {
        super();
        this.message = message;
        this.messageDate = messageDate;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    public String getMessage() {

        return message;
    }

    public Date getMessageDate() {
        return messageDate;
    }


}
