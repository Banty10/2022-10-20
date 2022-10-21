package com.java.excrcise2;

import java.awt.print.Book;

public class booktesting {
	
	public static void main(String[] args) {

		//Create 5 book objects
		Book Book1 = new Book1("Letus C");
		Book Book2 = new Book2("Digital Computer");
		Book Book3 = new Book3("Math");
		Book Book4 = new Book4("Basic Computer");
		Book Book5 = new Book5("Operating System");
		
		//Store all books details in books array
		Book books[] = {Book1,Book2,Book3,Book4,Book5};
		
		
		//Find book By Id
		try {
			if(findById(Books,10)) {
				System.out.println("Book is present");
			}
			else{
				throw new BookNotFoundException("Book with the given id is not present");
			}
		}catch(BookNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//Function for search book
	public static boolean findById(Book[] books , int id) {
		for(Book b:books) {
			if(((Object) b).getId()==id);
			return true;
		}
		return false;
	}
}

