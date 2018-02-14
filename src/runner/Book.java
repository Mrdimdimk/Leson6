package runner;

public class Book {
	private String title;
	private int year;
	private Author[] authors;
	private int authorCounter;

	public Book() {

	}

	public Book(String title, int year) {
		this.title = title;
		this.year = year;
	}

	public void setAuthors(Author[] authors) {
		if (authors != null) {
			this.authors = authors;
		}
	}

	public Author[] getAuthors() {
		return this.authors;
	}

	public void addAuthor(Author author) {
		if (this.authors != null) {
			if (authorCounter < authors.length) {
  authors[authorCounter] = author;
  authorCounter++;
			}
			else{ Author [] authors = new Author[this.authors.length + 10]; // расширяем массив на 10 элементов
			
			for (int i =0; i< this.authors.length; i++)
			{
				authors[i]=this.authors[i]; // присваимаем значения  старого массива новому
			}		
			this.authors = authors; // присваием значения 
			this.authors[authorCounter] = author;
			authorCounter++;
			}
		} else {
			this.authors = new Author[10];
			this.authors[authorCounter] = author;
			authorCounter++;

		}

		this.authors[0] = author;

	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;

	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return this.year;
	}

}
