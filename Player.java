package Basic_codes;

import java.util.Comparator;
import java.util.TreeSet;
public class Player {

float height;
float weight;

public Player(float height ,float weight)
{
this.height=height;
this.weight=weight;

}
public String toString()
{
return "Height "+height +" Weight "+weight;
}
public static void main(String args[])
{
Player player1=new Player(4.5f,55.89f);
Player player2=new Player(4.5f,56.93f);
Player player3=new Player(5.2f,56.93f);
Player player4=new Player(4.8f,54.2f);

TreeSet setbyheight=new TreeSet(new CompareByHeight());
setbyheight.add(player1);
setbyheight.add(player2);
setbyheight.add(player3);
setbyheight.add(player4);
System.out.println(setbyheight);

TreeSet setbyweight=new TreeSet(new CompareByWeight());
setbyweight.add(player1);
setbyweight.add(player2);
setbyweight.add(player3);
setbyweight.add(player4);
System.out.println(setbyweight);

}



}



class CompareByHeight implements Comparator
{
public int compare(Object a,Object b)
{
Player player1=(Player)a;
Player player2=(Player)b;
if(player1.height==player2.height)
{
return 0;
}
else
{
if(player1.height<player2.height)
{
return 1;
}
else
{
return -1;
}
}
}
}
class CompareByWeight implements Comparator
{

public int compare(Object a,Object b)
{
Player player1=(Player)a;
Player player2=(Player)b;
if(player1.weight==player2.weight)
{
return 0;
}
else
{
if(player1.weight<player2.weight)
{
return 1;
}
else
{
return -1;
}
}
}

}