package org.example.config;

import org.example.peripherals.Headphones;
import org.example.peripherals.Peripheral;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean(name = "PeripheralBean")
    public Peripheral getPeripheralBean() {
        return new Headphones();
    }
}