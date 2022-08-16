/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package estdatos.estrucutra_de_datos;

/**
 *
 * @author kengc
 */
public class BST {
    nodeTree root;
    private int altura;
    
    public void inserta(int value){
        if (root == null){
            root = new nodeTree(value);
        }
        else{
            insertar(root,value);
        }
        
    }
    
    private void insertar(nodeTree node, int value){
        if (value <= node.getId()){ 
            if(node.getIzq() == null){
                node.setIzq(new nodeTree(value));
            }
            else{
                insertar(node.getIzq(),value);
            }
        }
        else{
            if(node.getDer() == null){
                node.setDer(new nodeTree(value));
            }
            else{
                insertar(node.getDer(),value); 
            }
        }
    }
    
    public void inOrden(){
        if (root != null){
            inOrdenRecorrer(root);
        }
        else{
            System.out.println("El arbol está vacio.");
        }
    }
    
    private void inOrdenRecorrer(nodeTree node){
        if (node != null){
            inOrdenRecorrer(node.getIzq());
            System.out.println(node.getId());
            inOrdenRecorrer(node.getDer());
        }
    }
    
    public int altura(){
        altura = 0;
        retornarAltura(root, 1);
        System.out.println("La altura es de " + altura);
        return altura;
    }
    
    private void retornarAltura(nodeTree node, int nivel){
        if (node != null){
            retornarAltura(node.getIzq(), nivel+1 );
            if(nivel > altura){
                altura = nivel;
            }
            System.out.println(node.getId());
            retornarAltura(node.getDer() , nivel+1);
        }
    }
    
    
    public void preOrden(){
        if (root != null){
            preOrdenRecorrer(root);
        }
        else{
            System.out.println("El arbol está vacio.");
        }
    }
    
    private void preOrdenRecorrer(nodeTree node){
        if (node != null){
            System.out.println(node.getId());
            preOrdenRecorrer(node.getIzq());
            preOrdenRecorrer(node.getDer());
        }
    }

    public void postOrden(){ 
        if (root != null){
            postOrdenRecorrer(root);
        }
        else{
            System.out.println("El arbol está vacio.");
        }
    }
    
    private void postOrdenRecorrer(nodeTree node){ 
        if (node != null){
            postOrdenRecorrer(node.getIzq());
            postOrdenRecorrer(node.getDer());
            System.out.println(node.getId());
        }
    }
}
