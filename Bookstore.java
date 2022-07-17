package com.jap.bookstore;

public class Bookstore {

    String bookStoreName;
    String bookStoreRegistrationId;
    Book[] books;
	//Book books;
    // Declare a parameterized constructor to initialize values
    public Bookstore(String bookStoreName, String bookStoreRegistrationId, Book[] books) {   //Book[] books

		this.bookStoreName=bookStoreName;
		this.bookStoreRegistrationId=bookStoreRegistrationId;
		this.books=books;

    } 
    // Function to calculate the discount for a genre of books
    public float calculateDiscount(Book book,float discountPercentage)
    {
	 
	    if (book.genre.equalsIgnoreCase("Fiction"))
		{
			book.price=book.price-book.price*discountPercentage/100;
		}	
		else
		{
	         book.price=book.price;
		}
    
	       return book.price;
    }
}

 