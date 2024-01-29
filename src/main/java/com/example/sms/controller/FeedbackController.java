package com.example.sms.controller;

import com.example.sms.model.SMSFeedback;
import com.example.sms.service.SMSService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller responsible for handling SMS-related operations.
 * Exposes endpoints for sending SMS messages.
 *
 * @author Gayan Pathirage
 * @version 1.0
 * @since 2024-01-29
 */
@RestController
@RequestMapping("/v1/sms")
public class FeedbackController {

    private final SMSService smsService;


    public FeedbackController(SMSService smsService) {
        this.smsService = smsService;
    }


    @PostMapping("/messages")
    public void sendSMS(@RequestBody SMSFeedback smsFeedback) {
        smsService.sendSMS(smsFeedback);
    }
}
