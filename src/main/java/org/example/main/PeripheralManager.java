package org.example.main;

import org.example.peripherals.Peripheral;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class PeripheralManager {
    private final List<Peripheral> peripherals;

    public PeripheralManager(ApplicationContext context) {
        this.peripherals = List.of(
                context.getBean("headphonesBean", Peripheral.class),
                context.getBean("keyboardBean", Peripheral.class),
                context.getBean("GraphicsTabletBean", Peripheral.class)
        );
    }

    public void printModels() {
        for (Peripheral peripheral : peripherals) {
            System.out.println("Peripheral model: " + peripheral.getModel());
        }
    }
}
