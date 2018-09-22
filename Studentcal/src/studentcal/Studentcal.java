/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentcal;

/**
 *
 * @author charuni
 */import java.util.Scanner;
public class Studentcal {

    public static void main(String[] args) {
                
                 double [] student = new double [9] ;
                 Scanner input = new Scanner(System.in);
                int i;
                double total=0;
                 for(i=0;i<9;i++){ 
   
        System.out.println("Enter the marks");
        student[i]  = input.nextDouble();
         
        total = total + student[i];
        
                  }
                 for(i=0 ;i<9 ;i++){
                    System.out.println(student[i]);
                     
                 }
                 System.out.println("Average is"+total/9);
    }
    
}
