/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package estdatos.estrucutra_de_datos;

import java.util.Scanner;

/**
 *
 * @author kengc
 */
public class lista_Circular_Simple {
    private node<persona> head;
    private node<persona> tail;
    
    public void insertar(persona value){
        if(head == null){
            head = new node<persona>(value);
            tail = head;
            tail.setNext(head);
        }
        else if( head.getValue().getId() > value.getId() ){
            node<persona> aux = new node<persona>(value);                 
            aux.setNext(head); 
            head = aux;
            tail.setNext(head);
        }       
        else if( value.getId() >= tail.getValue().getId() ){
            node<persona> aux = new node<persona> (value);
            tail.setNext(aux);
            tail = aux;
            tail.setNext(head);
        }
        else{
            node<persona> aux = tail;
            while (aux.getNext().getValue().getId() < value.getId() ){
                aux = aux.getNext();
            } 
            node<persona> Temp =  new node<persona>(value);
            Temp.setNext(aux.getNext());
            aux.setNext(Temp);
        }
    }
    
    public void imprimirlista(){
        
        if (head == null){
            System.out.println("La lista esta vacia.");
        }
        else{
            node<persona> aux = head;
            do{
                System.out.println(aux.getValue().getId()+", "+aux.getValue().getNombre());
                aux = aux.getNext();
            }while (aux != head);
        }
    }
    
    public boolean existe(int id){
        if(id == head.getValue().getId() || id == tail.getValue().getId()){
            return true;
        }
        else{
            node<persona> aux = head.getNext();
            do{
                if (aux.getValue().getId() == id){
                    return true;
                }
                aux = aux.getNext();
            }while (aux != tail);
            return false;
        }
    }
        
    public void modificar(int id){
        Scanner entrada = new Scanner(System.in);
        boolean existe = false;
        if(head == null){
            System.out.println("La lista esta vacia. No es posible modificar ningún dato.");
            existe = true;
        }
        else if(id == head.getValue().getId()){
            System.out.println("Se cambiará el nombre a la persona con ID " + id + ".\nDigite el nuevo nombre: ");
            head.getValue().setNombre(entrada.next());
            existe = true;
        }
        else if(id == tail.getValue().getId()){
            System.out.println("Se cambiará el nombre a la persona con ID " + id + ".\nDigite el nuevo nombre: ");
            tail.getValue().setNombre(entrada.next());
            existe = true;
        }
        else{
            node<persona> aux = head.getNext();
            while(aux != tail){
                if (aux.getValue().getId() == id){ 
                    System.out.println("Se cambiará el nombre a la persona con ID "+ id + ".\nDigite el nuevo nombre: ");
                    //aux2 = entrada.next();
                    aux.getValue().setNombre(entrada.next());
                    existe = true;
                    break;
                }
                aux = aux.getNext();
            }
            if (existe == false){
                System.out.println("No es posible modificar este elemento porque no existe en la lista.");
            }
        }
    }
    
    public void elimina(int id){
        boolean existe = false;
        if(head == null){
            System.out.println("La lista esta vacia. No es posible eliminar ningún dato.");
            existe = true;
        }
        else if(id == head.getValue().getId()){
            head = head.getNext();
            tail.setNext(head);
            existe = true;
        }
        else{
            node<persona> aux = head;
            node<persona> aux2 = aux.getNext();
            while(aux.getNext() != tail){ 
                if (aux2.getValue().getId() == id){
                    aux.setNext(aux.getNext().getNext());
                    existe = true;
                    break;
                }
                aux = aux.getNext(); 
                aux2 = aux.getNext();
            }
            if (id == tail.getValue().getId()){
                tail = aux;
                tail.setNext(head);
                existe = true;
            }
            if (existe == false){
                System.out.println("No es posible eliminar este elemento porque no existe en la lista.");
            }
        }
    }
    
    public persona extraer(int id){
        persona p = null;
        node<persona> aux;
        
        if(id == head.getValue().getId()){
            aux = head;
            head = head.getNext();
            tail.setNext(head);
            return aux.getValue();
        }
        else{
            aux = head;
            node<persona> aux2 = aux.getNext();
            
            while(aux.getNext() != tail){
                if (aux2.getValue().getId() == id){
                    aux.setNext(aux.getNext().getNext());
                    
                    return aux2.getValue();
                }
                aux = aux.getNext();
                aux2 = aux.getNext();
            }
            
            if (id == tail.getValue().getId()){
                tail = aux;
                tail.setNext(head);
                return aux2.getValue();
            }
            return p;
        }
    }
}
