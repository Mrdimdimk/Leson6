package runner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainApp {

	public static void main(String[] args) throws ParseException {

		Date date0 = null;
		Date date1 = null;
		Date date2 = null;
		Date date3 = null;
		Date date4 = null;

		SimpleDateFormat daformat = new SimpleDateFormat("dd-MM-yyyy"); // дата
																		// это
																		// объект
																		// SimpleDateFormat
																		// из
																		// пакета
																		// text
																		// //
																		// try {
		date0 = daformat.parse("13-01-2001");
		date1 = daformat.parse("23-09-1903");
		date2 = daformat.parse("13-02-2001");
		date3 = daformat.parse("23-05-1903");
		date4 = daformat.parse("03-05-1903");
		// метод parse
		// } catch (ParseException e) {
		// e.printStackTrace();
		// }

		Author auth0 = new Author("NameAuthor0", "SurnameNameAuthor0", date0);
		Author auth1 = new Author("NameAuthor1", "SurnameNameAuthor1", date1);
		Author auth2 = new Author("NameAuthor2", "SurnameNameAuthor2", date2);
		Author auth3 = new Author("NameAuthor3", "SurnameNameAuthor3", date3);
		Author auth4 = new Author("NameAuthor4", "SurnameNameAuthor4", date4);
		
		
		Book book0 = new Book("Book0", 2006);
		Book book1 = new Book("Book1", 2006);
		Book book2 = new Book("Book2", 2006);
		Book book3 = new Book("Book3", 2006);
		Book book4 = new Book("Book4", 2006);
		
		
		Author[] authors = new Author[]{auth0,auth1};
		book0.setAuthors(authors); // нужен комментарий
		
		book2.addAuthor(auth4);
		book2.addAuthor(auth3);
		book2.addAuthor(auth2);
		book2.addAuthor(auth1);
		book2.addAuthor(auth0);
		
		System.out.println();
		
		//book1.author= new Author[]{auth0,auth1};  // прямой доступ к состоянию 
		
	}

}
