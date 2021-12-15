import java.util.*;
import java.lang.*;
class linkedlist
{
   Node head;
   class Node                      //Node 
   {
   	 int data;
   	 Node next;                  //Reference of next node
       Node(int val)
       {
         data=val;
         next=null;
       }
   }
   linkedlist()
   {
      head=null;
   }
   public void insertAtBeginning(int val)       //Insert method
   {
         Node newNode = new Node(val);
    if(head==null)                        //List is empty
    {
      head=newNode;

    }
    else                                 //List is Not empty             
    {
      newNode.next=head;
      head=newNode;
    }

   }
 
   public void insertAtPos(int pos,int val)      //InsertAtPosition
   {
     if(pos==0)
     {
       insertAtBeginning(val);
       return;
     }
       Node newNode=new Node(val);
     Node temp=head;
     for(int i=1;i<=pos-1;i++)
     {
       temp=temp.next;
     }
     newNode.next=temp.next;
     temp.next=newNode;
   }

   public void deleteAtPos(int pos)         //DeleteAtPosition
   { 

    if(head==null)
    {
      throw new IndexOutOfBoundsException("List is Empty");
     } 

       Node temp=head;
    Node prev=null;
     for(int i=1;i<=pos;i++)
     {
       prev=temp;
       temp=temp.next;
     }
     prev.next=temp.next;
    }
    
  public void insertAtEnd(int val)    //Insert at End
   {
     Node newNode =new Node(val);

     Node temp=head;
     while(temp.next!=null)
     {

        temp=temp.next;
     
     }
      temp.next=newNode;
   
   }

 public void getSpecificPos(int pos)    //Get Specific Position
 {
    Node temp= head;
    for(int i=1;i<=pos;i++)
    {
      temp =temp.next;
    }
    System.out.println(temp.data);
 }

 public void updateSpecificPos(int pos, int value)
 {
    Node temp = head;
    for(int i=1;i<=pos;i++)
    {
      temp = temp.next;
    }
    System.out.println( temp.data = value);
 }

 public int search(int value)
 {
    Node temp = head;
   int flag1=0,flag=0;
    while(temp!=null)
    {
      if(temp.data==value)
      {
        flag1=temp.data;
      }

      temp = temp.next;
    }
   return flag1;

  


 }

    public void delAtBeginning()
    {
      head=head.next;
    }

   public void display()
   {
     
    Node temp = head;
    while(temp!=null)
    {
     System.out.print(temp.data+" "); 
     temp=temp.next;
    }  
   }
}

public class Singlylinkedlist
{
	public static void main(String...s)
	{
       linkedlist ll=new linkedlist(); 

            //  ll.deleteAtPos(2);
       ll.insertAtBeginning(18);
       ll.insertAtBeginning(20);
       ll.insertAtBeginning(21);
       System.out.println("After Inserting.... ");
             ll.display();

                 System.out.println("");
       
       ll.insertAtPos(3,23);
         
           System.out.println("After Insert At Specigic Position...  ");
         
             ll.display(); 
         
                 System.out.println(" ");
       
       ll.deleteAtPos(2);
         
           System.out.println("After Delete at Specific Position... ");
       
       ll.display();

           System.out.println(" ");

       ll.delAtBeginning();    

             System.out.println("After Delete At Beginning... ");
            ll.display();

           System.out.println(" ");
            
            ll.insertAtEnd(78);
              System.out.println("After Insert At End... ");
            ll.display();
             System.out.println(" ");
            
           System.out.println("After Get Specific Position... ");
              ll.getSpecificPos(2);
            
           System.out.println("Update a element Specific Position... ");
              ll.updateSpecificPos(2,79);
              ll.display();
               System.out.println("\n Search a element ");
              System.out.println(ll.search(90));



	}
}














/*
get(pos) - get(2)
update(pos,val)
deleteAtEnd(val)
insertAtEnd(val)
search(val) - return inedx
contains(val) - return true or false
length
*/