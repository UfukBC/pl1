package Week39;

import java.util.Random;
import java.util.Scanner;

public class e06 {
    
    public static void main(String args[]){


        int input=11;

       Scanner scan=new Scanner(System.in);

       Random rand = new Random();

       int RandInt=rand.nextInt(0,10);

       System.out.println("Guess the number");

       while(input!=RandInt){


        input=scan.nextInt();

        if(input>RandInt){
            System.out.println("The guess is to high");
        }
        else if(input<RandInt){
            System.out.println("The guess is to low");
        }

        else{
            System.out.println("Well Done!!!");
            break;
        }

       }











    }



}
