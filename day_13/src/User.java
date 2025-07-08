import java.util.ArrayList;

public class User {

    private String username;
    private String email;
    private ArrayList<Media> purchaseMediaList;
    private ArrayList<Media> shoppingCart;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.purchaseMediaList = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }

    public void addToCart(Media media) {
        if (media == null) {
            System.out.println("Media is empty");
        } else {
            shoppingCart.add(media);
            System.out.println("Media is added to cart");
        }
    }

    public void removeFromCart(Media media) {
        if (shoppingCart.contains(media)) {
            shoppingCart.remove(media);
            System.out.println("Media has been removed");
        } else {
            System.out.println("Item not found!");
        }
    }

    public void checkout() {
        if (shoppingCart.isEmpty()) {
            System.out.println("Shopping cart is empty!");
        } else {
            for (Media m : shoppingCart) {
                purchaseMediaList.add(m);
                if (m instanceof Book) {
                    ((Book) m).restock(-1);
                }
            }
            shoppingCart.clear();
            System.out.println("Checked out...");
        }
    }

    public void addPurchasedMedia(Media media) {
        purchaseMediaList.add(media);
    }

    public String getUsername() {
        return username;
    }

    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }
}
