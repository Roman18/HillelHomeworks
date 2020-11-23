package com.company.Homeworks.Homework2;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point[] points = new Point[10];
        for (int i = 0; i < points.length; i++) {

            System.out.println("--" + (i + 1) + " point--");
            System.out.println("x coordinate");
            double x = sc.nextDouble();
            System.out.println("y coordinate");
            double y = sc.nextDouble();
            points[i] = new Point(x, y);

        }

        System.out.println("Radius of the circle:");
        double radius = sc.nextDouble();
        System.out.println("x coordinate of the circle");
        double xOfCentre = sc.nextDouble();
        System.out.println("y coordinate of the circle");
        double yOfCentre = sc.nextDouble();
        Point point = new Point(xOfCentre, yOfCentre);
        Circle circle = new Circle(point, radius);
        System.out.println("The points which in the circle:");
        for (int i = 0; i < points.length; i++) {
            if (circle.containsPoint(points[i])) {
                System.out.println("x: " + points[i].getX() + ", y: " + points[i].getY());
            }
        }

    }
}
