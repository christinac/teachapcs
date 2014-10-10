class Book{
	String title;
	String author;

	Book(String titleFromuser, authorFromuser){
		this.title = titleFromuser;
		this.author = authorFromuser;
	}

	public static void main(String[] args){
		//Make a book - that's your object
		Book b = new Book("Alice in Wonderland", "Lewis Carroll");
	}
}