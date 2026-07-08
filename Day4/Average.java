package Day4;
import java.util.Scanner;

public class Average {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int A;
        int B;
        int C;
        float Average;

        System.out.print("Enter A:");
        A = scanner.nextInt();

        System.out.print("Enter B");
        B = scanner.nextInt();

        System.out.println("Enter C");
        C = scanner.nextInt();

        Average = (A + B + C)/3;
        System.out.println("Average is: "+Average);



        scanner.close();
    }
 }

    

