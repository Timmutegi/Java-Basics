    /*
     * This is a java application 
     * that prompts the user for two strings,
     * trims them and then process the two strings.
     *
     * @author Timothy Mbaka
     * 
     * On my honor, as a Carnegie-Mellon Africa student,
     * I have not given or received unauthorized assistance on this work.
     *
     */

    import java.util.*;

    public class playStrings
    {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in); 

            System.out.print("Please enter a string: ");
            String string1 = input.nextLine();

            // Validate that the string has more than 2 characters
            if (string1.length() < 2) {
                System.out.println("The string must have more than 2 characters");
                System.exit(0);
            } else {
                string1 = string1.trim();
            }

            System.out.print("Enter the second string: ");
            String string2 = input.nextLine();

            // Validate that the string is more than 2 characters
            if (string2.length() < 2) {
                System.out.println("The string must have more than 2 characters long");
                System.exit(0);
            } else {
                string2 = string2.trim();
            }
            
            System.out.println("*******************************************************"); 

            String substring1 = string1.substring(0,2);
            String substring2 = string2.substring(string2.length() -2);

            System.out.println("The first string is: " + string1);
            System.out.println("It is " + string1.length() + " characters long");
            System.out.println("The substring of the first two letters is: " + substring1);
            System.out.println();
            
            System.out.println("The second string is: " + string2);
            System.out.println("It is " + string2.length() + " characters long");
            System.out.println("The substring of the last two letters is: " + substring2);
            System.out.println();

            System.out.println("The two strings concatenated are: " + (string1 + string2));
            System.out.println("It is " + (string1.length() + string2.length()) + " characters long");
            System.out.println("The index of the first c in the concatenated string is: " + (string1 + string2).indexOf("c"));
            System.out.println("The combined string with every e replaced with Q is: " + (string1 + string2).replaceAll("[eE]", "Q"));
            System.out.println();

            System.out.println("The two strings concatenated and in all caps is: " + (string1 + string2).toUpperCase());
            System.out.println("The two string concatenated and in all lower case is: " + (string1 + string2).toLowerCase());
             
        }
    } 
