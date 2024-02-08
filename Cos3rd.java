class Cos3rd extends ConsoleProgram {

  /**
  * Description: Program to get the length of side c given angle C and sides a and b
  * @author: Tate Chin
  */
  
  public void run() {
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblSideC;
    
    // Get side and angle info
    dblSideA = readDouble("Enter the length of Side A: ");
    dblSideB = readDouble("Enter the length of Side B: ");
    dblAngleC = readDouble("Enter the angle of contained angle: ");

    // Compute side C
    dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - 2 * dblSideA * dblSideB * Math.cos(Math.toRadians(dblAngleC)));

    // Output results
    System.out.println("The length of side C is " + dblSideC);
    
  }
}