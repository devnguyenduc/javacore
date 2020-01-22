package com.company;

import company.collections.compose.Compose;

public class Main {

    public static void main(String[] args) {
        Compose cp = new Compose();
        cp.cpint.set(3L);
        cp.cpcomplex.set(cp.cpint, cp.cpint);
        System.out.println(cp.cpint.value);
        System.out.println(cp.cpcomplex.re);
        System.out.println(cp.cpcomplex.toString());
    }
}