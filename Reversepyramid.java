class Reversepyramid {
  
    
    public static void main(String[] args)
    {
        // Declaring and initializing variable to
        // Size of the pyramid
        int number = 5;
  
        int i = number, j;
  
        // Nested while loops
        // Outer loop
  
        // Till condition holds true
        while (i > 0) {
            j = 0;
  
            // Inner loop
            // Condition check
            while (j++ < number - i) {
                // Print whitespaces
                System.out.print(" ");
            }
  
            j = 0;
  
            // Inner loop
            // Condition check
            while (j++ < (i * 2) - 1) {
                // Print star
                System.out.print("*");
            }
  
                System.out.println();
  
             i--;
        }
    }
}