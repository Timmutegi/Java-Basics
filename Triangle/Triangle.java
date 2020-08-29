    import java.io.*;

   /*
    * This is a program that prompts the user to enter a
    * number then prints a triangle using the number entered.
    *
    * @author Timothy Mbaka 
    *
    * On my honor, as a Carnegie-Mellon Africa student, I have neither
    * given nor received unauthorized assistance on this work.
    *
    */

    public class Triangle {
        public static void main(String[] args) throws IOException {

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
  
            String str = "";
            int number;
 
            // Prompts the user for input         
            System.out.print("Please enter a number: ");
            str = input.readLine(); 
            number = Integer.parseInt(str);
                     
            // Validates if number is less than 0  
            if (number < 0) {
                System.out.println("**** That is not a valid entry ****");
            } else {
                printTriangle(number);
            }
        }

        // Prints a triangle using the input from user
        public static void printTriangle(int num) {
            for(int i = 0; i <= num; i++) {
                printStarLine(i);
            }
            for(int i = num - 1; i >= 1; i--) {
                printStarLine(i);
            }
        }

        // Prints a line of stars
        public static void printStarLine(int numStars) {
            String star = "";
            for(int i = 1; i <= numStars; i++) {
                star += "*";
            }
            System.out.println(star);
        }

    }
