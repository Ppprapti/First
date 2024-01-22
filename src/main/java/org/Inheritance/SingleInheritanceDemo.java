package org.Inheritance;

public class SingleInheritanceDemo {
    void m1() {
        System.out.println("Inside m1 block");
    }
    public static void main (String args[]) {
        SingleInheritanceDemo s1 = new SingleInheritanceDemo();
        s1.m1();
        //here we can access Object class method because every class extend Object class.
        //single inheritance
        System.out.println(s1.hashCode());
        System.out.println(s1.getClass());
    }
}
