package com.gnrakn.java8;

public class RunnableExampleWithLambda {

    public static void main(String[] args) {

        //traditional Runnable using
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("T1");
            }
        };
        new Thread(runnable).start();

        //using Runnable with lambda
        Runnable runnableWithLambda = () -> {
            System.out.println("T2");
        };
        new Thread(runnableWithLambda).start();

        //using Thread with lambda
        new Thread(() -> System.out.println("T3")).start();

        //or
        new Thread(() -> {
            System.out.println("T4");
        }).start();
    }
}
