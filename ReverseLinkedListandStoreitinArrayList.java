import java.util.*;
public class ReverseLinkedListandStoreitinArrayList 
{
//5. Reverse a LinkedList and store it in ArrayList 
public void ReverseandStroreinArrayList()
    {
    LinkedList<Integer> ll=new LinkedList<Integer>();
      {
        ll.add(5);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(1);
        ll.add(3);
        System.out.println("Elements in an linkedlist :"+ ll);
//reverse the linkedlist 
Collections.reverse(ll);
System.out.println("reversed linedlist ");
System.out.println(ll);
//convert linkedlist into arraylist
    ArrayList al =new ArrayList();
    al.addAll(ll);

    System.out.println("Elements in Array list"+al);

      }
    }
public static void main(String args[])
{
ReverseLinkedListandStoreitinArrayList a=new ReverseLinkedListandStoreitinArrayList();
	a.ReverseandStroreinArrayList();
	
}
}
