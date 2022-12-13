package stringexception;

public  class MyException extends Exception {
	
	String str;

	public MyException(String str) {
		super(str);
		this.str = str;
		
	}

	@Override
	public String toString() {
		return str;
	}

}
