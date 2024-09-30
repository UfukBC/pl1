package Week39;

import java.util.Scanner;

public class e05 {


    public static void main(String args[]){


        Scanner Scan=new Scanner(System.in);


        float avarage=0;
        float total=0;
        int counter=0;
        int input=1;

        while(input!=-1){

            System.out.println("Give a test score (-1 to quit):");
            
            input=Scan.nextInt();


            if(input==-1){
                break;
            }
            else{


                total+=input;
                counter++;
                
                avarage=total/counter;

                System.out.println("The avarage is " +avarage);



            }


            


        }













    }






    
}
