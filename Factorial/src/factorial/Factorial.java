/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.math.BigInteger;

/**
 *
 * @author Lizardo
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(String.format("El factorial de 0 es %d", factorial(0)));
        System.out.println(String.format("El factorial de 1 es %d", factorial(1)));
        System.out.println(String.format("El factorial de 5 es %d", factorial(5)));
        System.out.println(String.format("El factorial de 50 es %d", factorial(50)));
        System.out.println(String.format("El factorial de 100 es %d", factorial(100)));
    }
    
    public static BigInteger factorial (int num){
        BigInteger fact = new BigInteger("1"); 
        
        if ((num >= 0) || (num <=100))
        {
            for (int i = 2; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i)); 
            }
        }
        else{
            System.err.println("Ingrese numeros entre 0 y 100");
        }
        
        return fact;
    }
   
}
