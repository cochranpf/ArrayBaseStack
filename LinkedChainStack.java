import java.util.EmptyStackException;

public class LinkedChainStack<E> implements StackInterface<E> {

   private Node<E> topNode;
   
   public void push(E newElement) {
   
   }
   
   public E pop() {
   
   }
   
   public E peek() {
   
   }
  
   public boolean isEmpty() {
      return true;
   }
  
   public void clear() {
   
   }

   
   private class Node 
	{
	  private E    data;
	  private Node next;

		private Node(E dataPortion)
		{
			this(dataPortion, null);	
		}
		
		private Node(E dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;	
		} 
	} 
}