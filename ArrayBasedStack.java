import java.util.*;

public class ArrayBasedStack<E> implements StackInterface<E> {
   private E data[];
   private int topOfStack;
   private static final int INITIAL_CAPACITY = 5;
   private boolean initialized = false;
   
   @SuppressWarnings("unchecked")
   public ArrayBasedStack(){
      this(INITIAL_CAPACITY);
   }
   
   public ArrayBasedStack(int capacity){
      if (!(capacity > 0)){
         throw new IllegalArgumentException("ukkegaks plz");
      }
      data = (E[]) new Object[capacity];
      topOfStack = -1;
      initialized = true;
   }
   
   private void resize(){
      data = Arrays.copyOf(data, data.length * 2);
   }
   
   public void push(E it){
      if (isFull()){
         resize();
      }
      data[topOfStack++] = it;
   }
   
   private boolean isFull(){
      for (int i = 0; i < data.length; i++){
         if (data[i] == null){
         return false;
         }
      }
      return true;
   }
   
   public boolean isEmpty() {
      for (int i = 0; i < data.length; i++){
         if (data[i] != null){
         return false;
         }
      }
      return true;
   }
   
   public E pop(){
      if (isEmpty()){
         throw new EmptyStackException();
      }
      E result;
      result = data[topOfStack];
      data[topOfStack--] = null;
      return result;
   }
   
   public void clear(){
      while (!isEmpty()){
         pop();
      }
   }
   
   public E peek(){
      if (isEmpty()){
         throw new EmptyStackException();
      }
      return data[topOfStack];
   }
}