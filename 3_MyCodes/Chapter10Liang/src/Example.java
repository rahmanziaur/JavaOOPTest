//package com.tt;
import java.io.PrintStream;


import static java.lang.System.err;
//import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {
        PrintStream out = System.out;
        out.println("hello world!");
        err.println("jjjj");
        out.printf("\nAjsjjs");
    }
}
//jar xf rt.jar
//jar cf mm.jar src