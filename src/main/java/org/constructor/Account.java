package org.constructor;

import java.time.LocalDateTime;

public class Account {

    int age;
    String name;
    LocalDateTime joining;

    public Account() {
        this.age=10;
        this.name="Prapti";
        this.joining=LocalDateTime.now();
    }

    public Account(int age, String name, LocalDateTime joining) {
        this.age = age;
        this.name = name;
        this.joining = joining;
    }
   public Account(Account bank){
       this.age=bank.age;
       this.name=bank.name;
       this.joining=bank.joining;
   }

    @Override
    public String toString() {
        return "Account{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", joining=" + joining +
                '}';
    }
}
