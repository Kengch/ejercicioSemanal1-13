/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kengc
 */
package estdatos.estrucutra_de_datos;

public class queue<T> {
    private node<T> head;
    private node<T> tail;
    
    public void enqueue (T value){
        node<T> newNode = new node<> (value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.setNext(newNode);
            tail = newNode;
        }
    }
    
    public node<T> dequeue (){
        if(head == null){
            System.out.println("La cola se encuentra vacía.");
            return null;
        }
        else{
            node<T> firstInQueue = head;
            head = head.getNext();
            return firstInQueue;
        }
    }
}