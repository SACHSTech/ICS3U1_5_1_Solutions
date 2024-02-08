class Rads extends ConsoleProgram {

  /**
  * Description: Program that takes degrees from the user and converts to radians
  * @author: Mr. Fabroa
  */
  
  public void run() {

    double dblDegrees;
    double dblRadians;
    
    // Get degrees 
    dblDegrees = readDouble("Enter the angle in degrees: ");

    // Convert to radians
    dblRadians  = Math.toRadians(dblDegrees);
    
    // Output radians
    System.out.println(dblDegrees + " degrees = " + dblRadians + " radians");
  }
}