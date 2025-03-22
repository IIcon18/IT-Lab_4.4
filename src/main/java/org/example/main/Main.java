package org.example.main;

import org.example.config.SpringConfig;
import org.example.main.PeripheralManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Создаём Spring-контекст
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // Передаём контекст в PeripheralManager
        PeripheralManager manager = new PeripheralManager(context);

        // Выводим модель устройства
        manager.printModel();

        // Закрываем контекст
        ((AnnotationConfigApplicationContext) context).close();
    }
}