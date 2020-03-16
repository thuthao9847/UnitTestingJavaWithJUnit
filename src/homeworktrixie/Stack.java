/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworktrixie;

/**
 *
 * @author ThuThao
 */
public class Stack implements IStack{

    public StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data; 
        } 
    } 
  
    @Override
    public boolean isEmpty() 
    { 
        if (root == null) { 
            return true; 
        } 
        else
            return false; 
    } 
  
    @Override
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data); 
  
        if (root == null) { 
            root = newNode; 
        } 
        else { 
            StackNode temp = root; 
            root = newNode; 
            newNode.next = temp; 
        } 
        System.out.println(data + " pushed to stack"); 
    } 
  
    @Override
    public int pop() 
    { 
        int popped = Integer.MIN_VALUE; 
        if (root == null) { 
            System.out.println("Stack is Empty"); 
        } 
        else { 
            popped = root.data; 
            root = root.next; 
        } 
        return popped; 
    } 
  
    @Override
    public int peek() 
    { 
        if (root == null) { 
            System.out.println("Stack is empty"); 
            return Integer.MIN_VALUE; 
        } 
        else { 
            return root.data; 
        } 
    }
    public void printStack(){
        System.out.println("Stack: ");
        while (root != null) {            
            System.out.print(root.data +"\t");
            root=root.next ; 
        }        
    }
    @Override
    public void clear(){
        root = null;
    }
    @Override
    public boolean contain(int data){
        while(root !=null){
            if(data == root.data){
                return true;
            }
            root = root.next;
        }
        return false;
    }
    public static void main(String[] args) throws Exception {
        Stack st= new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.pop() + " popped from stack");  
        System.out.println("Top element is " + st.peek()); 
        st.printStack();
        st.clear();
        st.printStack();
    }    
}
