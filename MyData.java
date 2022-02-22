package Basic_codes;

public class MyData<T> {



T t;

public void setData(T t)
{
this.t=t;
}
public T getData()
{
return t;
}

public static void main(String[] args) {

MyData<String> str=new MyData<String>();
MyData<Integer> number=new MyData<Integer>();
str.setData("Hello World");
number.setData(100);
System.out.println(str.getData());
System.out.println(number.getData());
// TODO Auto-generated method stub



}



}