package Basic_codes;

public class AgeException extends Exception{
	private String message;
	public AgeException(int age)
	{
		super("Invalid Age Exception age cannot be : "+age );
		this.message="Invalid age for "+age;
	}
	public String toString()
	{
	return this.message;
	}
}
