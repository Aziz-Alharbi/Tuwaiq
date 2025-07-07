
public class Square extends Rectangle {


    public Square(){

    }

    public Square(double side){

    }



    public Square(double length, double width, String color, boolean filled){
        super(filled, color, length, width);

    }

    public void setSide (double side){
        setWidth(side);
        setLength(side);
    }


    public double getSide(){
        return getWidth();
    }



    @Override
    public String toString(){
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }


}
