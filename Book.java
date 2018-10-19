/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Willen O. Leal
 * @version 10/18/2018
 */
class Book
{
    private String author;
    private String title;
    private int pages;
    private String refNumber = "";
    private int borrowed = 0;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isItCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        courseText = isItCourseText;
    }
    
    public void printAuthor()
    {
        System.out.print(author);
    }
    
    public void printTitle()
    {
        System.out.print(title);
    }
    
    public void setPages(int newPage)
    {
        pages = newPage;
    }
    
    public void setAuthor(String newAuthor)
    {
        author = newAuthor;
    }
    
    public void setCourseText(boolean isItCourseText)
    {
        courseText = isItCourseText;
    
    }
    
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    
    }
    
    public boolean getCourseText()
    {
        return courseText;
    
    }
    
    public void printDetails()
    {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("# Pages: " + pages);
        System.out.println("Number of Books Borrowed: " + borrowed);
    }
    
    public void printDetailsV2()
    {
        if(refNumber.length() > 0)
        {
            System.out.println("Author: " + author);
            System.out.println("Title: " + title);
            System.out.println("# Pages: " + pages);
            System.out.println("Number of Books Borrowed: " + borrowed);
            System.out.println("Reference Number: " + refNumber);
        }
        else
        {
           System.out.println("Author: " + author);
           System.out.println("Title: " + title);
           System.out.println("# Pages: " + pages);
           System.out.println("Number of Books Borrowed: " + borrowed);
           System.out.println("Reference Number: ZZZ");  
        
        }
    
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
    
    public boolean isCourseText(){
        return courseText; 
    }
    
}
