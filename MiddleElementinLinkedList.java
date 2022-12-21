import java.util.*;
public class MiddleElementinLinkedList
{
//2. To Find the Middle element of LinkedList 
public void MiddleElement()
    {
    LinkedList<Integer> ll=new LinkedList<>();
      {
        ll.add(5);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(1);
        ll.add(3);
        System.out.println("Elements in an linkedlist :"+ ll);
if(ll.size()%2==0)
{
System.out.println("middle element in the linkedlist is :"+ll.get(ll.size()/2 -1));
System.out.println("middle element in the linkedlist is :"+ll.get(ll.size()/2));
}
else
{
System.out.println("middle element in the linkedlist is :"+ll.get(ll.size()/2));
}
      }
    }
public static void main(String args[])
{
MiddleElementinLinkedList a=new MiddleElementinLinkedList();
	a.MiddleElement();
	

}
}
