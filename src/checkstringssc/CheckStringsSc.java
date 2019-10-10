/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkstringssc;

/**
 *
 * @author MC03353
 */

import java.util.Scanner; 
        
public class CheckStringsSc {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
    //User input
    System.out.println("Please enter three letters");
    
    //creating a new scanner and taking input from user
    Scanner sc = new Scanner(System.in); 
        char cLtr1 = sc.next().charAt(0); 
        char cLtr2 = sc.next().charAt(1);
        char cLtr3 = sc.next().charAt(2);
        
    if (cLtr1 == cLtr2 && cLtr1 == cLtr3) {
        System.out.println("All Lettters Match! ");
    }
        else {
        System.out.println("Letters do not match"); 
        }
    
        } //end of main
} // end of class