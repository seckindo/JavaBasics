package library;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
		/*
		 * Test Case 1
		 */
		
		KidUsers kid1 = new KidUsers();
		kid1.setAge(10);
		System.out.println(kid1.registerAccount());
		
		kid1.setAge(18);
		System.out.println(kid1.registerAccount());
		
		kid1.setBookType("Kids");
		System.out.println(kid1.requestBook());
		
		kid1.setBookType("Fiction");
		System.out.println(kid1.requestBook());
		
		/*
		 * Test Case 2
		 */
		
		AdultUser adult1 = new AdultUser();
		adult1.setAge(5);
		System.out.println(adult1.registerAccount());
		
		adult1.setAge(23);
		System.out.println(adult1.registerAccount());
		
		adult1.setBookType("Kids");
		System.out.println(adult1.requestBook());
		
		adult1.setBookType("Fiction");
		System.out.println(adult1.requestBook());
		
	}

}

interface LibraryUser {
	String registerAccount();
	String requestBook();
	
}

class KidUsers implements LibraryUser {
	
	int age;
	String bookType;

	@Override
	public String registerAccount() {
		if(age<=11) {
			return "You have succesfully registered under a Kids Account";
		} else
		return "Sorry, Age must be less than 12 to register as a kid" ;
	}

	@Override
	public String requestBook() {
		if (bookType == "Kids") {
			return "Book issued successfully, please return the book within 10 days";
		} else
			return "Oops, you are allowed to take only kids books";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	
}

class AdultUser implements LibraryUser {
	int age;
	String bookType;
	
	@Override
	public String registerAccount() {
		if (age>=12) {
			return "You have successfully registered under an Adult Account";
		} else
		return "Sorry, Age must be greater than 12 to register as an adult";
	}
	@Override
	public String requestBook() {
		if (bookType == "Fiction") {
			return "Book Issued successfully, please return the book within 7 days";
		} else
		return "Oops, you are allowed to take only adult Fiction books";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
}
