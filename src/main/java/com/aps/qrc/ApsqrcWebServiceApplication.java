package com.aps.qrc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
 * ============================================================
 * #Developer Details |
 * -------------------
 * @author: Hizbullah Watandost
 * @Designation: IT Research and Development Assistant in APS
 * @Website: http://www.aps.af
 * @Contact_email: hizbullah.watandost@aps.af
 * ============================================================
 */

/**
 * The start point of the the API.
 * It starts the application, in Springboot the @SpringBootApplication notation starts the application
 * and runs it. There will be only one SpringBootApplication class with @SpringBootApplication annotation
 * in the whole application.
 * <p>
 * Although the annotation @SpringBootApplication scan the base package, we have also used the
 * scanBasePackages to make it more precise.
 * The "com.aps.qrc" is the base package which the application starter takes place inside.
 * Another packages are subpackage of "com.asp.qrc"
 */
@SpringBootApplication(scanBasePackages = {"com.aps.qrc"})
public class ApsqrcWebServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApsqrcWebServiceApplication.class, args);
    }

}
