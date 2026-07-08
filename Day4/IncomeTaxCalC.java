package Day4;
import java.util.Scanner;
public class IncomeTaxCalC {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        double income;
        double tax;

        System.out.print("Enter Income in Lakhs : ");
        income= scanner.nextDouble();

        if (income<5){
            tax = 0;
        }
        else if (income>=5 && income<10)
        {
            tax = ((20*income)/100);
        }
        else{
            tax = (30*income)/100;
        }

        System.out.println("Tax is : "+ tax);

        scanner.close();
    }
    
}
