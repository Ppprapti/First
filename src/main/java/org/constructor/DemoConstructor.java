package org.constructor;

import java.time.LocalDateTime;

public class DemoConstructor {
    public static void main (String args[]){
        Account ac= new Account();
        System.out.println(ac);
        Account ac1= new Account(20,"Sana", LocalDateTime.now());
        System.out.println(ac1);

        //copy constructor
        Account ac2 = new Account(ac1);
        System.out.println(ac2);

    }
}
