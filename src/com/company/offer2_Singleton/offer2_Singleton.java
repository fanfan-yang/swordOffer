package com.company.offer2_Singleton;

public class offer2_Singleton {
    offer2_Singleton() {}

    public static offer2_Singleton Instance() {
        return Nested.instance;
    }

    static class Nested {
        Nested(){
        }
        static offer2_Singleton instance = new offer2_Singleton();
    }

}
