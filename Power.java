class Power extends ConsoleProgram {

  /**
  * Description: Program that compute a power given a base ahd exponent
  * @author: Mr. Fabroa
  */
  
  public void run() {

    double dblBase;
    double dblExponent;
    double dblPow;
    
    // Get base and exponent
    dblBase = readDouble("Enter the base: ");
    dblExponent = readDouble("Enter exponent: ");

    // Compute power
    dblPow = Math.pow(dblBase, dblExponent);

    // Output result
    System.out.println(dblBase + " to the power of " + dblExponent + " is " + dblPow);
  }
}