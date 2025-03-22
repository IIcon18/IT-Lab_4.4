package org.example.main;

import org.example.peripherals.Peripheral;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class PeripheralManager {
    private final Peripheral peripheral;

    // Конструктор без DI — зависимость создаётся вручную
    public PeripheralManager(ApplicationContext context) {
        this.peripheral = context.getBean("PeripheralBean", Peripheral.class);
    }

    public void printModel() {
        System.out.println("Peripheral model: " + peripheral.getModel());
    }
}