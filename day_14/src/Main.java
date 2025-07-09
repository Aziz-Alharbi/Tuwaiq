public class Main {
    public static void main(String[] args) {



        final String name = "Aziz";

        Animal a1 = new Dog();
        Animal a2 = new Cat();

      //  Animal a3 = new Animal();

       // System.out.println(name);


//        a1.makeSound(); // Woof!
//        a2.makeSound(); // Meow!
//        a1.sleep();// Sleeping...


        Flyable f1 = new Bird();
        Flyable f2 = new Airplane();

//        f1.fly(); // Bird flies using wings.
//        f2.fly(); // Airplane flies using engines.


        Book b = new Book("Java Basics", 100.0, "John");
        System.out.println(b.getDiscount()); // 10.0

        Movie m = new Movie("Avengers", 150.0, "Russo");
        System.out.println(m.getDiscount()); // 30.0


        MovablePoint mp = new MovablePoint(6 , 7, 8, 9);
        mp.moveDown();
    }
}