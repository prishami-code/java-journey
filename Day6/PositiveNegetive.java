package Day6;
import java.util.*;
public class PositiveNegetive {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner (System.in);

        int n ;

        System.out.println("Enter Number");
        n= scanner.nextInt();

        if (n>0){
            System.out.println("Positive");
        }
        else if (n<0){
            System.out.println("Negetive");
        }
        else{
            System.out.println("Zero");
        }

        scanner.close();
    }
    
}
