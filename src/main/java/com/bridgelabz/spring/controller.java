package com.bridgelabz.spring;
import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class controller {
        @RequestMapping(value = "/message", method = RequestMethod.GET)
        public String message() {
            return "Hello World!";
        }
    }

