/*
Con un bucle do-while despliegue los números del uno al cien.
Con un bucle while despliegue los números impares entre uno y cincuenta.
Con un bucle for realice el ingreso de cinco notas y calcule su promedio.
Con un bucle for despliegue, cuente, y sume los múltiplos de tres comprendidos entre uno y treinta. 
Con un bucle a su elección despliegue la tabla de multiplicar de un numero ingresado por teclado con el siguiente formato, por ejemplo: 
2 X 4 = 8 
*/

package ClasesMiercoles06;

import java.util.Scanner;


public class NivelMedio {
    
       private Scanner entrada;
    public void ejercicioUno(){
        
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <= 100);
        
    }//End method
    
    public void ejercicioDos(){
        
        int a = 1;
        while(a <= 50){
            
            if(a % 2 != 0)
                System.out.println(a);
            a++;
        }
        
    }//End mehod
        
    public void ejercicioTres(){
        
        entrada = new Scanner(System.in);
        double notas, promedio;
        double suma = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nota: ");
            notas = entrada.nextDouble();
            suma =suma + notas;
        }
        promedio = suma / 5;
        System.out.println("Promedio: "+ promedio);
    }//End mehod
            
    public void ejercicioCuatro(){
        
        int contador = 0;
        int sumador = 0; 
        for (int i = 1; i <= 30; i++) {
            
            if(i % 3 == 0){
                System.out.println(i);
                contador++;
                sumador += i;
            }
        }//End for
        System.out.println("El total de múltiplos de 3 es: " + contador);
        System.out.println("La suma total de los múltiplos de 3 es: " + sumador);
        
    }//End method
                
    public void ejercicioCinco(){
        
        entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        int numero = entrada.nextInt();
        
        for (int i = 1; i < 12; i++) {
        
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
        
    }//End method
    
    
}
