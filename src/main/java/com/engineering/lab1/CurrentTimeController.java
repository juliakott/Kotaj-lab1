package com.engineering.lab1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class CurrentTimeController {

    @GetMapping("time")
    public CurrentTimeDto getCurrentTime() {
        CurrentTimeDto currentTimeDto = new CurrentTimeDto();
        currentTimeDto.setTime(LocalTime.now());
        return currentTimeDto;
    }
}
