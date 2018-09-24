/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber = "";
    private int borrowed = 0;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }
    
    public void printAuthor()
    {
        System.out.print(author);
    }
    
    public void printTitle()
    {
        System.out.print(title);
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public void printDetails()
    {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("# Pages" + pages);
        System.out.println("Number of Books Borrowed" + borrowed);
    }
    
    public void setRefNumber(String ref)
    {
        
        if (ref.length() > 3)
        {
            refNumber = ref;
        }
        else
        {
            System.out.print("Error!!! Must be greate than 3 digits");
        }
    }
    
    public void borrow(){
        borrowed++;
    }
    
    public int getBorrowed(){
        return borrowed;
    }
    
    

    // Add the methods here ...
}
