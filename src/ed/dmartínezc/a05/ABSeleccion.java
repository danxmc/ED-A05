/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.dmartínezc.a05;

/**
 *
 * @author Daniel Alexandro Martínez Ch. A00513954
 */
public class ABSeleccion extends AlgoritmoDeBusqueda {
    //Atributes
    
    // Constructor
    public ABSeleccion() {
        
    }
    
    /**
     * Method heredado, ordena el vector de manera seleccion insercion.
     * @param array, el vector
     */
    @Override
    public void ordena(int[] array) {
        System.out.println("Algortimo de Busqueda: Seleccion");
        for (int i = 0; i < array.length; i++) {
            int m = i;
            for (int j = i + 1; j < array.length ; j++) {
                if (array[j] < array[m]) {
                    m = j;
                    int temp = array[i];
                    array[i] = array[m];
                    array[m] = temp;
                }
            }
        }
    }

}
