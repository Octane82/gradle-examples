package com.everlapp;

public class GreetingPluginExtension {
    private String greeter = "Dima";
    private String message = "Message from Plugin (Java)!";

    public String getGreeter() {
        return greeter;
    }

    public void setGreeter(String greeter) {
        this.greeter = greeter;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}