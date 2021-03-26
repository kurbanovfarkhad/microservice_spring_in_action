package com.microservices.tutorial.microservices.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "calendar-service")
@RibbonClient(name = "calendar-service")
public interface CalendarServiceProxy {
    @GetMapping("/calendar")
    ResponseEntity<List<CalendarModel>> getCalendarModel();
//    ResponseEntity<List<CalendarModel>> getCalendarModel(@RequestHeader(value = "Authorization") String authorizationHeader);
}
