/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist03;

/**
 *
 * @author mpeht
 */
public class LinkedListCircle {

    private Node last;
    private int size;

    public LinkedListCircle() {
        this.last = null;
        this.size = 0;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty()    {
        return last == null;
    }
    
    public boolean search(Friend obj)   {
        Node node = last.getNext();
        for(int i = 0; i < size; i++)   {
            if(obj == node.getObj())    {
                node = node.getNext();
                return true;
            }
        }
        return false;
    }

    public void add(Friend obj) {
        Node newNode = new Node(obj);
        
        if (isEmpty()) {
            last = newNode;
        } else {
            newNode.setNext(last);
            last.setNext(newNode);
            size++;
        }
    }

    public void remove() {
        Node delete;
        if (isEmpty()) {
            System.out.println("Empty List");
        }else{
            delete = last.getNext();
            if(delete == last)  {
                last = null;
            }else{
                last.setNext(delete.getNext());
                size--;
            }
        }
    }

    public void Display() {

        if (isEmpty()) {
            System.out.print("Empty List.");
        } else {
            Node actual = this.last;
            while (actual != null) {
                actual.nodeDisplay();
                actual = actual.getNext();
            }

        }
    }

}
