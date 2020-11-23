package com.company.Homeworks.Homework2;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean containsPoint(Point p) {
        double d = Math.sqrt((p.getX() - center.getX()) + (p.getY() - center.getY()));
        return  d<radius;
    }
}
