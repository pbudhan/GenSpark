package org.example;

import org.springframework.stereotype.Component;

@Component
public class Phone {

    private String cellDevice;

    public Phone(String phone) {
        this.cellDevice = phone;
    }

}
