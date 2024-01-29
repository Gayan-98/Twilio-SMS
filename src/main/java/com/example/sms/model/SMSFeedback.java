package com.example.sms.model;

import lombok.*;

@Data
@Getter
@Setter
public class SMSFeedback {
    private String toNumber;
    private String message;

}
