public class Rectangle extends Shape {

    private double width;
    private double height;



    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;

    }


    public void setWidth(double width){

        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }



    @Override
    double calculateArea() {
        return height * width;
    }

    @Override
    double calculateCircumference() {
        return 2 * (height + width);
    }

}
