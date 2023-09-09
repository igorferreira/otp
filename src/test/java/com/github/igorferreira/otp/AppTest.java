package com.github.igorferreira.otp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void test_generateOTP_withValidSecret() {
        App app = new App();
        String secret = "validSecret";
        String otp = app.generateOTP(secret);
        assertNotNull(otp);
        assertTrue(otp.matches("[0-9]{6}"));
    }
}
