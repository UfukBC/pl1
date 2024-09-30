package Week37;

public class e05 
{

    public static void main (String args[])
    {
        boolean check1=false;
        boolean check2=false;


       int[] numbers={-1,0,1,9,10};

       for(int i=0;i<numbers.length;i++)
       {
        check1=false;
        check2=false;
        if(numbers[i] > 0)
        {
            System.out.print("|1|");
            check1=true;
        }
        else
        {
            System.out.print("|0|");
        }
        //////////////////////////////////////////////////////// 
        if(numbers[i] < 10)
        {
            System.out.print("|1|");
            check2=true;
        }
        else
        {
            System.out.print("|0|");
        }
        //////////////////////////////////////////////////////// 
        if(check1&&check2==true)
        {
            System.out.print("|1|");
        }
        else
        {
            System.out.print("|0|");
        }
        //////////////////////////////////////////////////////// 
        
        if(!(check1&&check2==true))
        {
            System.out.print("|1|");
        }
        else
        {
            System.out.print("|0|");
        }
        ////////////////////////////////////////////////////////
        if(check1||check2==true)
        {
            System.out.print("|1|\n");
        }
        else
        {
            System.out.print("|0|\n");
        }
       

        
       }

        




    }





}
