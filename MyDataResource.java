package Basic_codes;

	public class MyDataResource implements AutoCloseable {



		String[] myarray=new String[5];
		@Override
		public void close() throws Exception {

		myarray=null;
		System.out.println("array is null ,closed");



		}
		public void setArray(String[] arr)
		{
		myarray=arr;
		}
		public String[] getArray()
		{
		return myarray;
		}



}

