package com.example.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WelcomeModel {
    private final String message;
    private final String currentTime;

    public WelcomeModel() {
        this.message = "Chào mừng bạn đến với trang web của chúng tôi!";
        this.currentTime = LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

    public String getMessage() {
        return message;
    }

    public String getCurrentTime() {
        return currentTime;
    }
}