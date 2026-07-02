package com.wellness.api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CheckInControllerTest {

    @Test
    void testLogMood() {
        CheckInController controller = new CheckInController();
        String result = controller.logMood("Happy");
        assertEquals("Mood logged successfully: Happy", result);
    }
}
