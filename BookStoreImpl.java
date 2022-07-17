package com.jap.bookstore;

public class BookStoreImpl {
    public static void main(String[] args) {
        // Declare and initialize author, book and bookstore objects
 
        BookStoreImpl obj =new BookStoreImpl();

		Author obj1=new Author("Dchello","Sword"); //calling class Author

		Book obj2=new Book(1234,"Hello",obj1,"Fiction",90);  ////calling class Book
        
		Book [] list = new Book[1];  //creating array of object of class

		list[0]=obj2;  // array list of index0 is equal to object of class Book

		Bookstore obj3=new Bookstore("Just read","JR123",list);   //calling class Bookstore
		

    
        //Display book details before discount is calculated
        System.out.println("The book details before discount : ");

		System.out.println(obj2); // showing details by printing object toString method


        //Calculate discount on the books by calling the methods
	    obj3.calculateDiscount(obj2, 25.0f);


        //Display book details after discount is calculated
        System.out.println("The book details after discount : ");

		System.out.println(obj3);
	
        }
}
