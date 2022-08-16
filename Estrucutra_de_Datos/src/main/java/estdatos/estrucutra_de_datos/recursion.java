/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estdatos.estrucutra_de_datos;

/**
 *
 * @author kengc
 */
public class recursion {
    public static int factorial (int n){
        if (n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    
    public static int encontrarMax(int[] numeros, int indice, int max){
        if (indice !=numeros.length){
            
            if(numeros[indice]>max){
                max = encontrarMax(numeros, indice + 1,numeros[indice]);
            }
            else{
                max = encontrarMax(numeros, indice + 1,max);
            }
        }
        return max;
    }
    
    public static int sacaPosicionMayor(int[] arr, int indice, int numeroMax, int posicionAlta){
        if (indice !=arr.length){
            if (numeroMax<arr[indice]){
                posicionAlta = sacaPosicionMayor(arr,(indice)+1, arr[indice], indice);
            }
            else{
                posicionAlta = sacaPosicionMayor(arr, (indice)+1, numeroMax, posicionAlta);
            }
        }
        return posicionAlta;
    }
}
