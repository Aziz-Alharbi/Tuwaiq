
public class Triangle extends Shape {

    private double base;
    private double height;


    public Triangle(){

    }

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }




    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    @Override
    double calculateArea() {
        return (base * height) / 2;

    }

    @Override
    double calculateCircumference() {
        return 3 * base;
    }




}
