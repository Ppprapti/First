package org.constructor;

public class Parent {
    String name;
    Parent(){
        System.out.println("In Parent Class Default Constructor");
    }

    Parent (String name){
        this.name = name;
        System.out.println("In Parent Class Parameterized Constructor" + name);

    }
}
