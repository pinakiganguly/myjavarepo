package Basic_codes;

public class ArrayDemo {
	public static void main(String[] args) {
		try(MyDataResource res=new MyDataResource())
		{
		res.setArray(new String[] {"Parrot","Pigeon","Peacock"});
		String[] arr=res.getArray();
		for(String s:arr)
		{
		System.out.println(s);
		}

		}
		catch(Exception e)
		{
		System.out.println(e);
		}



		}
}
