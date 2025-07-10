public class Circle extends Shape {

    double radius;


    public Circle(double radius) {
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {

        return Math.PI * radius * radius;
    }

    @Override
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

}
