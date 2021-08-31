package com.bridgelabz.linecomparison;

public class LineComparison {
    public void welcome() {
        System.out.println("......Welcome to Line Comparison Computation Program... ");
    }

    public static void main(String[] args) {
        // welcome() method is not static so call by creating a object
        LineComparison welcome = new LineComparison();
        welcome.welcome();
    }
}
