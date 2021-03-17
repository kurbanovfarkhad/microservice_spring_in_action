package com.microservices.tutoriial.microservices.controller;

import com.microservices.tutoriial.microservices.model.CalendarEvent;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("calendar")
public class RestCalendarController {

    private final List<CalendarEvent> events = List.of(
            new CalendarEvent(1L,"Feed kukuwka", LocalDateTime.now().minusDays(3)),
            new CalendarEvent(2L,"Feed myself", LocalDateTime.now().minusDays(4)),
            new CalendarEvent(3L,"gym everything", LocalDateTime.now().minusDays(2))
    );

    @GetMapping
    public ResponseEntity<List<CalendarEvent>> getAllEvent(){
        return ResponseEntity.ok(events);
    }
}
