package com.github.igorferreira.otp;

import java.util.UUID;
import org.jboss.aerogear.security.otp.Totp;

/**
 *
 * A sample otp generator.
 *
 * @author igorferreira
 *
 * @version 1.0
 *
*/
public final class App {
    private static final int MAX_SIZE_SECRET = 11;

    public App() {
    }

    /**
     * Generate One time PIN.
     *
     * @param secret String secret for generate otp.
     */
    public String generateOTP(String secret) {
        // initialize OTP
        Totp generator = new Totp(secret);
        // generate token
        return generator.now();
    }

    /**
     *
     * Show one time pin.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        App app = new App();

        // print OTP gerado
        System.out.println("\nOne-Time-PIN gerado : " + app.generateOTP(generateSecret()));
    }

    private static String generateSecret() {
        UUID uuid = UUID.randomUUID();
        String secret = "B" + uuid.toString().replaceAll("-", "").substring(0, MAX_SIZE_SECRET).toUpperCase().trim();
        secret = "B23743HKC446";

        System.out.println(secret);
        //return new String(secret.getBytes(), "UTF-8");

        return secret;

    }
}
