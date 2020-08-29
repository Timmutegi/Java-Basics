    import java.util.Scanner;

    public class PrintName {
        public static void main(String[] Args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Please enter your name: ");
            String name = input.next();

            System.out.println("Your name is:" + name);
        }
    } 
