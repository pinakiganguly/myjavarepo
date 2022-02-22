package Basic_codes;

public class Candidate  extends Exception{
	public void checkAge(int age) throws AgeException
	{
	if(age<18)
	{
	throw new AgeException(age);
	}
	}
	public static void main(String args[])
	{
	Candidate obj=new Candidate();
	try {
	obj.checkAge(15);

	}
	catch(AgeException e)
	{
	System.out.println(e);
	}
	}


}


