package com.example.ashionbackend.config;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioSendSms {
    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

    public void sendCode(String phoneNumber, Integer code) {

        Twilio.init(
                "",
                "");

        Message.creator(new PhoneNumber(phoneNumber), new PhoneNumber("MG249f932ac8f2511f36124b3714ac6130"),
                "Your verify is: " + code).create();

    }
}
