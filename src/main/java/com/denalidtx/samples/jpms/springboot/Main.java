/*
 * This software has been provided to provide sample code and to aid
 * the software engineering community. It is published under the MIT
 * license. You are welcome to use the code, but please do not take
 * credit for my work.
 *
 * Author: DenalidTX
 * Twitter: @DenalidTX
 * Twitch: https://www.twitch.tv/denalidtx
 */
package com.denalidtx.samples.jpms.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is a standard Spring Boot application class. It is fairly common
 * to make the main Spring Boot class also contain the main() method, but
 * this is not required. What is required is to start the Spring Boot
 * application during the main() method execution.
 */
@SpringBootApplication
public class Main
{
    /**
     * Constructor. This is primarily here to prove that the application
     * is, in fact, running. The application will print "Hello World"
     * and exit.
     */
    public Main()
    {
        System.out.println("Hello, World!");
    }

    /**
     * Standard main method, which starts the Spring Boot application.
     *
     * @param args Command-line arguments. Not used by this application.
     */
    public static void main(String[] args)
    {
        SpringApplication.run(Main.class, args);
    }
}
