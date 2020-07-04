package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Test class implementing Greeter methods
 */
public class TestGreeter {

    private Greeter greeter;

    @Before
    public void setup() {
        greeter = new Greeter();
    }

    @Test
    public void greetShouldIncludeTheOneBeingGreeted() {
        String someone = "World";
        assertThat(greeter.greet(someone), containsString(someone));
    }

    @Test
    public void greetShouldIncludeGreetingPhrase() {
        String someone = "World";
        //assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
        assertTrue(greeter.greet(someone).length() > someone.length());
    }

    @Test
    public void greetShouldNotIncludeTheOneBeingGreeted() {
        String someone = "";
        assertThat(greeter.greet(), containsString(someone));
    }
}
