
package estdatos.estrucutra_de_datos;

import static estdatos.estrucutra_de_datos.GFG.newNode;
import static estdatos.estrucutra_de_datos.GFG.preOrder;
import static estdatos.estrucutra_de_datos.GFG.search;

/**
 *
 * @author kengc
 */
public class Estrucutra_de_Datos {
    public static void main(String[] args) {
        /*
        ----------------Recursividad----------------        
        System.out.println(recursion.factorial(3));
        
        int[] arr={80,15,70,7,4};
        System.out.println(recursion.encontrarMax(arr,1,arr[0])); 
        
        int[] ejercicio3={33,51,41,1,99};
        int n = recursion.sacaPosicionMayor(ejercicio3,0,ejercicio3[0],0);
        //Se crea esta variable n para poder sumarle 1 al resultado del método en el system.out
        
        System.out.println("La posición más alto es: " + (n+1) );
        ----------------Recursividad----------------
        */
        
        /*----------------Pilas----------------
        stack<String> Pila = new stack<String>(); 
        Pila.push("Pedro");
        Pila.push("Juan");
        Pila.push("Carlos");
        
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        //----------------Pilas----------------*/
        
        /* ----------------Cola----------------
        
        queue<Integer> Cola = new queue<Integer>(); 
        Cola.enqueue(1);
        Cola.enqueue(2);
        Cola.enqueue(3);
        System.out.println(Cola.dequeue());            
        System.out.println(Cola.dequeue().getValue()); 
        // ----------------Cola----------------*/
        
        
        // ----------------Lista----------------//
        /*
        lista Lista = new lista (); 
        Lista.insertar(new persona(25, "Pepe")); 
        Lista.insertar(new persona(54, "Juan"));
        Lista.insertar(new persona(30, "Carlos"));
        Lista.insertar(new persona(12, "Pedro"));
        Lista.insertar(new persona(15, "Paula"));
        */
        //Lista.elimina(30);
        //Lista.modificar(12);
        //System.out.println(Lista.extraer(15));
        //Lista.imprimirlista();
        //System.out.println(Lista.existe(12));
        
        // ----------------Lista----------------//
        
        // ----------------Lista Circular Simple----------------/
        /*
        lista_Circular_Simple Lista2 = new lista_Circular_Simple (); 
        Lista2.insertar(new persona(25, "Pepe")); 
        Lista2.insertar(new persona(54, "Juan"));
        Lista2.insertar(new persona(30, "Carlos"));
        Lista2.insertar(new persona(12, "Pedro"));
        Lista2.insertar(new persona(15, "Paula"));
        
        //Lista.elimina(30);
        //Lista.modificar(12);
        //System.out.println(Lista.extraer(15));
        Lista2.imprimirlista();
        //System.out.println(Lista.existe(12));
        */
        // ----------------Lista Circular Simple----------------//
        
        // ----------------Lista Doble Circular ----------------//
        
        lista_Doble_Circular Lista3 = new lista_Doble_Circular ();
        Lista3.insertar(new persona(25, "Pepe")); 
        Lista3.insertar(new persona(4, "Juan"));
        Lista3.insertar(new persona(30, "Carlos"));
        Lista3.insertar(new persona(12, "Pedro"));
        Lista3.insertar(new persona(15, "Paula"));
        
        //Lista3.elimina(12);
        //Lista3.modificar(12);
        //System.out.println(Lista3.extraer(4));
        Lista3.imprimirlista();
        //System.out.println(Lista3.existe(11));
        
        // ----------------Lista Doble Circular ----------------//
        
        //Binary Structure Tree BST 
        /*
        BST arbol = new BST(); 
        
        arbol.inserta(50);
        arbol.inserta(20);
        arbol.inserta(80);
        arbol.inserta(15);
        arbol.inserta(30);
        arbol.inserta(60);
        arbol.inserta(40);
        arbol.inserta(90);
        arbol.inserta(75);
        arbol.inserta(33);
        arbol.inserta(82);
        
        //arbol.postOrden();
        arbol.inOrden();
        //arbol.preOrden();
        */
        //intentar imprimir el preorden y postorden
        //arbol.altura();
        
        //Splay Tree
        GFG.node root = newNode(100);
        root.left = newNode(50);
        root.right = newNode(200);
        root.left.left = newNode(40);
        root.left.left.left = newNode(30);
        root.left.left.left.left = newNode(20);
        root = search(root, 20);
        System.out.print("Pre order traversal of the"
                + " modified Splay tree is \n");
        preOrder(root);
    }
}
