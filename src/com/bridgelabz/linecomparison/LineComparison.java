package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    int x1, x2, y1, y2;
    Scanner scanner = new Scanner(System.in);

    public void welcome() {
        System.out.println("......Welcome to Line Comparison Computation Program... ");
    }

    public void lengthOfLine() {
        System.out.println("Enter Cartesian Co-ordinates");
        System.out.println("Enter x1 ");
        x1 = scanner.nextInt();
        System.out.println("Enter x2 ");
        x2 = scanner.nextInt();
        System.out.println("Enter y1 ");
        y1 = scanner.nextInt();
        System.out.println("Enter y2 ");
        y2 = scanner.nextInt();
        System.out.println("Length of the line:" + (Math.sqrt(Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2)));

    }

    public static void main(String[] args) {
        // welcome() method is not static so call by creating a object
        LineComparison lineMethods = new LineComparison();
        lineMethods.welcome();
        lineMethods.lengthOfLine();

    }
}
