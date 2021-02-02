package com.github.igorferreira.otp;

import java.util.UUID;
import org.jboss.aerogear.security.otp.Totp;
import org.jboss.aerogear.security.otp.api.Base32;

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

        String secret = generateSecret();

        System.out.println("new Secret in Base32: " + secret);

        String pin = app.generateOTP(secret);

        // print OTP gerado
        System.out.println("\nOne-Time-PIN gerado : " + pin);
    }

    private static String generateSecret() {
        UUID uuid = UUID.randomUUID();
        String uuidVal = uuid.toString().replace("-", "");
        return  Base32.encode(uuidVal.toString().getBytes());
    }

}
