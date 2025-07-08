import java.util.ArrayList;

public class Movie extends Media {

    private int duration;

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public void watch(User user) {
        user.addPurchasedMedia(this);
    }

    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movieCatalog) {
        ArrayList<Movie> similar = new ArrayList<>();
        for (Movie m : movieCatalog) {
            if (m.getAuteur().equalsIgnoreCase(this.getAuteur()) && !m.equals(this)) {
                similar.add(m);
            }
        }
        return similar;
    }

    @Override
    public String getMediaType() {
        return duration >= 120 ? "Long Movie" : "Movie";
    }

    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                "} " + super.toString();
    }
}
