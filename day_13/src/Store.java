import java.util.ArrayList;

public class Store {

    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Media> media = new ArrayList<>();


    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Media> getMedia() {
        return media;
    }

    public void setMedia( ArrayList<Media> media) {
        this.media = media;

    }

    public void setUser(ArrayList<User> users) {
        this.users = users;
    }





    public void addUser(User user){
        this.users.add(user);

    }


    public ArrayList<User> displayUsers(){

        return users;
    }


    public void addMedia(Media media){

        this.media.add(media);

    }


    public ArrayList<Media> displayMedias(){

        return media;
    }


    public Book searchBook(String title){

        for (Media m : media) {
            if (m instanceof Book && m.getTitle().equalsIgnoreCase(title)) {
                return (Book) m;
            }
        }
        return null; // if not found
    }












}
