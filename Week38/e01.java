package Week38;
import java.util.Scanner;

public class e01 {


    public static void main(String args[]){


        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter your score:");


        int score= scanner.nextInt();

        
        
        if(score>=90){
            System.out.print("Excellent!");
        }
        else if(score>=70){
            System.out.println("Good Job");
        }
        else if(score>=50){
            System.out.println("Needs Improvement");
        }
        else{
            System.out.println("Fail");
        }







    }





    
}
