package org.example.main;

import org.example.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        PeripheralManager manager = new PeripheralManager(context);

        manager.printModels();

        ((AnnotationConfigApplicationContext) context).close();
    }
}
