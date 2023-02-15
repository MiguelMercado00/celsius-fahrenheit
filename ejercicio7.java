

import java.util.Scanner;


public class ejercicio7 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Por favor ingresa los grados celsius en tu ciudad actual: ");
        int celsius = sc.nextInt();
        double fahrenheit = celsius * 1.8 + 32;
       

        System.out.println("Estos son los grados fahrenheit en tu cuidad actual: " + (String.format("%.2f", (fahrenheit))));
        
              
        }     
}

