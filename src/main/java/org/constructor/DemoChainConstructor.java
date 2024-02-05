package org.constructor;

public class DemoChainConstructor extends Parent {
    String name;

    DemoChainConstructor() {
        System.out.println("In Child Class Default Constructor");
    }

    public DemoChainConstructor(String name) {
        super("Prapti");
        this.name = name;
        System.out.println("In Child Class Parameterized Constructor" + name);
    }

    public static void main(String args[]) {

        DemoChainConstructor demoChainConstructor = new DemoChainConstructor();
        DemoChainConstructor demoChainConstructor2 = new DemoChainConstructor("Sana");

    }
}
