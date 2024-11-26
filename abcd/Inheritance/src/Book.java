public class Book {

    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;

    private static double discountRate;

    //-----------------------END---------------------------
    public static void setDiscount (double rate)
    {
        discountRate= rate;
    }
    public static double getDiscountRate()
    {
        return discountRate;
    }
    //----------------END-------------------------------

    public Book()
    {

    }
    public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity)
    {
        setIsbn(isbn);
        setBookTitle(bookTitle);
        setAuthorName(authorName);
        setPrice(price);
        setAvailableQuantity(availableQuantity);
    }
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
    public void setBookTitle(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }
    public void setAuthorName(String authorName)
    {
        this.authorName  = authorName;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setAvailableQuantity (int availableQuantity)
    {
        this.availableQuantity = availableQuantity;
    }

    //---------------------------END------------------------
    public String getIsbn()
    {
        return isbn;
    }
    public String getBookTitle()
    {
        return bookTitle;
    }
    public String getAuthorName()
    {
        return authorName;
    }
    public double getPrice()
    {
        return price;
    }
    public int getAvailableQuantity ()
    {
        return availableQuantity;
    }

    //----------------------END--------------------------------
    public void addQuantity(int amount)
    {
        this.availableQuantity += amount;
    }
    public void sellQuantity(int amount)
    {
        this.availableQuantity -= amount;
    }

    //-----------------------END---------------------------
    public void showDetails()
    {
        System.out.println("Book isbn: "+isbn);
        System.out.println("Book Title: "+bookTitle);
        System.out.println("Book author name: "+authorName);
        System.out.println("Book price: "+price);
        System.out.println("Book quantity: "+availableQuantity);
    }

}
