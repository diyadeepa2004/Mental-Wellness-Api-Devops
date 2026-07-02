package com.wellness.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/checkin")
public class CheckInController {

    @PostMapping
    public String logMood(@RequestParam String mood) {
        return "Mood logged successfully: " + mood;
    }

    @GetMapping
    public String health() {
        return "Mental Wellness API is running.";
    }
}
