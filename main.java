/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author thilina udayantha
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;

        int b;

        String operation;
        int answer;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to my calculator");
        System.out.println("Enter first number");
        a=scanner.nextInt();
        System.out.println("Enter secound number");
        b=scanner.nextInt();
        System.out.println("Enter Operation");
        operation=scanner.next();
        
        if("+".equals(operation)){
           answer = add(a,b);
           System.out.println("Answer = "+answer);
            
        }
        else{
            System.out.println("Unsupported operation");
        }
    }
    
    private static int add(int a,int b){
        return a+b;
    }
}
                

