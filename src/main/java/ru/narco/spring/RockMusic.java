package ru.narco.spring;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind Cries Mary";
    }
}
