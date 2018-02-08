package edu.spring.boot;

import org.springframework.boot.CommandLineRunner;

//@Component
public class MyCommandLineRunner implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        System.out.println("These are the arguments used to start the app:");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
