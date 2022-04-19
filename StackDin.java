/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamicstack;

/**
 *
 * @author mpeht
 */
public class StackDin {
    
    
    private Node data;

    protected Node top;
    protected int size;

    public StackDin() {
        this.top = null;
        this.size = 0;
    }
     public boolean stackEmpty() {
        return top == null;
    }
    public void push(int dt) {
        Node newNode = new Node(dt);
        newNode.next = top;
        top = newNode;
    }
    public int pop() {
        if(stackEmpty())    {
            return 0;
        }else{
            Node temp = top;
            top = top.getNext();
            return temp.getData();
        }
    }
    public  int consultTop() {
        if (stackEmpty()) {
            return 0;
        } else {
            return top.getData();
        }
    }
    public void Display()   {
        if(stackEmpty())    {
            System.out.println("Stack Empty");
        }else{
            Node actual = this.top;
            while(actual != null)    {
                actual.displayNode();
                actual = actual.getNext();
            }
            System.out.println(actual);
        }
        
    }
    
}
