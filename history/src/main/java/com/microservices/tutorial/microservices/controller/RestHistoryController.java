package com.microservices.tutorial.microservices.controller;

import com.microservices.tutorial.microservices.config.ServiceConfig;
import com.microservices.tutorial.microservices.proxy.CalendarServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("history")
public class RestHistoryController {

    private final CalendarServiceProxy calendarServiceProxy;
    private final ServiceConfig config;
    @Autowired
    public RestHistoryController(CalendarServiceProxy calendarServiceProxy, ServiceConfig config) {
        this.calendarServiceProxy = calendarServiceProxy;
        this.config = config;
    }

    @GetMapping
    public ResponseEntity getHistory(HttpServletRequest req) {
        System.out.println(config.getJwtSigningKey());
//        return calendarServiceProxy.getCalendarModel(req.getHeader("Authorization"));
        return calendarServiceProxy.getCalendarModel();
    }
}
