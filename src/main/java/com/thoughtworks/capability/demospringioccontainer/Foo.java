package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Foo {

    private Bar bar;

    private String message = "Hi!";

    @Autowired
    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public String getMessage(){
        return message;
    }

    public void hi() {
        System.out.println("Hi, " + bar.name());
    }

    public String name() {
        return "Foo";
    }
}
