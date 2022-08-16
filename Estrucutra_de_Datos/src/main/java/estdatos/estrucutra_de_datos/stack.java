/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estdatos.estrucutra_de_datos;

/**
 *
 * @author kengc
 */
public class stack<T> {
    private node<T> top;
    
    public void push(T value){
        node<T> newNode = new node<T>(value);
        
        if (top==null){
            top = newNode;
        }
        else{
            newNode.setNext(top);
            top = newNode;
        }
    }
    
    public T pop(){
        node<T> aux = top;
        if (top!=null){
            top = top.getNext();
            return aux.getValue();
        }
        else{
            return null;
        }
    }
}
