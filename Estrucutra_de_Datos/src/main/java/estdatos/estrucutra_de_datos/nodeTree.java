/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package estdatos.estrucutra_de_datos;

/**
 *
 * @author kengc
 */
public class nodeTree {
    private int id;
    private nodeTree izq;
    private nodeTree der;
    
    public nodeTree(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public nodeTree getIzq() {
        return izq;
    }

    public void setIzq(nodeTree izq) {
        this.izq = izq;
    }

    public nodeTree getDer() {
        return der;
    }

    public void setDer(nodeTree der) {
        this.der = der;
    }
}
