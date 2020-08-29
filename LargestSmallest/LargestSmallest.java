    import java.util.Scanner;
 
    /* 
     * Java Program that reads five integers and 
     * determines and prints the largest and 
     * smallest integers in the group. 
     *
     */

    public class LargestSmallest
    {
        public static void main (String args[]) {
            Scanner input = new Scanner(System.in);

            int num;
            int highest = Integer.MIN_VALUE;
            int lowest = Integer.MAX_VALUE;

            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter a number:");
                num = input.nextInt();
                
                if (num > highest) {
                    highest = num;
                }

                if (num < lowest) {
                    lowest = num;
                }
            }

            System.out.println("The Largest number is :" + highest);
            System.out.println("The Smallest number is :" + lowest);
        }
    }  
