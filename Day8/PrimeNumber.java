package Day8;
import java.util.*;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n;
        boolean Is_Prime = true;

        System.out.println("Enter n : ");
        n = scanner.nextInt();

        for (int i = 2 ; i <= Math.sqrt(n) ; i++){
            if (n%i == 0 )
            {
                Is_Prime = false; 

            }
        }
        if(Is_Prime){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Not Prime");
        }

        scanner.close();
    }
}