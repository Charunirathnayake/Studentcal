
package studentcal2;

import java.util.Scanner;

public class Studentcal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many subjects you want to get the average3");
         int n = input.nextInt();
        
         double [] student = new double [n] ;
                int i;
                double total=0;
                 for(i=0;i<n;i++){ 
   
                     
                     
        System.out.println("Enter the marks");
        student[i]  = input.nextDouble();
         
        total = total + student[i];
        
                  }
                 for(i=0 ;i<n ;i++){
                    System.out.println(student[i]);
                     
                 }
                 System.out.println("Average is"+total/n);
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
