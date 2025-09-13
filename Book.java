package bookmanagement;

public abstract class Book implements IBook {
    protected String id;
    protected String title;
    protected double basePrice;

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public boolean updateBookById(String id) {
        if (this.id.equals(id)) {
            
            System.out.println("Book with ID " + id + " updated.");
            return true;
        }
        return false;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Base Price: " + basePrice);
    }

   
    public abstract double calculatePrice();
}
