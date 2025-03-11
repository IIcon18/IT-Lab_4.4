package org.example.peripherals;

import org.springframework.stereotype.Component;

@Component("headphonesBean")
public class Headphones implements Peripheral {
    @Override
    public String getModel() {
        return "Wireless Headphones";
    }
}