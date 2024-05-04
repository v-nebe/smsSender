package com.shavneva.smssender.service;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class SmsService {
    private static final Logger LOGGER = Logger.getLogger(SmsService.class.getName());

    public void sendSms(String phoneNumber, String message) {
        LOGGER.info("Отправка SMS на номер " + phoneNumber + ": " + message);
    }
}
