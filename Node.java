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
public class Node {
    
    public int data;
    public Node next;
    
    public  Node() {
    }
    
    public Node(int dt) {
        this.data = dt;
        this.next = null;
    }

   public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
   public void displayNode()    {
       System.out.println(data);
   }
    
}
