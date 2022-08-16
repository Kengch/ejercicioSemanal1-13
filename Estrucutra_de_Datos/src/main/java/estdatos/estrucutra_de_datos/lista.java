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
public class lista {
    private node<persona> head;
    
    public lista(){
        
    }

    public void insertar(persona value){
        if (head == null){
            head = new node<persona>(value);
        }
        else if( head.getValue().getId() > value.getId() ){
            node<persona> aux = new node<persona> (value);
            aux.setNext(head);
            head = aux;
        }
        else if( head.getValue().getId() < value.getId() && head.getNext() == null){
            node<persona> aux = new node<persona> (value);
            head.setNext(aux);
        }
        else{
            node<persona> aux = head;
            while (aux.getNext() != null && aux.getNext().getValue().getId() < value.getId() ){
                aux = aux.getNext();
            }
            
            node<persona> Temp =  new node<persona>(value);
            Temp.setNext(aux.getNext()); 
            aux.setNext(Temp);
        }
    }
    
    public void imprimirlista(){
        node<persona> aux = head;
        while (aux != null){
            System.out.println(aux.getValue().getId()+", " + aux.getValue().getNombre());
            aux = aux.getNext();
        }
    
    }
    
    public boolean existe(int id){
        node<persona> aux = head;
        while(aux != null){
            if (aux.getValue().getId() == id){
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }
    
    public void elimina(int id){
        node<persona> aux = head;
        while(aux != null){
            if (aux.getNext().getValue().getId() == id){ 
                aux.setNext(aux.getNext().getNext());
                
                System.out.println("El objeto con identificación " + id + " ha sido eliminado de la fila.");
                break;
            }
            aux = aux.getNext();
        }
    }
    
    public void modificar(int id){
        node<persona> aux = head;
        String namemodif;
        Scanner entrada = new Scanner(System.in);
        while(aux != null){
            if (aux.getValue().getId() == id){
                System.out.println("Se cambiará el nombre a la persona con ID " + aux.getValue().getId() + "\nDigite el nuevo nombre: ");
                namemodif = entrada.next();
                aux.getValue().setNombre(namemodif);
                break;
            }
            aux = aux.getNext();
        }
    }
    
    public persona extraer(int id){
        persona p = null;
        node<persona> aux = head;
        while(aux != null){
            if (aux.getNext().getValue().getId() == id){
                aux.setNext(aux.getNext().getNext());
                return aux.getValue();
            }
            aux = aux.getNext();
        }
        return p;
    }
}
