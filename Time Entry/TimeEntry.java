    import java.util.*;
    
    /*
     * This is a java program that represents
     * an entry in a time sheet.
     *
     * @author Timothy Mbaka
     *
     * On my honor, as a Carnegie-Mellon Africa student,
     * I have neither given nor received unauthorized assistance on this work.
     *
     */

    public class TimeEntry {
        private Date timestamp;     //instance variable
        private double hoursWorked;     //instance variable
        private String comments;        //instance variable

        public TimeEntry() {
            this.timestamp = new Date();
            this.hoursWorked = 0;
            this.comments = "";
        }

        public TimeEntry(double hours, String remarks) {
            hoursWorked = hours;
            comments = remarks;
            timestamp = new Date ();
        }

        // method to set the hoursWorked
        public void setHoursWorked(double hours) {
            hoursWorked = hours;
        }

        // method to set the comments
        public void setComments(String remarks) {
            comments = remarks;
        }

        // method to set the date
        public void setTimestamp(int date) {
            timestamp = new Date(date);
        }

        // method to retrieve the hoursWorked
        public double getHoursWorked() {
            return hoursWorked;
        }
 
        // method to retrieve the comments
        public String getComments() {
            return comments;
        }
 
        // method to retrieve the timestamp 
        public Date getTimestamp() {
            return timestamp;
        }

        public String toString() {
            return hoursWorked + " " + comments + " " + timestamp;
        }
    } 
