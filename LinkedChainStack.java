import java.util.EmptyStackException;

public class LinkedChainStack<E> implements StackInterface<E> {

   private Node<E> topNode;
   
   public void push(E newElement) {
      Node no = new Node(newElement);
      topNode.setNext(no);
      topNode = no;
   }
   
   public E pop() {
      if (isEmpty()) {
         throw new EmptyStackException();
      }
      
      E result = topNode.getData();
      topNode = topNode.getNext();
      return result;
   }
   
   public E peek() {
      if (isEmpty()) {
         throw new EmptyStackException();
      }
      
      return topNode.getData(); 
   }
  
   public boolean isEmpty() {
      if (topNode == null) {
         return true;
      }
      return false;
   }
  
   public void clear() {
      while(!(isEmpty())) {
         pop();
      }
   }

   
   private class Node<E> 
	{
	  private E data;
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
      
      public void setNext(Node n) {
         next = n;
      }
      
      public E getData () {
         return data;
      }
      
      public Node getNext () {
         return next;
      }
	} 
}