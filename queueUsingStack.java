import java.io.*;
import java.util.*;

class MyQueue {
    // Push element x to the back of queue.
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int x) {
        Stack<Integer> temp = new Stack<Integer>();
        while(!stack.isEmpty()){
            int elem = stack.peek();
            stack.pop();
            temp.push(elem);
        }
        stack.push(x);
        while(!temp.isEmpty()){
            int elem = temp.peek();
            temp.pop();
            stack.push(elem);
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
       if(!stack.isEmpty()){
           stack.pop();
       }
    }

    // Get the front element.
    public int peek() {
        return stack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        if(stack.size()==0){
            return true;
        }
        else return false;
    }
}

class queueUsingStack{
	public static void main(String args[]){
		MyQueue queue = new MyQueue();
		queue.push(1);
		queue.push(2);
		System.out.println("Queue front is:"+queue.peek());
		queue.pop();
		System.out.println();
		System.out.print("After removing the front element queue front is:");
		System.out.print(queue.peek());
		System.out.println();
		System.out.print("Checking if queue is empty:");
		System.out.print(queue.empty());
		System.out.println();
	}
}