package org.example.config;

import org.example.peripherals.GraphicsTablet;
import org.example.peripherals.Headphones;
import org.example.peripherals.Keyboard;
import org.example.peripherals.Peripheral;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean(name = "headphonesBean")
    public Peripheral getHeadphonesBean() {
        return new Headphones();
    }

    @Bean(name = "keyboardBean")
    public Peripheral getKeyboardBean() {
        return new Keyboard();
    }

    @Bean(name = "GraphicsTabletBean")
    public Peripheral getGraphicsTabletBean() {
        return new GraphicsTablet();
    }
}