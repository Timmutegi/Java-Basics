    import java.util.*;
    
    /*
     * This is a java program
     * that tests the Time Entry class
     *
     * @author Timothy Mbaka
     * 
     * On my honor, as a Carnegie-Mellon Africa student, I have neither
     * given nor received unauthorized assistance on this work. 
     *
     */

    public class TestTimeEntry {
        public static void main(String args[]) {
            
            // create a Time Entry object
            TimeEntry timeEntry = new TimeEntry();

            TimeEntry timeEntry2 = new TimeEntry(15, "This is another object");
            
            // sets the comments for the object
            timeEntry.setComments("This is an object");

            // sets the hoursWorked
            timeEntry.setHoursWorked(12);

            System.out.printf("The comments are: %s%n", timeEntry.getComments());

            // displays the object
            System.out.println(timeEntry);
            System.out.println("**************************************************************");
            System.out.println(timeEntry2);
        }
    }
