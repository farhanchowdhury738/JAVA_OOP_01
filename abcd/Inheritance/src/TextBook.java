public class TextBook extends Book{
    private int standard;
    public TextBook()
    {

    }
    public TextBook(String isbn, String bookTitle, String authorName, double  price, int availableQuantity, int standard)
    {
        super(isbn,bookTitle,authorName,price,availableQuantity);
        setStandard(standard);
    }
    public void setStandard (int standard)
    {
        this.standard  = standard;
    }

    //----------------END--------------------------
    public int getStandard()
    {
        return standard;
    }

    //---------------END-------------------
    public void showDetails()
    {
        super.showDetails();
        System.out.println("Book standar: "+standard);
    }
}
