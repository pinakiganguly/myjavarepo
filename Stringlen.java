package Basic_codes;

public class Stringlen extends Exception{
	private String message;
	public Stringlen(String str) {
		
		this.message="Invalid String for size : "+str.length();
	}
	public String toString() {
		return this.message;
	}
}
