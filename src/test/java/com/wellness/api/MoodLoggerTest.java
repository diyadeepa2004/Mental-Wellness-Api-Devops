package com.wellness.api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoodLoggerTest {

    @Test
    public void testValidMoodHappy() {
        MoodLogger logger = new MoodLogger();
        String response = logger.logMood("happy");
        assertEquals("Mood 'happy' logged successfully", response);
    }

    @Test
    public void testValidMoodSad() {
        MoodLogger logger = new MoodLogger();
        String response = logger.logMood("sad");
        assertEquals("Mood 'sad' logged successfully", response);
    }
}
