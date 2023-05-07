package com.com.aryan;

public class App {

    public static void main(String[] args) {
        new App().print();
    }

    public void print() {
        new com.uber.PrettyPrint().print("Aryna");
    }

    public int sum(int first, int second) {
        return first*second;
    }
}
