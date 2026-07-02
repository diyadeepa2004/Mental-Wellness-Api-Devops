package com.wellness.api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WellnessApiTests {

    @Test
    void testKnownMood() {
        MoodLogger logger = new MoodLogger();
        String result = logger.logMood("happy");
        assertEquals("Mood 'happy' logged successfully", result);
    }

    @Test
    void testUnknownMood() {
        MoodLogger logger = new MoodLogger();
        String result = logger.logMood("confused");
        assertEquals("Mood not recognized.", result);
    }
}
