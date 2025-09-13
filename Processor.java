package bookmanagement;

public class Processor {
   public static void main(String[] args) {
       BookList bookList = new BookList();

       TextBook tb1 = new TextBook("T001", "Java Basics", 50, "Computer Science");
       TextBook tb2 = new TextBook("T002", "Calculus I", 40, "Mathematics");

       ReferenceBook rb1 = new ReferenceBook("R001","Encyclopedia",100,"Oxford");
       ReferenceBook rb2 = new ReferenceBook("R002","Dictionary",70,"Cambridge");

       bookList.addBook(tb1);
       bookList.addBook(tb2);
       bookList.addBook(rb1);
       bookList.addBook(rb2);

       System.out.println("Display All Books:");
       bookList.displayAllBooks();

       System.out.println("Most Expensive Book:");
       Book max = bookList.findMostExpensiveBook();
       if (max != null) max.displayDetails();

       System.out.println("\n=== Find Book by ID (T002) ===");
       Book found = bookList.findBookById("T002");
       if (found != null) found.displayDetails();

       System.out.println("\n=== Delete Book (R001) ===");
       if (bookList.deleteBookById("R001")) {
           System.out.println("Deleted successfully!");
       } else {
           System.out.println("Delete failed!");
       }

       System.out.println("\n=== Books After Deletion ===");
       bookList.displayAllBooks();

       bookList.countBooks();
   }
}
