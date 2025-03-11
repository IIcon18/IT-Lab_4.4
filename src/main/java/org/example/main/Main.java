package org.example.main;

import org.example.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        PeripheralManager manager = context.getBean(PeripheralManager.class);
        manager.displayModels();

        context.close();
    }
}