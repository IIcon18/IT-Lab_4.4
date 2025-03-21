package org.example.main;

import org.example.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Создание Spring-контекста с использованием Java-конфигурации
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // Получение бина PeripheralManager и вызов метода
        PeripheralManager peripheralManager = context.getBean(PeripheralManager.class);
        peripheralManager.displayModels();

        // Закрытие контекста
        context.close();
    }
}