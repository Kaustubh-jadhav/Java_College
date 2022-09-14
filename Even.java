import java.io.*;
public class Even {
    public static void main (String args[])
    {
        int i ;
        System.out.println("Even number are ");
        for(i = 1 ; i<=50; i++)
        {
            if(i%2==0)
            {
                System.out.println(i+" Even");
            }
            
        }
        System.out.println("Odd number are ");
        for(i = 1 ; i<=50; i++)
        {
            if(i%2!=0)
            {
                System.out.println(i+" Odd");
            }

        }
    }
    
}
