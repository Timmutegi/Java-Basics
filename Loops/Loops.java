    /*
     * This is an application that prints out
     * the number of times the loops execute
     * 
     * @author Timothy Mbaka
     * 
     * On my honor, as a Carnegie-Mellon Africa student, I have 
     * neither given nor received any unauthorized assistance.
     *
     */

    public class Loops {

        public static void main(String[] Args) {
            int loop1 = 0;
            int loop2 = 0;
            int loop3 = 0;
            int loop4 = 0;
            int loop6 = 0;
            int loop7 = 0;

            // Loop 1
            for (int i = 1; i <= 10; i++) {
                loop1++;
            }

            // Loop 2
            for (int i = 0; i < 10; i++) {
                loop2++;
            }

            // Loop 3
            for (int i = 10; i > 0; i--) {
                loop3++;
            }

            // Loop 4
            for (int i = -10; i <= 10; i++) {
                loop4++;
            }

            // Loop 6
            for (int i = -10; i <= 10; i += 2) {
                loop6++;
            }

            // Loop 7 
            for (int i = -10; i <= 10; i += 3) {
                loop7++;
            }

            System.out.println("Loop 1 executes " + loop1 + " times");
            System.out.println("Loop 2 executes " + loop2 + " times");
            System.out.println("Loop 3 executes " + loop3 + " times");
            System.out.println("Loop 4 executes " + loop4 + " times");
            System.out.println("Loop 5 is an infinite loop");
            System.out.println("Loop 6 executes " + loop6 + " times");
            System.out.println("Loop 7 executes " + loop7 + " times");
        }
    } 

                

