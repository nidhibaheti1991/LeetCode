import java.io.*;
import java.util.*;


class MyStack {
    // Push element x onto stack.
    Queue<Integer> queue = new LinkedList<Integer>();
    public void push(int x) {
        Queue<Integer> temp = new LinkedList<Integer>();
        while(!queue.isEmpty()){
            int val = queue.poll();
            temp.add(val);
        }
        queue.add(x);
        while(!temp.isEmpty()){
            int val = temp.poll();
            queue.add(val);
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        if(!queue.isEmpty()){
            queue.poll();
        }
    }

    // Get the top element.
    public int top() {
        return queue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        if(queue.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
public class stackUsingQueue{
	public static void main(String args[]){
		//use MyStack class to do stack operations
	}
}