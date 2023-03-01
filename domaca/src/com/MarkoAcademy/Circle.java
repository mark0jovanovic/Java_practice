package com.MarkoAcademy;

import java.awt.*;

public class Circle {
    Point center;
    double radius;
    
    Circle() {}
    Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }
    double getParameter(){
        return  2  * Math.PI * this.radius;
    }
    double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    void setCenter(Point center) {
        this.center = center;
    }
    void setRadius(double radius) {
        this.radius = radius;
    }
}
