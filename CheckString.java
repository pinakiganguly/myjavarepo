package Basic_codes;

public class CheckString {
	public void checkstring(String str)throws Stringlen{
		if(str.length()>10) {
			throw new Stringlen(str);
		}
		else {
			System.out.println(str);
		}
	}
	public static void main(String args[]) {
		CheckString cs=new CheckString();
		try {
			cs.checkstring("Lotus plants");
		}
		catch(Stringlen e) {
			System.out.println(e);
		}
	}
}
