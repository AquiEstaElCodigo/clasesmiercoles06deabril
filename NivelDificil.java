/*
Declare un vector de diez elementos e inicialícelo con nombres de personas.
Declare un vector de tipo numérico de cinco elementos inicialícelo y sume sus elementos, despliegue su resultado.
Declare un vector con el nombre notas de diez elementos e ingrese sus elementos por teclado y calcule su promedio.
Declare una matriz de tipo de numérica, inicialícela y copie sus elementos en otra matriz multiplicados por dos.     

*/

package ClasesMiercoles06;

import java.util.Scanner;


public class NivelDificil {
        private Scanner leer;
    
    public void problemaUno(){
        
        String[] nombres = new String[] {"Platón","Aristóteles","Kan","Hegel",
            "Heidegger","Sartre","Foucault","Onfray","Zizek","Han"};
        System.out.println("Los elementos del vector nombres son:");
        for(String nom : nombres){
            System.out.println(nom);
        }
    }//End method problemaUno
    
    public void problemaDos(){
        
        int[] numeros = new int[5];
        numeros[0] = 2;
        numeros[1] = 4;
        numeros[2] = 6;
        numeros[3] = 8;
        numeros[4] = 10;
        
        int totalSuma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            
            totalSuma += numeros[i];
        }
        System.out.println("La suma total de los elementos es: " + totalSuma);
        
    }//End method problemaDos
    
    
    public void problemaTres(){
        
        leer = new Scanner(System.in);
        double[] notas = new double[5];
        
        double suma = 0;
        double promedio = 0;
        
        for (int a = 0; a < notas.length; a++) {
            
            System.out.print("Ingrese nota: ");
            notas[a] = leer.nextDouble();
            suma += notas[a];
        }
        promedio = suma / notas.length;
        System.out.println("El promedio es: " + promedio);
        
    }//End method problemaTres
    
    
    public void problemaCuatro(){
        
        int[][] matriz = new int[2][2];
        int[][] matrizB = new int[2][2];
        
        matriz[0][0] = 11;
        matriz[0][1] = 22;
        matriz[1][0] = 33;
        matriz[1][1] = 44;
        
        System.out.println("Desplegando elementos de la primera matriz...");
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                
                System.out.println(matriz[filas][columnas]);
            }
        }//End for
        
        //Traspasamos los valores de la primera matriz a la matrizB 
        //multiplicando sus valores por dos (* 2)
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                
                matrizB[x][y] = matriz[x][y] * 2;
                
            }   
        }//End for
        
        System.out.println("Desplegando los valores de la matrizB...");
        
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
             
                System.out.println(matrizB[i][j]);
            }
        }//End for
            
        
    }//End mehod problemaCuatro
}
