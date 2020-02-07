package com.kodilla.good.patterns.challenges.service.information;

import com.kodilla.good.patterns.challenges.service.controller.User;


public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Sent information email");

    }
}
