public class Rectangle extends Shape {

    private double width = 1.0;

    private double length = 1.0;

    public Rectangle(){

    }


    public Rectangle(double width, double length){



    }

    public Rectangle(boolean filled, String color ,double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }






    public void setWidth(double width){

        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    public void setLength(double length){

        this.length = length;

    }

    public double getLength(){
        return length;
    }



    public double getArea(double length, double width){

        return length * width;
    }

    public double getPerimeter (double length, double width){

        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "A Rectangle with a radius=" + width + " and length=" + length +
                ", which is a subclass of " + super.toString();
    }


}
