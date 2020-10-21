
package Sesion01;

import java.util.Scanner;

/**
 * Clase principal del proyecto
 * @author Antonio Ramos
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int opcion;
        do{
            // Mostrar las opciones - texto mostrar por pantalla
            opcion = teclado.nextInt();
            switch(opcion){
                case 0:
                    System.out.println("Saliendo....");
                    break;
                case 1:
                    tablaMultiplicar();
                    break;
                case 2:
                    metodo2();
                    break;
                default:
                    System.err.println("Error. La opción introducida no es válida.");
                    break;
            }
        }while(opcion != 0);
    }
    
    public static void tablaMultiplicar(){
        Scanner teclado = new Scanner (System.in);
        int numero, resultado;
                
        System.out.println("Tabla de multiplicar.");
        System.out.println("---------------------");
        do{
            System.out.print("Introduzca el valor de la tabla de multiplicar que quiere mostrar: ");
            numero = teclado.nextInt();
            if(numero < 1 || numero > 10){
                System.err.println("Error. El valor tiene que estar comprendido entre 1 y 10.");
            }
        }while(numero < 1 || numero > 10);
        
        System.out.println("La tabla de multiplicar del " + numero + " es la siguiente:");
       
        for(int i = 0; i <= 10; i++){ // i++, i = i+1
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        boolean r;
        do{
            System.out.println("");
            r = false;
        }while(r == true);
    }
    
    public static void metodo2(){
        
    }
}
