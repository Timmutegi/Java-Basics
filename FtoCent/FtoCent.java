import java.util.Scanner;

public class FtoCent {

    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        
        int number, result;
 
        System.out.println("Enter the number to convert to centigrade: ");
        number = input.nextInt();
        result = (number - 32) * (5/9);
        System.out.println(number + " Farenheit is equal to " + result + " centigrade");
    }
} 
