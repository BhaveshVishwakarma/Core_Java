package com.neosoft.basics;

public class DoublyLinkListDemo {
	
	class Node
	{  
        int item;  
        Node prev;  
        Node next;  
   
        public Node(int item) 
        {  
            this.item = item;  
        }  
    }  
    
    
    Node head, tail = null;  
    
    public void addNode(int item) 
    {  
        
    	Node newNode = new Node(item);   
        
        if(head == null) 
        {  
            head = tail = newNode;  
            head.prev = null;   
            tail.next = null;  
        }  
        else 
        {  
            
            tail.next = newNode;  
             
            newNode.prev = tail;  
            
            tail = newNode;  
            
            tail.next = null;  
        }  
    }  
   
    
    public void printNodes() {  
         
        Node current = head;  
        if(head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
             
            System.out.print(current.item + " ");  
            current = current.next;  
        }  
    }  

    public static void main(String[] args) {  
        
    	DoublyLinkListDemo dl = new DoublyLinkListDemo();  
        
       
        
        dl.addNode(15);  
        dl.addNode(7);  
        dl.addNode(22);  
        dl.addNode(9);  
        dl.addNode(11); 
        dl.printNodes();  
    }  

}
