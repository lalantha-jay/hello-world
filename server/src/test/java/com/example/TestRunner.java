package com.example;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {

    public static void main(String[] args) {

        JUnitCore runner = new JUnitCore();
        runner.addListener(new TestExecListener());

        /**
        Result result = runner.runClasses(TestGreeter.class);
        Result result = JUnitCore.runClasses(TestGreeter.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        */

        System.out.println("Testing Greeting Package");
        System.out.println("------------------------");
        runner.run(TestGreeter.class);

        //System.out.println(result.wasSuccessful());
        System.out.println("*** END OF TEST RUN ***");
    }
}
