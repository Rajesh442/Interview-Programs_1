import java.util.*;
public class Elementin3rdpositionofArrayList 
{
//6. Find the element in 3rd position of ArrayList 
public void thirdposition()
    {
    ArrayList<Integer> al=new ArrayList<>();
      {
        al.add(5);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(1);
        al.add(3);
        System.out.println("Elements in an Arraylist :"+ al);
        System.out.println("Elements in the 3rd position  :"+ al.get(2));


      }
    }
public static void main(String args[])
{
Elementin3rdpositionofArrayList a=new Elementin3rdpositionofArrayList();
	a.thirdposition();
	

}
}
