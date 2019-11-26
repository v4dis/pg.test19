public class Book{
    private String author;
    private String title;
    private static int numberOfBooks;
	
    public Book(String t, String a){
	title = t;
	author = a;
	numberOfBooks++;
    }

    public Book(String t){
	this(t, "No Author");
    }

    public String getAuthor(){
	return author;
    }

    public String getTitle(){
	return title;
    }

    public void setAuthor(String a){
	author = a;
    }

    public void setTitle(String t){
	title = t;
    }

    public int getNumberOfBooks(){
	return numberOfBooks;
    }

    public String toString(){
	return title + " - " + author;
    }
}
