package com.microservices.tutoriial.microservices.model;

import java.time.LocalDateTime;

public class CalendarEvent {
    private Long id;
    private String eventName;
    private LocalDateTime eventDate;

    public CalendarEvent() {
    }

    public CalendarEvent(Long id, String eventName, LocalDateTime eventDate) {
        this.id = id;
        this.eventName = eventName;
        this.eventDate = eventDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }
}
