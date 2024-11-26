package com.example.alumniportal;

public class Event {
    private String name;
    private String details;
    private long timestamp;
    public Event(String name, String details, long timestamp) {
        this.name = name;
        this.details = details;
        this.timestamp = timestamp;
    }
    public String getName() {
        return name;
    }
    public String getDetails() {
        return details;
    }
    public long getTimestamp() {
        return timestamp;
    }
}
