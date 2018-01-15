/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequation;
import java.util.Scanner;

/**
 *
 * @author inquis1t0r
 */
public class QuadraticEquation {
    
    static Scanner userInput = new Scanner(System.in);
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TODO parameter scanner
        int parameterA = 0, parameterB = 0, parameterC = 0;
        
        

        System.out.println("Podaj parametr A"); 
        if(userInput.hasNextInt())
        {
            parameterA = userInput.nextInt();
                    System.out.println("Podaj parametr B"); 
            parameterB = userInput.nextInt();
                    System.out.println("Podaj parametr C"); 
            parameterC = userInput.nextInt();
        }
        
        
        if (parameterA == 0){
            System.out.println("To nie jest równanie kwadratowe: A = 0");
        }
        else{
            double delta = parameterB * parameterB - 4 * parameterA * parameterC;
            System.out.println("Delta jest równa: " + (int)delta);
  
            if(delta <0){
                System.out.println("Brak rozwiązań w zbiorze rzeczywistym");
            }
            else{
                double x0, x1 = 0, x2;
                if (delta==0){
                 x0= - parameterB / (2*parameterA);
                 System.out.print("Rozwiązaniem równania jestx=" + x0);
                }
                else
                 x1 = (- parameterB + Math.sqrt(delta)) / (2* parameterA);
                 x2 = (- parameterB - Math.sqrt(delta)) / (2* parameterA);
                 System.out.println("Rozwiązaniem równania są x(1)= " + (int)x1 + " oraz x(2)= " + (int)x2);
            }
        }
    }
    
}
