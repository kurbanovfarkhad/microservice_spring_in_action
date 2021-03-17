package com.microservices.tutorial.microservices.controller;

import com.microservices.tutorial.microservices.proxy.CalendarServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("history")
public class RestHistoryController {

    private final CalendarServiceProxy calendarServiceProxy;

    @Autowired
    public RestHistoryController(CalendarServiceProxy calendarServiceProxy) {
        this.calendarServiceProxy = calendarServiceProxy;
    }

    @GetMapping
    public ResponseEntity getHistory() {
        return calendarServiceProxy.getCalendarModel();
    }
}
