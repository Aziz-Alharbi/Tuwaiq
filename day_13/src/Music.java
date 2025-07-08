import java.util.ArrayList;

public class Music extends Media {

    private String artist;

    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    public void listen(User user) {
        user.addPurchasedMedia(this);
    }

    public ArrayList<Music> generatePlaylist(ArrayList<Music> musicCatalog) {
        ArrayList<Music> playlist = new ArrayList<>();
        for (Music m : musicCatalog) {
            if (m.getAuteur().equalsIgnoreCase(this.getAuteur()) && !m.equals(this)) {
                playlist.add(m);
            }
        }
        return playlist;
    }

    @Override
    public String getMediaType() {
        return getPrice() >= 10 ? "Premium Music" : "Music";
    }

    @Override
    public String toString() {
        return "Music{" +
                "artist='" + artist + '\'' +
                "} " + super.toString();
    }
}
