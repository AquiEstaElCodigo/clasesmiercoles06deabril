
/*
Despliegue por pantalla un mensaje de Hola Mundo!!
Sume dos números y muestre su valor por pantalla.
Ingrese dos números y realice con estos las cuatro operaciones básicas (+, -, *, /).
Ingrese un número y determine si es mayor o menor de edad.
Ingrese un número y determine si es par o impar.

*/

package ClasesMiercoles06;
import java.util.Scanner;

public class NivelFacil {

    Scanner leer;
    public void _uno(){
        
        System.out.println("Hola Mundo!!");
        
    }//End method
    
    public void _dos(){
        
        int a = 12;
        int b = 4;
        int suma;
        
        suma = a + b;
        System.out.println("La suma es: " + suma);
        
    }//End method
        
    public void _tres(){
        
        leer = new Scanner(System.in);
        int n, m;
        
        System.out.println("Ingrese un número: ");
        n = leer.nextInt();
        System.out.println("Ingrese otro número:");
        m = leer.nextInt();
        System.out.println("La suma es: " + (n + m));
        System.out.println("La resta es: " + (n - m));
        System.out.println("La división es: " + (n / m));
        System.out.println("La multiplicación es: " + (n * m));
        
    }//End method
            
    public void _cuatro(){
        
        leer = new Scanner(System.in);
        int edad;
        
        System.out.println("Ingrese su edad: ");
        edad = leer.nextInt();
        if(edad >= 18){
            
            System.out.println("Es mayor de edad");
            
        }else{
            
            System.out.println("Es menor de edad");
        }
    }//End method
                
    public void _cinco(){
        
    }//End method
                    
}//End class
