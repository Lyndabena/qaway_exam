package problems.math;

public class MakePyramid {

    /*

    Implement a large Pyramid of stars in the screen with java.

          *
         * *
        * * *
       * * * *
      * * * * *
     * * * * * *

     */

        // Function to demonstrate printing pattern
        public static void PyramidStar(int n)
        {
            int A, B;

            for (A = 0; A < n; A++) {
                for (B = 0; B<= A; B++) {
                    // printing stars
                    System.out.print("* ");
                }

                // end-line
                System.out.println();
            }
        }

        // Driver Function
        public static void main(String args[])
        {
            int k = 5;
            PyramidStar(k);
        }
    }
    public static void main(String[] args) {

        System.out.println("     *");
        System.out.println("    * *");
        System.out.println("   * * *");
        System.out.println("  * * * *");
        System.out.println(" * * * * *");
        System.out.println("* * * * * * ");


    }
}
