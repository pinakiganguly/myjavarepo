package Basic_codes;

import java.util.TreeSet;
public class Animal implements Comparable{

int weight;

public Animal(int weight)
{
this.weight=weight;
}

public int compareTo(Object o)
{
Animal a=(Animal)o;
if(weight==a.weight)
{
return 0;
}
else
{
if(weight<a.weight)
{
return -1;
}
else
{
return 1;
}
}

}
public String toString()
{
return "Weight "+weight;
}
public static void main(String args[])
{
Animal dog=new Animal(54);
Animal cat=new Animal(24);
Animal cow=new Animal(102);


TreeSet set=new TreeSet();
set.add(dog);
set.add(cow);
set.add(cat);
System.out.println(set);

}



}
