/*
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
 */
package sptv21game;

import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author user
 * 
 */
public class SPTV21Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int cash = 3;
        do{
            System.out.println("---- New run ----");
            System.out.println("cash = "+cash);
            int myNumber = random.nextInt(11);
            int k = 0;
            do{
                System.out.print("Pick a number between 0 and 10: ");
                int yourNumber = scanner.nextInt();
                if(myNumber == yourNumber){
                    System.out.println("Congrats! You won 1$");
                    cash++;
                    break;
                }else{
                    System.out.println("Nope, it was "+myNumber);
                }
                k++;
                if(k > 2){
                    System.out.println("You lost 1$");
                    cash--;
                    break;
                }
            }while(true);
            System.out.println("To exit press 0, continue - press other key");
            int repeat = scanner.nextInt();
            if(repeat == 0 || cash == 0){
                System.out.printf("U got %d USD%n",cash);
                break;
            }
        }while(true);
        
    }
}