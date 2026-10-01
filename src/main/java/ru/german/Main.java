package ru.german;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 10.0);
        Triangle triangle = new Triangle(10.0, 10.0, 10.0);
        Circle circle = new Circle(10.0);

        System.out.println(rectangle);
        System.out.println(triangle);
        System.out.println(circle);

        System.out.println("Area rectangle = " + rectangle.getArea());
        System.out.println("Perimeter rectangle = " + rectangle.getPerimeter());

        System.out.println("Area triangle = " + triangle.getArea());
        System.out.println("Perimeter triangle = " + triangle.getPerimeter());

        System.out.println("Area circle = " + circle.getArea());
        System.out.println("Perimeter circle = " + circle.getPerimeter());

        FigureUtil figureUtil = new FigureUtil();

        System.out.println(figureUtil.compareArea(rectangle, triangle));
        System.out.println(figureUtil.comparePerimeter(circle, rectangle));
    }
}