public class Circle extends Shape {

    private double radius;

    public Circle() {

        this.radius = 1.0;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    public double getArea(double radius){

        return Math.PI * radius * radius;
    }

    public double getPerimeter (double radius){

        return 2 * Math.PI * radius;
    }


    @Override
    public String toString(){
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }

}
