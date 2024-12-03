package com.perscholas.java.glab303102;

public class myRunner {
    public static void main(String[] args) {
        Circle c = new Circle(100);
        System.out.println("Area of Circle " + c.getArea());
        Shape sObj = new Shape();
        sObj.displayShapeName();
        System.out.println(sObj instanceof Shape);

        System.out.println("++++++++");
        Shape shapeCircleObj = new Circle(100);
        shapeCircleObj.displayShapeName();
        System.out.println("Area of Circle " + shapeCircleObj.getArea());
        System.out.println(shapeCircleObj);
        System.out.println(shapeCircleObj instanceof Circle);
        System.out.println(sObj instanceof Circle);

        System.out.println("--------------------");
        Shape shapeRectangleObj = new Rectangle("Red");
        shapeRectangleObj.displayShapeName();
        shapeRectangleObj.setHeight(2);
        shapeRectangleObj.setWidth(2);
        System.out.println("Area of Rectangle is " + shapeRectangleObj.getArea());
        System.out.println(shapeRectangleObj);
        System.out.println(shapeRectangleObj instanceof Rectangle);
        System.out.println(sObj instanceof Rectangle);

        System.out.println("--------------------");
        Shape shapeTriangleObj = new Triangle("Blue");
        shapeTriangleObj.displayShapeName();
        shapeTriangleObj.setHeight(2);
        shapeTriangleObj.setBase(3);
        System.out.println("Area of Triangle is " + shapeTriangleObj.getArea());
        System.out.println(shapeTriangleObj);
        System.out.println(shapeTriangleObj instanceof Triangle);
        System.out.println(sObj instanceof Triangle);
        System.out.println("--------------------");

        Cylinder cylinderShape = new Cylinder(3);
        cylinderShape.displayShapeName();
        cylinderShape.setHeight(3);
        System.out.println("Area of Cylinder is " + cylinderShape.getVolume());
        System.out.println(cylinderShape);
    }
}