package com.ibm.test.mq;

import org.slf4j.Logger; 
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @JmsListener(destination = "TEST_Q")
    public void consumeMessage(String message) {
        logger.info("Messages --- " + message);
    }
}