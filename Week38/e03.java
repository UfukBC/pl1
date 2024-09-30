package Week38;
import java.util.Scanner;


public class e03 {


    public static void main(String args[]){


        boolean IsWeekend;

        Scanner scanner =new Scanner(System.in);

        System.out.println("Is Today Weekend:(Y/N)");
        String WeekendInput= scanner.nextLine();

        if(WeekendInput.equals(("Y"))){

           IsWeekend=true;
        }
        else if(WeekendInput.equals("N")){
            System.out.println("U don't have a discount");
            
        }
        else{
            System.out.println("U didn't give a valid answer");
        }

        

        System.out.println("Enter your age:");
    
        int age= scanner.nextInt();


        if((age<18||age>65)){

        }

        

        
//to be countibued


        










        }







    }









    

