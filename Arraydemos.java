package Basic_codes;
public class Arraydemos {
	public void sumArray(int... arr) {
		int sum=0;
		for(int i : arr) {
			sum+=i;
		}
		System.out.println(sum);
	}
	public static void main(String args[]) {
		Arraydemos obj=new Arraydemos();
		obj.sumArray(12,11,23,19,55,17);
	}
	
}

