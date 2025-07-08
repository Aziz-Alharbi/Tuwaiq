public class AcademicBook extends Book {

    private String subject;

    public AcademicBook(String title, String auteur, String ISBN, double price, int stock, String subject) {
        super(title, auteur, ISBN, price, stock);
        this.subject = subject;
    }

    @Override
    public String getMediaType() {
        return isBestSeller() ? "Bestselling AcademicBook" : "AcademicBook";
    }

    @Override
    public String toString() {
        return "AcademicBook{" +
                "subject='" + subject + '\'' +
                "} " + super.toString();
    }
}
