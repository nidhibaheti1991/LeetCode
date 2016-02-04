import java.io.*;
import java.util.*;
public class linkedList{
		public static void main(String[] args){
			listElement<Integer> t1 = new listElement<Integer>(2);
			listElement<Integer> t2 = new listElement<Integer>(4);
			t1.setNext(t2);
			System.out.println(t1.value());
			System.out.println(t1.next().value());
			System.out.println(t1.value()+t2.value());
			
		}
}
class listElement<T>{
	private T data;
	private listElement<T> next;
	public listElement(T value){ 
		data = value;
	}
	public T value(){
		return data;
	}
	public listElement<T> next(){
		return next;
	}
	
	public void setNext(listElement<T> elem){
		next = elem;
	}
	
	public void setValue(T value){
		data = value;
	}
	
		
}