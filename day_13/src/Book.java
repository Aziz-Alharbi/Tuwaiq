import java.util.ArrayList;

public class Book extends Media {

    private int stock;
    private ArrayList<Review> review = new ArrayList<>();

    public Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
    }

    public void addReview(Review r) {
        review.add(r);
    }

    public double getAverageRating() {
        if (review.isEmpty()) return 0.0;

        int total = 0;
        for (Review r : review) {
            total += r.getRating(); // You must create a getRating() method in Review
        }
        return (double) total / review.size();
    }

    public void purchase(User user) {
        if (stock > 0) {
            user.addPurchasedMedia(this); // You must define this method in User class
            stock--;
        }
    }

    public boolean isBestSeller() {
        return getAverageRating() >= 4.5;
    }

    public void restock(int quantity) {
        stock += quantity;
        System.out.println("Book restocked. New stock: " + stock);
    }

    @Override
    public String getMediaType() {
        return isBestSeller() ? "Bestselling Book" : "Book";
    }

    @Override
    public String toString() {
        return "Book{" +
                "stock=" + stock +
                ", reviews=" + review +
                "} " + super.toString();
    }
}
