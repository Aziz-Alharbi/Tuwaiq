public class Main {
    public static void main(String[] args) {

        // Create store
        Store store = new Store();

        // Create users
        User user1 = new User("aziz", "aziz@email.com");
        store.addUser(user1);

        // Create media
        Book book1 = new Book("Java Basics", "John Doe", "123ABC", 50.0, 5);
        Movie movie1 = new Movie("Epic Film", "Jane Director", "MOV456", 20.0, 130);
        Music music1 = new Music("Chill Beats", "DJ Cool", "MUS789", 9.99, "DJ Cool");

        // Add media to store
        store.addMedia(book1);
        store.addMedia(movie1);
        store.addMedia(music1);

        // User adds items to cart
        user1.addToCart(book1);
        user1.addToCart(movie1);

        // Checkout
        user1.checkout();

        // Leave review
        Review r1 = new Review("aziz", 5, "Great book!");
        book1.addReview(r1);

        // Print average rating
        System.out.println("Avg Rating: " + book1.getAverageRating());

        // Display store media
        System.out.println("Store Media: " + store.displayMedias());
    }





}