package com.java.excrcise2;

public class BookClass {
		
		private int id;
		private String name;
		
		//Constructor of Book
		public BookClass(int id , String name) {
			this.id = id;
			this.name = name;
		}
		
		//getter and setter of id
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		//getter and setter of name
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String toString() {
			return "Book[id : " + id + " name : " + name + " ]" ;
			
		}
		

}
