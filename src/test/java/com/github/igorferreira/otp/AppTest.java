package com.github.igorferreira.otp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {

        App app = new App();
        assertNotNull(app.generateOTP("B23743HKC446"));
    }
}

