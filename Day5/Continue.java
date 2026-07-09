package Day5;
import java.util.Scanner;
public class Continue {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        int n ;

        do {
             System.out.println("Enter n : ");
             n= scanner.nextInt();

              if (n == -1){
                break;
             }


             if (n%10 == 0){
                continue;
             }

             System.out.println(n);
            }
        while(true);
        scanner.close();
    } 
}
