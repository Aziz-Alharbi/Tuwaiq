public class Main {
    public static void main(String[] args) {




        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5, "red", true);
        Circle c3 = new Circle(4.0, "blue", false);
        Circle c4 = new Circle(1.2, "yellow", true);
        Circle c5 = new Circle(3.3, "black", false);

        // Rectangle objects
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(true, "green", 4.0, 2.0);
        Rectangle r3 = new Rectangle(true, "red", 6.5, 3.5);
        Rectangle r4 = new Rectangle(true, "blue", 5.0, 5.0);
        Rectangle r5 = new Rectangle(true, "purple", 7.0, 2.0);

        // Square objects
        Square s1 = new Square();
        Square s2 = new Square(3.0);
        Square s3 = new Square(4.0, 4.0, "red", true);
        Square s4 = new Square(2.5, 2.5, "gray", false);
        Square s5 = new Square(5.0, 5.0, "blue", true);

        // Optionally print them
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);




    }





}