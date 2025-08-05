class Book {
    
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalNoOfBooks =0;
    }
    {
        totalNoOfBooks++;
    }
    
    Book(String title , String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(String isbn){
        this("Unknown", "Unknown",isbn);

    }

    static int getstotalNoOfBooks(){
        return totalNoOfBooks;
    }

    void borrowBook(){
        if (isBorrowed) {
            System.out.println("Book is already Borrowed");
        } else{
            this.isBorrowed = true;
            System.out.println("you Borrowed Book ,Now " + this.title);
        }
    }

    void returnBook(){
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hpoe you Enjoy the Book , Please leave a Review");
        } else{
            System.out.println(this.title  +" This book is Already in Library");

        }
    }
    public static void main(String[] args) {
        Book myBook = new Book("DB","jecob","2");
        Book newBook = new Book("2");
        System.out.println(getstotalNoOfBooks());   
        myBook.borrowBook();
        newBook.borrowBook();
        newBook.borrowBook();
        newBook.returnBook();
        newBook.returnBook();
        myBook.returnBook();
        myBook.borrowBook(); 
    }

}
