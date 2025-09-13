package bookmanagement;

import java.util.ArrayList;

public class BookList {
    private ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("Book added successfully!\n");
    }

    public boolean updateBookById(String id) {
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                return book.updateBookById(id); 
            }
        }
        return false;
    }

    public boolean deleteBookById(String id) {
        return bookList.removeIf(book -> book.getId().equals(id));
    }

    public Book findBookById(String id) {
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No books in the list.");
            return;
        }
        for (Book book : bookList) {
            book.displayDetails();
            System.out.println("------------------");
        }
    }

    public Book findMostExpensiveBook() {
        if (bookList.isEmpty()) return null;
        Book maxBook = bookList.get(0);
        for (Book book : bookList) {
            if (book.calculatePrice() > maxBook.calculatePrice()) {
                maxBook = book;
            }
        }
        return maxBook;
    }

    public int countBooks() {
        return bookList.size();
    }
}
