package Basic_codes;

public class data<DATA> {
	DATA D;
	
	public void setValue(DATA D) {
		this.D=D;
	}
	public DATA getValue() {
		return D;
	}
	public static void main(String args[]) {
		data<String> d=new data<String>();
		data<Integer>d1=new data<Integer>();
		d.setValue("India");
		d1.setValue(985);
		System.out.println(d1.getValue());
		System.out.println(d.getValue());
	}
}
