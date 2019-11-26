import java.util.Scanner;
import java.util.ArrayList;

public class BookMain{
    public static void main(String[] args){
	
	ArrayList<Book> listOfBooks = new ArrayList<Book>();
	listOfBooks.add(new Book("The Stand", "Stephen King"));
	listOfBooks.add(new Book("Djurkyrkogården","Stephen King"));
	listOfBooks.add(new Book("Mangeln","Stephen King"));
	listOfBooks.add(new Book("Fåglarna"));


	for (int i = 0; i < listOfBooks.size(); i++){
	    System.out.println(listOfBooks.get(i).toString());	    
	}

	System.out.println("Total nr of books:" + listOfBooks.get(0).getNumberOfBooks());
	
    }
}
