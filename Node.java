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
public class Node {

    private Node next;
    private Friend obj;

    public Node(Friend friend) {
        this.obj = friend;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Friend getObj() {
        return obj;
    }

    public void setObj(Friend obj) {
        this.obj = obj;
    }

    public void nodeDisplay() {

        String name = obj.getName();
        String adress = obj.getAdress();
        String tel = obj.getTel();

        System.out.print("Name: " + name + " \n"
                + "Adress: " + adress + "\n"
                + "Tel: " + tel + "\n");
    }

}
