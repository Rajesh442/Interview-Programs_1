import java.util.*;
public class AverageofNumericElementsinSet
{
//4. To find average of numeric  elements present in Set 
public void Average()
    {
    TreeSet<Integer> ts=new TreeSet<Integer>();
      {
        ts.add(5);
        ts.add(7);
        ts.add(8);
        ts.add(3);
        ts.add(4);
        ts.add(9);
        ts.add(1);
        ts.add(7);
        System.out.println("Elements in set :"+ ts);
int sum=0;
//converting TreeSet into Arraylist because set don't have index
ArrayList<Integer> al1=new ArrayList<Integer>();
        al1.addAll(ts);
//sum of all elements in set
for(int i=0;i<ts.size();i++)
{
sum=sum+al1.get(i);
}
//finding average
        int average=sum/al1.size();
        System.out.println("sum of the elements in set :"+ sum);
        System.out.println("Average of the elements in set :"+ average);
      }
    }
public static void main(String args[])
{
AverageofNumericElementsinSet a=new AverageofNumericElementsinSet();
	a.Average();
	

}
}
