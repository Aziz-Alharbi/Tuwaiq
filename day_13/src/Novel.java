public class Novel extends Book {

    private String genre;

    public Novel(String title, String auteur, String ISBN, double price, int stock, String genre) {
        super(title, auteur, ISBN, price, stock);
        this.genre = genre;
    }

    @Override
    public String getMediaType() {
        return isBestSeller() ? "Bestselling Novel" : "Novel";
    }

    @Override
    public String toString() {
        return "Novel{" +
                "genre='" + genre + '\'' +
                "} " + super.toString();
    }
}
