/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string2integer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author patrickbenitez
 */
public class String2Integer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader console = new BufferedReader(reader);
            
            System.out.println("What is the value of your first number?");
            String input = console.readLine();
            double variable1 = Double.parseDouble(input);
            
            System.out.println("What is the value of your second number?");
            input = console.readLine();
            double variable2 = Double.parseDouble(input);
            
            System.out.println("What type of calculation would you like to do?");
            System.out.println("Type '1' for addition ");
            System.out.println("Type '2' for subtraction ");
            System.out.println("Type '3' for addition ");
            System.out.println("Type '4' for subtraction ");
            input = console.readLine();
            int choice = Integer.parseInt(input);
            
            double answer;
            
            if(choice == 1){
                answer = variable1 + variable2;
                
            }
            else if (choice == 2){
                answer = variable1 - variable2;
            }
            else if (choice ==3){
                answer = variable1 * variable2;
            }
            else {
                answer = variable1 / variable2;
            }
            
            System.out.println("The answer is " + answer);
        }
        
        catch(IOException e){
            System.out.println(e);
            System.exit(1);
        }   
    }
}
