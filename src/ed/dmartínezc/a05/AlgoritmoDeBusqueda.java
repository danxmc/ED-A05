/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.dmartínezc.a05;

import java.util.Scanner;

/**
 *
 * @author Daniel Alexandro Martínez Ch. A00513954
 */
public abstract class AlgoritmoDeBusqueda {
    //Atributes
    protected int vector[];

    //Constructor
    /**
     * Crea los espacios del vector, y llama a todos los methods necesarios
     * para que el proceso de ordenamiento se realice.
     */
    public AlgoritmoDeBusqueda() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba el numero de espacios del vector: ");
        vector = new int[scan.nextInt()];
        setVector();
        System.out.println("Vector Desordenado:");
        showVector();
        System.out.println("");
        ordena(vector);
        System.out.println("");
        System.out.println("Vector Ordenado:");
        showVector();
    }
    
    /**
     * Llena el vector con los datos que  el usuario ingrese
     */
    public void setVector() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Escribe el dato del vector en la posicion [" + i + "]: ");
            this.vector[i] = scan.nextInt();
        }
    }
    
    /**
     * Muestra el vector en formato [x]
     */
    public void showVector() {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + getVector()[i] + "]");
        }
        System.out.println("");
    }

    /**
     * @return veector
     */
    private int[] getVector() {
        return vector;
    }
    
    /**
     * Overridable abstract method, se hereda a diferentes clases para que haga
     * su funcion dependiendo del tipo de busqueda
     * @param vector 
     */
    public abstract void ordena(int[] vector);

}
