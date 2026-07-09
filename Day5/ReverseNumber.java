package Day5;
import java.util.*;
public class ReverseNumber {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        int n;
        int rev = 0;
        int last_digit;

        System.out.print("Enter n :");
        n = scanner.nextInt();
        
        while(n>0)
        {
            last_digit = n%10;
            rev = (rev*10)+last_digit;
            n = n/10;
        }
         System.out.println(rev);

        scanner.close();
    }
    
}
