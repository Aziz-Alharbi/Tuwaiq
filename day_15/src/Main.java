public class Main {
    public static void main(String[] args) {


        // 1. Create a Circle with radius 5
        Circle circle = new Circle(5);

        // 2. Create a Rectangle with width 4, height 6
        Rectangle rectangle = new Rectangle(4, 6);

        // 3. Create a Triangle with base 3, height 4
        Triangle triangle = new Triangle(3, 4);





        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Circumference: " + circle.calculateCircumference());

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Circumference: " + rectangle.calculateCircumference());

        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Circumference: " + triangle.calculateCircumference());
    }
}