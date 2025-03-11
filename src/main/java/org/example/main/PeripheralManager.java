package org.example.main;

import org.example.peripherals.Peripheral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PeripheralManager {
    private final Peripheral keyboard;
    private final Peripheral headphones;
    private final Peripheral graphicsTablet;

    @Autowired
    public PeripheralManager(
            @org.springframework.beans.factory.annotation.Qualifier("keyboardBean") Peripheral keyboard,
            @org.springframework.beans.factory.annotation.Qualifier("headphonesBean") Peripheral headphones,
            @org.springframework.beans.factory.annotation.Qualifier("graphicsTabletBean") Peripheral graphicsTablet) {
        this.keyboard = keyboard;
        this.headphones = headphones;
        this.graphicsTablet = graphicsTablet;
    }

    public void displayModels() {
        System.out.println("Peripheral Models:");
        System.out.println("- " + keyboard.getModel());
        System.out.println("- " + headphones.getModel());
        System.out.println("- " + graphicsTablet.getModel());
    }
}