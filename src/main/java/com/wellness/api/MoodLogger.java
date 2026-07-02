package com.wellness.api;

import java.util.Arrays;
import java.util.List;

public class MoodLogger {

    private static final List<String> KNOWN_MOODS = Arrays.asList(
        "happy", "sad", "anxious", "tired", "stressed", "excited", "calm"
    );

    public String logMood(String mood) {
        if (mood == null) {
            return "Mood not recognized.";
        }
        String normalized = mood.toLowerCase().trim();
        if (KNOWN_MOODS.contains(normalized)) {
            return "Mood '" + normalized + "' logged successfully";
        }
        return "Mood not recognized.";
    }
}
