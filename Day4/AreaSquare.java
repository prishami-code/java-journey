package Day4;
import java.util.Scanner;
public class AreaSquare{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        float side;
        float area;

        System.out.print("Enter Side in cm ");
        side = scanner.nextFloat();

        area = side*side;

        System.out.println("Area = "+ area +"cm²");


        scanner.close();

    }

}