import java.util.Scanner;
public class JavaBasics{
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        short name = scanner.nextShort();
        System.out.println(name);
        scanner.close();

    }
}