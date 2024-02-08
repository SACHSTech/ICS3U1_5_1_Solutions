class Circumference extends ConsoleProgram {

  /**
  * Compute the circumference of a radius
  * @author: Mr. Fabroa
  */
  
  public void run() {
    double dblRadius;
    double dblCircumference;

    // Get the radius
    dblRadius = readDouble("What is the radius of your circle? ");

    // Compute circumference
    dblCircumference = 2 * Math.PI * dblRadius;

    // Output results
    System.out.println("Your circumference is: " + dblCircumference);
    
  }
}