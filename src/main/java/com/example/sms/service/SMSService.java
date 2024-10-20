package com.example.sms.service;

import com.example.sms.model.SMSFeedback;
import com.twilio.Twilio;
import com.twilio.exception.TwilioException;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Service class responsible for sending SMS messages using the Twilio API.
 */
@Service
public class SMSService {

    private static final Logger logger = LoggerFactory.getLogger(SMSService.class);

    // Twilio account SID
    private final String accId = "";

    // Twilio's authentication token
    private final String token = "";


    public void sendSMS(SMSFeedback smsFeedback) {
        try {

            Twilio.init(accId, token);


            Message.creator(
                    new PhoneNumber(smsFeedback.getToNumber()),
                    new PhoneNumber("+12015968584"),
                    smsFeedback.getMessage()
            ).create();
        } catch (TwilioException e) {
            // Log Twilio API exception
            logger.error("Twilio API error", e);
        } catch (Exception e) {
            // Log other exceptions
            logger.error("An error occurred", e);
        }
    }
}
