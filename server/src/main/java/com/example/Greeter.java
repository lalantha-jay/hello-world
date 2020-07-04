package com.example;
import java.io.*;

/**
 * Greet: Generates a greeting
 */
public class Greeter {

    /**
     * Default constructor with no argument
     */
    public Greeter() {

    }

    /**
     *
     * @return Static greeting
     */
    public String greet() {
        return String.format("Hello Stranger!") ;
    }

    /**
     * Public method returing a greeting
     * @param someone
     * @return string
     */
    public String greet(String someone) {
        return String.format("Hello, %s!", someone);
    }

}
